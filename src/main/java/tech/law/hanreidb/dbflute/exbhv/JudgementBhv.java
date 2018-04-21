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
package tech.law.hanreidb.dbflute.exbhv;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.isBlank;

import org.dbflute.optional.OptionalEntity;

import tech.law.hanreidb.app.base.exception.HanreidbSystemException;
import tech.law.hanreidb.dbflute.bsbhv.BsJudgementBhv;
import tech.law.hanreidb.dbflute.cbean.JudgementCB;
import tech.law.hanreidb.dbflute.exentity.Judgement;

/**
 * The behavior of JUDGEMENT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class JudgementBhv extends BsJudgementBhv {

    /**
     * PKから公開コードを取得する
     * @param judgementId 判決pk (NotNull)
     * @return 判決公開コード (NotNull)
     */
    public String selectJudgementPublicCode(Long judgementId) {
        if (judgementId == null) {
            throw new HanreidbSystemException("judgementIdがnull");
        }
        return selectEntityWithDeletedCheck(cb -> {
            cb.specify().columnJudgementPublicCode();
            cb.query().setJudgementId_Equal(judgementId);
        }).getJudgementPublicCode();
    }

    /**
     * 公開コードからPKを取得する
     * @param judgementPublicCode 公開コード (NotNull)
     * @return 判決pk (NotNull)
     */
    public Long selectJudgementId(String judgementPublicCode) {
        if (judgementPublicCode == null) {
            throw new HanreidbSystemException("judgementIdがnull");
        }
        return selectEntityWithDeletedCheck(cb -> {
            cb.specify().columnJudgementId();
            cb.query().setJudgementPublicCode_Equal(judgementPublicCode);
        }).getJudgementId();
    }

    /**
     * 公開コードから上訴審のエンティティを取得する
     * @param judgementPublicCode 判決pk (NotNull)
     * @return 上訴審のエンティティ (NullAllowed)
     */
    public OptionalEntity<Judgement> selectAppealJudgementPublicCode(String judgementPublicCode) {
        if (isBlank(judgementPublicCode)) {
            throw new HanreidbSystemException("judgementPublicCodeがblank");
        }
        OptionalEntity<Judgement> judgement = selectEntity(cb -> {
            setUpTables(cb);
            cb.query().queryJudgementSelf().setJudgementPublicCode_Equal(judgementPublicCode);
        });
        judgement.ifPresent(entity -> {
            loadTables(entity);
        });
        return judgement;
    }

    /**
     * 公開コードから判決エンティティとその関連データを取得する
     * @param judgementPublicCode 判決pk (NotNull)
     * @return 判決エンティティ (NullAllowed)
     */
    public Judgement selectJudgement(String judgementPublicCode) {
        if (isBlank(judgementPublicCode)) {
            throw new HanreidbSystemException("judgementPublicCodeがblank");
        }
        Judgement judgement = selectEntityWithDeletedCheck(cb -> {
            cb.acceptUniqueOf(judgementPublicCode);
            setUpTables(cb);
        });
        loadTables(judgement);
        return judgement;
    }

    // ===================================================================================
    //                                                                              Set Up
    //                                                                              ======
    private void setUpTables(JudgementCB cb) {
        cb.setupSelect_CaseMark();

        cb.setupSelect_CaseMark().withClsCaseCategory();

        cb.setupSelect_CaseMark().withClsCourtType();

        cb.setupSelect_Court();

        cb.setupSelect_ClsJudgementResult();

        cb.setupSelect_ClsJudgementType();

        cb.setupSelect_ClsBench();

        cb.setupSelect_JudgementSelf().withCaseMark();
    }

    // ===================================================================================
    //                                                                                Load
    //                                                                                ====
    private void loadTables(Judgement judgement) {
        load(judgement, baseLoader -> {
            baseLoader.loadJudgementReportRel(reportRelCB -> {
                reportRelCB.setupSelect_Report();
            });
            baseLoader.loadJudgementSourceRel(sourceRelCB -> {
                sourceRelCB.setupSelect_ClsSource();
            });
        });
    }
}
