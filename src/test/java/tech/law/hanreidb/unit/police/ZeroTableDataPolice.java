/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.dbflute.Entity;
import org.dbflute.bhv.BehaviorReadable;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.lastaflute.core.util.ContainerUtil;

/**
 * データゼロ件のテーブルを逮捕する。
 * @author mito
 */
public class ZeroTableDataPolice {

    private final Map<String, DBMeta> metaMap;

    private String ignoreTableNamePrefix;

    private List<Class<? extends Entity>> ignoreTableList = newArrayList();

    public ZeroTableDataPolice(Map<String, DBMeta> metaMap) {
        this.metaMap = metaMap;
    }

    public void execute() {
        List<DBMeta> metaList = getZeroTableList();

        if (!metaList.isEmpty()) {
            throwException(metaList);
        }
    }

    protected List<DBMeta> getZeroTableList() {
        List<DBMeta> zeroTableList = newArrayList();
        for (DBMeta dbmeta : metaMap.values()) {
            String tableName = dbmeta.getTableDbName();

            if (ignoreTableNamePrefix != null && tableName.toLowerCase().startsWith(ignoreTableNamePrefix)) {
                continue;
            }

            if (!ignoreTableList.isEmpty() && ignoreTableList.contains(dbmeta.getEntityType())) {
                continue;
            }

            BehaviorSelector behaviorSelector = ContainerUtil.getComponent(BehaviorSelector.class);
            BehaviorReadable readable = behaviorSelector.byName(tableName);
            int count = readable.readCount(readable.newConditionBean());
            if (count == 0) {
                zeroTableList.add(dbmeta);
            }
        }

        return zeroTableList;
    }

    @SuppressWarnings("unchecked")
    public ZeroTableDataPolice setIgnoreTable(Class<? extends Entity>... entities) {
        ignoreTableList = Arrays.asList(entities);
        return this;
    }

    public ZeroTableDataPolice setIgnoreTableStartsWith(String prefix) {
        ignoreTableNamePrefix = prefix.toLowerCase();
        return this;
    }

    protected void throwException(List<DBMeta> metaList) {
        String detail = metaList.stream().map(meta -> meta.getTableDbName()).collect(Collectors.joining("\n"));

        final ExceptionMessageBuilder br = new ExceptionMessageBuilder();
        br.addNotice("テーブル内のレコードが0件のテーブルが見つかりました。");
        br.addItem("Detail");
        br.addElement(detail);
        final String msg = br.buildExceptionMessage();
        throw new IllegalStateException(msg);
    }
}
