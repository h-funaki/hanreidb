/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.plugin;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.lastaflute.core.direction.AccessibleConfig;
import org.lastaflute.core.util.ContainerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SolrTestPlugin implements TestPlugin {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(SolrTestPlugin.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected boolean started;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public static SolrTestPlugin build() {
        SolrTestPlugin plugin = new SolrTestPlugin();
        return plugin;
    }

    @Override
    public void setUp() {
        startSolr();
    }

    @Override
    public void tearDown() {
        stopSolr();
    }

    // ===================================================================================
    //                                                                             Server
    //                                                                             =======
    protected void startSolr() {
        // XXX awane 実際の設定を読むように変えました。ただし、gradle側の処理と冗長に。条件無しで、gradleを呼べば冗長処理はなくなりますが、実行速度が大分遅い。 (2017/02/17)
        final AccessibleConfig config = ContainerUtil.getComponent(AccessibleConfig.class);
        Set<String> propKeySet = config.keySet();
        propKeySet.forEach(propKey -> {
            if (!propKey.matches("solr\\.[^\\.]+\\.url")) {
                return;
            }
            String url = config.get(propKey);
            Matcher matcher = Pattern.compile(".+://localhost:(\\d+).+").matcher(url);
            if (!matcher.matches() || matcher.groupCount() != 1) {
                return;
            }

            int port = Integer.parseInt(matcher.group(1));

            if (isAddressAlreadyInUse("localhost", port)) {
                logger.info("Solr(localhost:{}) は既に起動中のためプラグインからは起動しません。", port);
                return;
            }
            started = true;
            logger.info("Solr(localhost:{}) を起動します。", port);
            try {
                gradleExecute(gradleCommand(), "solrStart");
                // XXX awane 暫定対応。gradleから戻ってきても、solrが完全に起動していないため、5秒ウエイトする。 (2017/02/07)
                Thread.sleep(5000L);
            } catch (Exception e) {
                throw new IllegalStateException("Solr の起動に失敗しました。", e);
            }
        });
    }

    protected void stopSolr() {
        if (!started) {
            logger.info("Solr は既に起動中のためプラグインからは停止しません。");
            return;
        }
        logger.info("Solr を停止します。");
        try {
            gradleExecute(gradleCommand(), "solrStop");
        } catch (Exception e) {
            throw new IllegalStateException("Solr の停止に失敗しました。", e);
        }
    }
}
