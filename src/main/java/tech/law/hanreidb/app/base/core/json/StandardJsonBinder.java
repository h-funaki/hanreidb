/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.core.json;

import java.util.Arrays;
import java.util.List;

import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Lists;
import org.lastaflute.core.json.JsonMappingOption;
import org.lastaflute.core.json.bind.JsonYourCollectionResource;

/**
 * U-NEXTで標準的な JSON のバインディングに関する処理をする人。<br>
 * 基本的にunext-common内での再利用のためなので、あまりアプリがこれを直接呼ぶことは想定しない。<br>
 * ちなみに、Eclipse Collections の設定をきっかけに作ったが、もうそれっきりかもしれない。(2017/04/30)
 * @author mito
 * @author jflute
 */
public class StandardJsonBinder {

    /**
     * 基本的な、JSONのマッピングオプションをセットアップする。
     * @param option セットアップされるオプション (NotNull)
     * @return 引数で指定されたオプション、本来不要だがチェーンさせやすいように (NotNull)
     */
    public static JsonMappingOption setupBasicMapping(JsonMappingOption option) {
        // LastaFluteでは、独自の Collections をマッピング対象にできるオプションがある
        return option.yourCollections(prepareYourCollections());
    }

    private static List<JsonYourCollectionResource> prepareYourCollections() {
        return Arrays.asList(new JsonYourCollectionResource(ImmutableList.class, mutableList -> {
            return Lists.immutable.withAll(mutableList);
        }));
    }
}
