package tech.law.hanreidb.app.web.law.list.put;

/**
 * @author h-funaki
 */
public class LawListPutContentResult {

    /** 計画件数 e.g. 1 */
    public int planned;

    /** 成功件数 e.g. 1 */
    public int successed;

    /** エラー件数 e.g. 1 */
    public int errored;

    /** スキップ件数 e.g. 1 */
    public int skipped;
}
