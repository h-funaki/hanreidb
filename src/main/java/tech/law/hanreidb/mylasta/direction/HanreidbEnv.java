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

import org.lastaflute.core.direction.ObjectiveConfig;
import org.lastaflute.core.direction.exception.ConfigPropertyNotFoundException;

/**
 * @author FreeGen
 */
public interface HanreidbEnv {

    /** The key of the configuration. e.g. hot */
    String lasta_di_SMART_DEPLOY_MODE = "lasta_di.smart.deploy.mode";

    /** The key of the configuration. e.g. true */
    String DEVELOPMENT_HERE = "development.here";

    /** The key of the configuration. e.g. Local Development */
    String ENVIRONMENT_TITLE = "environment.title";

    /** The key of the configuration. e.g. false */
    String FRAMEWORK_DEBUG = "framework.debug";

    /** The key of the configuration. e.g. 0 */
    String TIME_ADJUST_TIME_MILLIS = "time.adjust.time.millis";

    /** The key of the configuration. e.g. debug */
    String LOG_LEVEL = "log.level";

    /** The key of the configuration. e.g. debug */
    String LOG_CONSOLE_LEVEL = "log.console.level";

    /** The key of the configuration. e.g. /tmp/lastaflute/hanreidb */
    String LOG_FILE_BASEDIR = "log.file.basedir";

    /** The key of the configuration. e.g. /Users/h-funaki/Documents/hanreidb_development/court/recorder/ */
    String LOG_COURT_JOB_RECORDER_FILE_BASEDIR = "log.court.job.recorder.file.basedir";

    /** The key of the configuration. e.g. true */
    String MAIL_SEND_MOCK = "mail.send.mock";

    /** The key of the configuration. e.g. localhost:25 */
    String MAIL_SMTP_SERVER_MAIN_HOST_AND_PORT = "mail.smtp.server.main.host.and.port";

    /** The key of the configuration. e.g. [Test] */
    String MAIL_SUBJECT_TEST_PREFIX = "mail.subject.test.prefix";

    /** The key of the configuration. e.g. returnpath@hanreidb.law.tech */
    String MAIL_RETURN_PATH = "mail.return.path";

    /** The key of the configuration. e.g. hanreidb-support@annie.example.com */
    String MAIL_ADDRESS_SUPPORT = "mail.address.support";

    /** The key of the configuration. e.g. /Users/h-funaki/Documents/hanreidb_development/court/html/ */
    String COURT_HTML_PATH = "court.html.path";

    /** The key of the configuration. e.g. /Users/h-funaki/Documents/hanreidb_development/court/pdf/ */
    String COURT_PDF_PATH = "court.pdf.path";

    /** The key of the configuration. e.g. com.mysql.jdbc.Driver */
    String JDBC_DRIVER = "jdbc.driver";

    /** The key of the configuration. e.g. jdbc:mysql://localhost:3306/hanreidb */
    String JDBC_URL = "jdbc.url";

    /** The key of the configuration. e.g. root */
    String JDBC_USER = "jdbc.user";

    /** The key of the configuration. e.g.  */
    String JDBC_PASSWORD = "jdbc.password";

    /** The key of the configuration. e.g. 10 */
    String JDBC_CONNECTION_POOLING_SIZE = "jdbc.connection.pooling.size";

    /** The key of the configuration. e.g. localhost:8090/hanreidb */
    String SERVER_DOMAIN = "server.domain";

    /** The key of the configuration. e.g. http://localhost:3000 */
    String CORS_URL = "cors.url";

    /**
     * Get the value of property as {@link String}.
     * @param propertyKey The key of the property. (NotNull)
     * @return The value of found property. (NotNull: if not found, exception)
     * @throws ConfigPropertyNotFoundException When the property is not found.
     */
    String get(String propertyKey);

    /**
     * Is the property true?
     * @param propertyKey The key of the property which is boolean type. (NotNull)
     * @return The determination, true or false. (if not found, exception)
     * @throws ConfigPropertyNotFoundException When the property is not found.
     */
    boolean is(String propertyKey);

    /**
     * Get the value for the key 'lasta_di.smart.deploy.mode'. <br>
     * The value is, e.g. hot <br>
     * comment: The mode of Lasta Di's smart-deploy, should be cool in production (e.g. hot, cool, warm)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getLastaDiSmartDeployMode();

    /**
     * Get the value for the key 'development.here'. <br>
     * The value is, e.g. true <br>
     * comment: Is development environment here? (used for various purpose, you should set false if unknown)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getDevelopmentHere();

    /**
     * Is the property for the key 'development.here' true? <br>
     * The value is, e.g. true <br>
     * comment: Is development environment here? (used for various purpose, you should set false if unknown)
     * @return The determination, true or false. (if not found, exception but basically no way)
     */
    boolean isDevelopmentHere();

    /**
     * Get the value for the key 'environment.title'. <br>
     * The value is, e.g. Local Development <br>
     * comment: The title of environment (e.g. local or integartion or production)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getEnvironmentTitle();

    /**
     * Get the value for the key 'framework.debug'. <br>
     * The value is, e.g. false <br>
     * comment: Does it enable the Framework internal debug? (true only when emergency)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getFrameworkDebug();

    /**
     * Is the property for the key 'framework.debug' true? <br>
     * The value is, e.g. false <br>
     * comment: Does it enable the Framework internal debug? (true only when emergency)
     * @return The determination, true or false. (if not found, exception but basically no way)
     */
    boolean isFrameworkDebug();

    /**
     * Get the value for the key 'time.adjust.time.millis'. <br>
     * The value is, e.g. 0 <br>
     * comment: The milliseconds for (relative or absolute) adjust time (set only when test) @LongType *dynamic in development
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getTimeAdjustTimeMillis();

    /**
     * Get the value for the key 'time.adjust.time.millis' as {@link Long}. <br>
     * The value is, e.g. 0 <br>
     * comment: The milliseconds for (relative or absolute) adjust time (set only when test) @LongType *dynamic in development
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     * @throws NumberFormatException When the property is not long.
     */
    Long getTimeAdjustTimeMillisAsLong();

    /**
     * Get the value for the key 'log.level'. <br>
     * The value is, e.g. debug <br>
     * comment: The log level for logback
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getLogLevel();

    /**
     * Get the value for the key 'log.console.level'. <br>
     * The value is, e.g. debug <br>
     * comment: The log console level for logback
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getLogConsoleLevel();

    /**
     * Get the value for the key 'log.file.basedir'. <br>
     * The value is, e.g. /tmp/lastaflute/hanreidb <br>
     * comment: The log file basedir
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getLogFileBasedir();

    /**
     * Get the value for the key 'log.court.job.recorder.file.basedir'. <br>
     * The value is, e.g. /Users/h-funaki/Documents/hanreidb_development/court/recorder/ <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getLogCourtJobRecorderFileBasedir();

    /**
     * Get the value for the key 'mail.send.mock'. <br>
     * The value is, e.g. true <br>
     * comment: Does it send mock mail? (true: no send actually, logging only)
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getMailSendMock();

    /**
     * Is the property for the key 'mail.send.mock' true? <br>
     * The value is, e.g. true <br>
     * comment: Does it send mock mail? (true: no send actually, logging only)
     * @return The determination, true or false. (if not found, exception but basically no way)
     */
    boolean isMailSendMock();

    /**
     * Get the value for the key 'mail.smtp.server.main.host.and.port'. <br>
     * The value is, e.g. localhost:25 <br>
     * comment: SMTP server settings for main: host:port
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getMailSmtpServerMainHostAndPort();

    /**
     * Get the value for the key 'mail.subject.test.prefix'. <br>
     * The value is, e.g. [Test] <br>
     * comment: The prefix of subject to show test environment or not
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getMailSubjectTestPrefix();

    /**
     * Get the value for the key 'mail.return.path'. <br>
     * The value is, e.g. returnpath@hanreidb.law.tech <br>
     * comment: The common return path of all mail
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getMailReturnPath();

    /**
     * Get the value for the key 'mail.address.support'. <br>
     * The value is, e.g. hanreidb-support@annie.example.com <br>
     * comment: Mail Address for Hanreidb Support
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getMailAddressSupport();

    /**
     * Get the value for the key 'court.html.path'. <br>
     * The value is, e.g. /Users/h-funaki/Documents/hanreidb_development/court/html/ <br>
     * comment: ------
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getCourtHtmlPath();

    /**
     * Get the value for the key 'court.pdf.path'. <br>
     * The value is, e.g. /Users/h-funaki/Documents/hanreidb_development/court/pdf/ <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getCourtPdfPath();

    /**
     * Get the value for the key 'jdbc.driver'. <br>
     * The value is, e.g. com.mysql.jdbc.Driver <br>
     * comment: The driver FQCN to connect database for JDBC
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getJdbcDriver();

    /**
     * Get the value for the key 'jdbc.url'. <br>
     * The value is, e.g. jdbc:mysql://localhost:3306/hanreidb <br>
     * comment: The URL of database connection for JDBC
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getJdbcUrl();

    /**
     * Get the value for the key 'jdbc.user'. <br>
     * The value is, e.g. root <br>
     * comment: The user of database connection for JDBC
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getJdbcUser();

    /**
     * Get the value for the key 'jdbc.password'. <br>
     * The value is, e.g.  <br>
     * comment: @Secure The password of database connection for JDBC
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getJdbcPassword();

    /**
     * Get the value for the key 'jdbc.password' as {@link Integer}. <br>
     * The value is, e.g.  <br>
     * comment: @Secure The password of database connection for JDBC
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     * @throws NumberFormatException When the property is not integer.
     */
    Integer getJdbcPasswordAsInteger();

    /**
     * Get the value for the key 'jdbc.connection.pooling.size'. <br>
     * The value is, e.g. 10 <br>
     * comment: The (max) pooling size of connection pool
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getJdbcConnectionPoolingSize();

    /**
     * Get the value for the key 'jdbc.connection.pooling.size' as {@link Integer}. <br>
     * The value is, e.g. 10 <br>
     * comment: The (max) pooling size of connection pool
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     * @throws NumberFormatException When the property is not integer.
     */
    Integer getJdbcConnectionPoolingSizeAsInteger();

    /**
     * Get the value for the key 'server.domain'. <br>
     * The value is, e.g. localhost:8090/hanreidb <br>
     * comment: domain to access this application from internet, e.g. for registration mail
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getServerDomain();

    /**
     * Get the value for the key 'cors.url'. <br>
     * The value is, e.g. http://localhost:3000 <br>
     * @return The value of found property. (NotNull: if not found, exception but basically no way)
     */
    String getCorsUrl();

    /**
     * The simple implementation for configuration.
     * @author FreeGen
     */
    public static class SimpleImpl extends ObjectiveConfig implements HanreidbEnv {

        /** The serial version UID for object serialization. (Default) */
        private static final long serialVersionUID = 1L;

        public String getLastaDiSmartDeployMode() {
            return get(HanreidbEnv.lasta_di_SMART_DEPLOY_MODE);
        }

        public String getDevelopmentHere() {
            return get(HanreidbEnv.DEVELOPMENT_HERE);
        }

        public boolean isDevelopmentHere() {
            return is(HanreidbEnv.DEVELOPMENT_HERE);
        }

        public String getEnvironmentTitle() {
            return get(HanreidbEnv.ENVIRONMENT_TITLE);
        }

        public String getFrameworkDebug() {
            return get(HanreidbEnv.FRAMEWORK_DEBUG);
        }

        public boolean isFrameworkDebug() {
            return is(HanreidbEnv.FRAMEWORK_DEBUG);
        }

        public String getTimeAdjustTimeMillis() {
            return get(HanreidbEnv.TIME_ADJUST_TIME_MILLIS);
        }

        public Long getTimeAdjustTimeMillisAsLong() {
            return getAsLong(HanreidbEnv.TIME_ADJUST_TIME_MILLIS);
        }

        public String getLogLevel() {
            return get(HanreidbEnv.LOG_LEVEL);
        }

        public String getLogConsoleLevel() {
            return get(HanreidbEnv.LOG_CONSOLE_LEVEL);
        }

        public String getLogFileBasedir() {
            return get(HanreidbEnv.LOG_FILE_BASEDIR);
        }

        public String getLogCourtJobRecorderFileBasedir() {
            return get(HanreidbEnv.LOG_COURT_JOB_RECORDER_FILE_BASEDIR);
        }

        public String getMailSendMock() {
            return get(HanreidbEnv.MAIL_SEND_MOCK);
        }

        public boolean isMailSendMock() {
            return is(HanreidbEnv.MAIL_SEND_MOCK);
        }

        public String getMailSmtpServerMainHostAndPort() {
            return get(HanreidbEnv.MAIL_SMTP_SERVER_MAIN_HOST_AND_PORT);
        }

        public String getMailSubjectTestPrefix() {
            return get(HanreidbEnv.MAIL_SUBJECT_TEST_PREFIX);
        }

        public String getMailReturnPath() {
            return get(HanreidbEnv.MAIL_RETURN_PATH);
        }

        public String getMailAddressSupport() {
            return get(HanreidbEnv.MAIL_ADDRESS_SUPPORT);
        }

        public String getCourtHtmlPath() {
            return get(HanreidbEnv.COURT_HTML_PATH);
        }

        public String getCourtPdfPath() {
            return get(HanreidbEnv.COURT_PDF_PATH);
        }

        public String getJdbcDriver() {
            return get(HanreidbEnv.JDBC_DRIVER);
        }

        public String getJdbcUrl() {
            return get(HanreidbEnv.JDBC_URL);
        }

        public String getJdbcUser() {
            return get(HanreidbEnv.JDBC_USER);
        }

        public String getJdbcPassword() {
            return get(HanreidbEnv.JDBC_PASSWORD);
        }

        public Integer getJdbcPasswordAsInteger() {
            return getAsInteger(HanreidbEnv.JDBC_PASSWORD);
        }

        public String getJdbcConnectionPoolingSize() {
            return get(HanreidbEnv.JDBC_CONNECTION_POOLING_SIZE);
        }

        public Integer getJdbcConnectionPoolingSizeAsInteger() {
            return getAsInteger(HanreidbEnv.JDBC_CONNECTION_POOLING_SIZE);
        }

        public String getServerDomain() {
            return get(HanreidbEnv.SERVER_DOMAIN);
        }

        public String getCorsUrl() {
            return get(HanreidbEnv.CORS_URL);
        }
    }
}
