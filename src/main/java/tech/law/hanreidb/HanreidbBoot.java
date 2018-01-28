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
package tech.law.hanreidb;

import org.dbflute.jetty.JettyBoot;

/**
 * @author jflute
 */
public class HanreidbBoot extends JettyBoot {
    public HanreidbBoot(int port, String contextPath) {
        super(port, contextPath);
        // TODO Auto-generated constructor stub
    }

    // #change_it_first

    @Override
    protected String getServerHost() {
        // TODO Auto-generated method stub
        return "*";
    }

    public static void main(String[] args) { // e.g. java -Dlasta.env=production -jar hanreidb.war
        new JettyBoot(9001, "/hanreidb").asDevelopment(isDevelopment()).bootAwait();
    }

    private static boolean isDevelopment() {
        return System.getProperty("lasta.env") == null;
    }
}
