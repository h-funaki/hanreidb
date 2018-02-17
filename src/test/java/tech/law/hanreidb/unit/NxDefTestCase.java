/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit;

import org.dbflute.utflute.lastaflute.police.ActionComponentPolice;
import org.dbflute.utflute.lastaflute.police.HotDeployDestroyerPolice;
import org.dbflute.utflute.lastaflute.police.InjectedResourceDefinitionPolice;
import org.dbflute.utflute.lastaflute.police.LastaPresentsSomethingPolice;
import org.dbflute.utflute.lastaflute.police.NonActionExtendsActionPolice;
import org.dbflute.utflute.lastaflute.police.NonWebHasWebReferencePolice;
import org.dbflute.utflute.lastaflute.police.WebPackageNinjaReferencePolice;

import tech.law.hanreidb.unit.police.ActionHttpMethodPolice;
import tech.law.hanreidb.unit.police.ActionMethodMappingToContentPolice;
import tech.law.hanreidb.unit.police.ActionPartCreatePolice;
import tech.law.hanreidb.unit.police.CollectionStreamPolice;
import tech.law.hanreidb.unit.police.CommentFormatPolice;
import tech.law.hanreidb.unit.police.ContentResultHierarchyPolice;
import tech.law.hanreidb.unit.police.DateTimeFormatterPolice;
import tech.law.hanreidb.unit.police.DeclareCDefPolice;
import tech.law.hanreidb.unit.police.DotProjectPolice;
import tech.law.hanreidb.unit.police.FlgFieldPolice;
import tech.law.hanreidb.unit.police.FormFieldPolice;
import tech.law.hanreidb.unit.police.IdFieldPolice;
import tech.law.hanreidb.unit.police.JavadocNullDescriptionPolice;
import tech.law.hanreidb.unit.police.JobTestExtendsPolice;
import tech.law.hanreidb.unit.police.JsonDateFormatPatternPolice;
import tech.law.hanreidb.unit.police.JsonResponseReturnTypePolice;
import tech.law.hanreidb.unit.police.OrElseMethodPolice;
import tech.law.hanreidb.unit.police.OrElseThrowMethodPolice;
import tech.law.hanreidb.unit.police.PrimitiveFieldPolice;
import tech.law.hanreidb.unit.police.SpecifyColumnRequiredPolice;

/**
 * @author jflute
 * @author awane
 * @author mito
 */
public abstract class NxDefTestCase extends NxWebTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // DBFlute が自動生成するパッケージのパターン
    protected static final String DBFLUTE_GENERATE_FQCN_PATTERN = "jp\\.unext\\.[^\\.]+\\.dbflute\\..*";
    // KVSFlute が自動生成するパッケージのパターン
    protected static final String KVSFLUTE_GENERATE_FQCN = "jp\\.unext\\.[^\\.]+\\.kvs\\..*";
    // SolrFlute が自動生成するパッケージのパターン
    protected static final String SOLRFLUTE_GENERATE_FQCN = "jp\\.unext\\.[^\\.]+\\.solr\\..*";
    // MailFlute が自動生成するパッケージのパターン
    protected static final String MAILFLUTE_GENERATE_FQCN = "jp\\.unext\\.[^\\.]+\\.mylasta\\.mail\\..*";
    // namedcls が自動生成するパッケージのパターン
    protected static final String NAMEDCLS_GENERATE_FQCN = "jp\\.unext\\.[^\\.]+\\.mylasta\\.namedcls\\..*";
    // Remote API 用のソース
    protected static final String REMOTE_API_FQCN = ".*\\.remote\\..*";

    // ===================================================================================
    //                                                                             UTFlute
    //                                                                             =======
    // 有効な action か。DI 出来ないフィールドがあったりとかすると捕まる
    public void test_component() throws Exception {
        policeStoryOfJavaClassChase(new ActionComponentPolice(tp -> getComponent(tp)));
    }

    // smartdeploy 外のクラスから smartdeploy 内のクラス使ってないか
    public void test_hotDeployDestroyer() throws Exception {
        policeStoryOfJavaClassChase(new HotDeployDestroyerPolice(tp -> getComponent(tp)));
    }

    // Action 系じゃないのに Action 系にしてるクラスないか
    public void test_nonActionExtendsAction() throws Exception {
        policeStoryOfJavaClassChase(new NonActionExtendsActionPolice());
    }

    // web 以外のパッケージなのに web パッケージ見ようとしてないか
    public void test_nonWebHasWebReference() throws Exception {
        policeStoryOfJavaClassChase(new NonWebHasWebReferencePolice());
    }

    // web 内のパッケージ構成があってるか。Action と Form が同じパッケージ構成内にあるか
    public void test_webPackageNinjaReferencePolice() throws Exception {
        policeStoryOfJavaClassChase(new WebPackageNinjaReferencePolice());
    }

    // @Resource はみんな private だよね
    public void test_injectedResourceDefinitionPolice() throws Exception {
        policeStoryOfJavaClassChase(new InjectedResourceDefinitionPolice() {
            public boolean containsTestClass() {
                return true;
            };
        }.shouldBePrivateField(field -> {
            return true; // means all fields
        }));
    }

    // LastaFluteの固定的なチェックが入るかもしれない: ひとまずformはimmutableね☆
    public void test_lastaPresentsSomethingPolice() throws Exception {
        policeStoryOfJavaClassChase(new LastaPresentsSomethingPolice().formImmutable());
    }

    // ===================================================================================
    //                                                                   unext-test-common
    //                                                                   =================
    // -----------------------------------------------------
    //                                 Action Implementation
    //                                 ---------------------
    // Action のメソッドに HTTP METHOD を明示するようチェック
    public void test_actionHttpMethodPolice() throws Exception {
        policeStoryOfJavaClassChase(new ActionHttpMethodPolice().setIgnoreClassRegex("RootAction", "SwaggerAction"));
    }

    // JsonResponse に ContentResult 以外をつんでないか
    public void test_jsonResponseReturnTypePolice() throws Exception {
        policeStoryOfJavaClassChase(new JsonResponseReturnTypePolice() //
                .setIgnoreClassRegex("SwaggerAction") // Swagger は HtmlResponse, HtmlResponse を許可するわけではないので名前で。
        );
    }

    // ContentResult の内部クラスは Part のみ
    public void test_contentResultHierarchyPolice() throws Exception {
        policeStoryOfJavaClassChase(new ContentResultHierarchyPolice());
    }

    // Action クラスの MappingToContent メソッドで Selectしていないこと
    public void test_actionMappingToContentNoSelectPolice() throws Exception {
        policeStoryOfJavaClassChase(new ActionMethodMappingToContentPolice());
    }

    // Action クラス内での Part 作成個所のチェック
    public void test_actionPartCreatePolice() throws Exception {
        policeStoryOfJavaClassChase(new ActionPartCreatePolice());
    }

    // -----------------------------------------------------
    //                               TestCase Implementation
    //                               -----------------------
    // Job のテストケースが extends しているものをチェック。(Web系はアウトにする）
    public void test_jobTestExtendsPolice() throws Exception {
        policeStoryOfJavaClassChase(new JobTestExtendsPolice());
    }

    // -----------------------------------------------------
    //                                           Field Style
    //                                           -----------
    // フィールドが _flg で終了しているものをチェックします。 Boolean じゃないといけない
    public void test_flgFieldPolice() throws Exception {
        policeStoryOfJavaClassChase(new FlgFieldPolice() //
                .setIgnoreRegexFqcn(REMOTE_API_FQCN) // remote はこちらの都合で決められないので除外する。
        );
    }

    // フィールドが _id で終了しているものをチェックします。Number のサブクラスだけ許される
    public void test_idFieldPolice() throws Exception {
        policeStoryOfJavaClassChase(new IdFieldPolice() //
                .setIgnoreRegexFqcn(REMOTE_API_FQCN) // remote はこちらの都合で決められないので除外する。
        );
    }

    // プリミティブ型フィールド禁止
    public void test_primitiveFieldPolice() throws Exception {
        policeStoryOfJavaClassChase(new PrimitiveFieldPolice());
    }

    // Form クラス内でのフィールドチェック (ImmutableListになってるかどうかなど)
    public void test_formFieldPolice() throws Exception {
        policeStoryOfJavaClassChase(new FormFieldPolice());
    }

    // CDef クラスを宣言する時は CDef. を省略してはいけない
    public void test_declareCDefPolice() throws Exception {
        policeStoryOfJavaClassChase(new DeclareCDefPolice() //
                // 自動生成系は UNEXT ルールではないので除外します。
                .setIgnorePackage("org.dbflute") //
                .setIgnoreRegexFqcn( // 自動生成系は除外
                        DBFLUTE_GENERATE_FQCN_PATTERN, //
                        NAMEDCLS_GENERATE_FQCN, //
                        MAILFLUTE_GENERATE_FQCN, //
                        KVSFLUTE_GENERATE_FQCN, //
                        SOLRFLUTE_GENERATE_FQCN) //
        );
    }

    // -----------------------------------------------------
    //                                          Method Style
    //                                          ------------
    // Optional(OptionalThing).orElse にメソッドを指定してはいけない
    public void test_orElseMethodPolice() throws Exception {
        policeStoryOfJavaClassChase(new OrElseMethodPolice());
    }

    // Optional(OptionalThing).orElseThrow は return 必須。 throw しがち。
    public void test_orElseThrowMethodPolice() throws Exception {
        policeStoryOfJavaClassChase(new OrElseThrowMethodPolice());
    }

    // -----------------------------------------------------
    //                                           Date Format
    //                                           -----------
    // 日付アノテーションのデフォルトフォーマット指定を明示しちゃってないか
    public void test_jsonDateFormatPolice() throws Exception {
        policeStoryOfJavaClassChase(new JsonDateFormatPatternPolice().setDefaultPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"));
    }

    // DateTimeFormatter が使われてないか
    public void test_dateTimeFormatterPolice() throws Exception {
        policeStoryOfJavaClassChase(new DateTimeFormatterPolice());
    }

    // -----------------------------------------------------
    //                                   Eclipse Collections
    //                                   -------------------
    // stream() 禁止 (代わりに Eclipse Collections をしっかり使っていこう)
    public void test_collectionStreamPolice() throws Exception {
        policeStoryOfJavaClassChase(new CollectionStreamPolice() //
                .setIgnorePackage("org.dbflute") // 自動生成(KVSFlute, SolrFlute)は UNEXT ルールとは違うので除外
                .setIgnoreRegexFqcn( // 自動生成系は除外
                        DBFLUTE_GENERATE_FQCN_PATTERN, //
                        NAMEDCLS_GENERATE_FQCN, //
                        MAILFLUTE_GENERATE_FQCN, //
                        KVSFLUTE_GENERATE_FQCN, //
                        SOLRFLUTE_GENERATE_FQCN) //
        );
    }

    // -----------------------------------------------------
    //                                               DBFlute
    //                                               -------
    // specify 指定必須
    public void test_specifyColumnRequiredPolice() throws Exception {
        policeStoryOfJavaClassChase(new SpecifyColumnRequiredPolice() //
                .setIgnoreClassRegex(".*LoginAssist") // LoginAssist だけ許可したい。
                .setIgnorePackage("org.dbflute.kvs") // KVSFlute は Specify 機能事態が無いので。
                .setIgnoreRegexFqcn( // 自動生成系は除外
                        DBFLUTE_GENERATE_FQCN_PATTERN, //
                        MAILFLUTE_GENERATE_FQCN, //
                        KVSFLUTE_GENERATE_FQCN, //
                        SOLRFLUTE_GENERATE_FQCN) //
        );
    }

    // -----------------------------------------------------
    //                                               Comment
    //                                               -------
    // コメントフォーマットチェック (todoコメントとか)
    public void test_commentFormatPolice() throws Exception {
        policeStoryOfJavaClassChase(new CommentFormatPolice());
    }

    // Javadoc の Null 説明のチェック
    public void test_javadocNullDescriptionPolice() throws Exception {
        policeStoryOfJavaClassChase(new JavadocNullDescriptionPolice() //
                // 自動生成系は UNEXT ルールではないので除外します。
                .setIgnorePackage("org.dbflute") //
                .setIgnoreRegexFqcn( // 自動生成系は除外
                        DBFLUTE_GENERATE_FQCN_PATTERN, //
                        NAMEDCLS_GENERATE_FQCN, //
                        MAILFLUTE_GENERATE_FQCN, //
                        KVSFLUTE_GENERATE_FQCN, //
                        SOLRFLUTE_GENERATE_FQCN) //
        );
    }

    // e.g. 必須
    public void test_egPolice() throws Exception {
        // デフォルト無効に
        //policeStoryOfJavaClassChase(new EgPolice());
    }

    // -----------------------------------------------------
    //                                         Resource File
    //                                         -------------
    // .project ファイルをチェック
    public void test_dotProjectPolice() throws Exception {
        policeStoryOfProjectResourceChase(new DotProjectPolice().setIgnorePathRegex(".*/build/.*"));
    }
}
