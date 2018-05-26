package tech.law.hanreidb.app.web.law.alias.put;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.toImmutable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.annotation.Resource;

import org.eclipse.collections.api.list.ImmutableList;
import org.lastaflute.web.Execute;
import org.lastaflute.web.response.JsonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.HanreidbBaseAction;
import tech.law.hanreidb.dbflute.exbhv.LawAliasBhv;
import tech.law.hanreidb.dbflute.exbhv.LawBhv;
import tech.law.hanreidb.dbflute.exentity.LawAlias;

/**
 * @author h-funaki
 */
public class LawAliasPutAction extends HanreidbBaseAction {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(LawAliasPutAction.class);

    private static final String FILE_PATH = "/Users/h-funaki/Documents/hanreidb/dbflute_hanreidb/playsql/data/ut/law_alias.tsv";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private LawAliasBhv lawAliasBhv;
    @Resource
    private LawBhv lawBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<LawAliasPutContentResult> index() throws FileNotFoundException {
        int count = 0;
        File file = new File(FILE_PATH);
        FileInputStream stream = new FileInputStream(file);

        return asJson(mappingToContent(count));
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    private ImmutableList<LawAlias> selectLawAliasList() {

        return toImmutable(lawAliasBhv.selectList(cb -> {
            cb.specify().everyColumn();
        }));
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    private LawAliasPutContentResult mappingToContent(int count) {
        LawAliasPutContentResult content = new LawAliasPutContentResult();
        content.count = count;
        return content;
    }

    // ===================================================================================
    //                                                                              Result
    //                                                                              ======
    public static class LawAliasPutContentResult {
        public int count;
    }
}
