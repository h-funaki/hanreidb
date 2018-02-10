/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package tech.law.hanreidb.mylasta.direction;

import javax.annotation.Resource;

import org.lastaflute.core.direction.CachedFwAssistantDirector;
import org.lastaflute.core.direction.CurtainBeforeHook;
import org.lastaflute.core.direction.FwAssistDirection;
import org.lastaflute.core.direction.FwCoreDirection;
import org.lastaflute.core.json.JsonResourceProvider;
import org.lastaflute.core.security.InvertibleCryptographer;
import org.lastaflute.core.security.OneWayCryptographer;
import org.lastaflute.core.security.SecurityResourceProvider;
import org.lastaflute.core.time.TimeResourceProvider;
import org.lastaflute.db.dbflute.classification.ListedClassificationProvider;
import org.lastaflute.db.direction.FwDbDirection;
import org.lastaflute.thymeleaf.ThymeleafRenderingProvider;
import org.lastaflute.web.api.ApiFailureHook;
import org.lastaflute.web.direction.FwWebDirection;
import org.lastaflute.web.path.ActionAdjustmentProvider;
import org.lastaflute.web.ruts.multipart.MultipartResourceProvider;
import org.lastaflute.web.ruts.renderer.HtmlRenderingProvider;
import org.lastaflute.web.servlet.cookie.CookieResourceProvider;
import org.lastaflute.web.servlet.filter.cors.CorsHook;
import org.lastaflute.web.servlet.request.UserLocaleProcessProvider;
import org.lastaflute.web.servlet.request.UserTimeZoneProcessProvider;

import tech.law.hanreidb.HanreidbBoot;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbActionAdjustmentProvider;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbApiFailureHook;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbCookieResourceProvider;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbCurtainBeforeHook;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbJsonResourceProvider;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbListedClassificationProvider;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbMailDeliveryDepartmentCreator;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbMultipartRequestHandler;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbSecurityResourceProvider;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbTimeResourceProvider;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbUserLocaleProcessProvider;
import tech.law.hanreidb.mylasta.direction.sponsor.HanreidbUserTimeZoneProcessProvider;

/**
 * @author jflute
 */
public class HanreidbFwAssistantDirector extends CachedFwAssistantDirector {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private HanreidbConfig config;

    // ===================================================================================
    //                                                                              Assist
    //                                                                              ======
    @Override
    protected void prepareAssistDirection(FwAssistDirection direction) {
        direction.directConfig(nameList -> nameList.add("hanreidb_config.properties"), "hanreidb_env.properties");
    }

    // ===================================================================================
    //                                                                               Core
    //                                                                              ======
    @Override
    protected void prepareCoreDirection(FwCoreDirection direction) {
        // this configuration is on hanreidb_env.properties because this is true only when development
        direction.directDevelopmentHere(config.isDevelopmentHere());

        // titles of the application for logging are from configurations
        direction.directLoggingTitle(config.getDomainTitle(), config.getEnvironmentTitle());

        // this configuration is on sea_env.properties because it has no influence to production
        // even if you set true manually and forget to set false back
        direction.directFrameworkDebug(config.isFrameworkDebug()); // basically false

        // you can add your own process when your application is booting
        direction.directCurtainBefore(createCurtainBeforeHook());

        direction.directSecurity(createSecurityResourceProvider());
        direction.directTime(createTimeResourceProvider());
        direction.directJson(createJsonResourceProvider());
        direction.directMail(createMailDeliveryDepartmentCreator().create());
    }

    protected CurtainBeforeHook createCurtainBeforeHook() {
        return new HanreidbCurtainBeforeHook();
    }

    protected SecurityResourceProvider createSecurityResourceProvider() { // #change_it_first
        final InvertibleCryptographer inver = InvertibleCryptographer.createAesCipher("hanreidb:dockside:");
        final OneWayCryptographer oneWay = OneWayCryptographer.createSha256Cryptographer();
        return new HanreidbSecurityResourceProvider(inver, oneWay);
    }

    protected TimeResourceProvider createTimeResourceProvider() {
        return new HanreidbTimeResourceProvider(config);
    }

    protected JsonResourceProvider createJsonResourceProvider() {
        return new HanreidbJsonResourceProvider();
    }

    protected HanreidbMailDeliveryDepartmentCreator createMailDeliveryDepartmentCreator() {
        return new HanreidbMailDeliveryDepartmentCreator(config);
    }

    // ===================================================================================
    //                                                                                 DB
    //                                                                                ====
    @Override
    protected void prepareDbDirection(FwDbDirection direction) {
        direction.directClassification(createListedClassificationProvider());
    }

    protected ListedClassificationProvider createListedClassificationProvider() {
        return new HanreidbListedClassificationProvider();
    }

    // ===================================================================================
    //                                                                                Web
    //                                                                               =====
    @Override
    protected void prepareWebDirection(FwWebDirection direction) {
        direction.directRequest(createUserLocaleProcessProvider(), createUserTimeZoneProcessProvider());
        direction.directCookie(createCookieResourceProvider());
        direction.directAdjustment(createActionAdjustmentProvider());
        direction.directMessage(nameList -> nameList.add("hanreidb_message"), "hanreidb_label");
        direction.directApiCall(createApiFailureHook());
        direction.directHtmlRendering(createHtmlRenderingProvider());
        direction.directMultipart(createMultipartResourceProvider());
            direction.directCors(new CorsHook("http://localhost:3000"));
            direction.directCors(new CorsHook("http://0.0.0.0:3000"));
    }

    protected UserLocaleProcessProvider createUserLocaleProcessProvider() {
        return new HanreidbUserLocaleProcessProvider();
    }

    protected UserTimeZoneProcessProvider createUserTimeZoneProcessProvider() {
        return new HanreidbUserTimeZoneProcessProvider();
    }

    protected CookieResourceProvider createCookieResourceProvider() { // #change_it_first
        final InvertibleCryptographer cr = InvertibleCryptographer.createAesCipher("dockside:hanreidb:");
        return new HanreidbCookieResourceProvider(config, cr);
    }

    protected ActionAdjustmentProvider createActionAdjustmentProvider() {
        return new HanreidbActionAdjustmentProvider();
    }

    protected ApiFailureHook createApiFailureHook() {
        return new HanreidbApiFailureHook();
    }

    protected HtmlRenderingProvider createHtmlRenderingProvider() {
        return new ThymeleafRenderingProvider().asDevelopment(config.isDevelopmentHere());
    }

    protected MultipartResourceProvider createMultipartResourceProvider() {
        return () -> new HanreidbMultipartRequestHandler();
    }
}
