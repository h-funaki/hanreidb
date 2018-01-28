package tech.law.hanreidb.app.base;

/**
 * 比較に関する処理のちょっとした補完クラス。(継承とかも何もない)<br>
 * ディベロッパーは UnextStaticImportUtil を経由するので、実質的に表には出てこない。<br>
 * フレームワーク用のクラスと言ってもいいかも。
 * @author mito
 * @author jflute
 */
public class CompareUtil {

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    /**
     * {@link Comparable} を実装したクラスの比較方法を提供します。
     * @param left 比較元. (NotNull)
     * @return 比較方法 (NotNull)
     */
    public static <T extends Comparable<? super T>> BasicCompare<T> compare(T left) {
        return new BasicCompareImpl<T>(left);
    }

    // ===================================================================================
    //                                                                          型依存の比較
    //                                                                          ==========
    /**
     * {@link BasicCompare} の実装。
     * @author mito
     * @param <T> {@link Comparable} を実装してるクラスならなんでも。
     */
    public static final class BasicCompareImpl<T extends Comparable<? super T>> extends AbstractBasicCompare<T> {

        /**
         * コンストラクタ.
         * @param left. (NotNull)
         */
        protected BasicCompareImpl(T left) {
            super(left);
        }
    }

    // ===================================================================================
    //                                                                            簡易実装
    //                                                                            ========

    /**
     * {@link Comparable#compareTo(Object)} による比較結果を利用した比較クラス。 
     * @author mito
     * @author jflute
     */
    protected static abstract class AbstractBasicCompare<T extends Comparable<? super T>> implements BasicCompare<T> {

        protected final T left;

        /**
         * コンストラクタ.
         * @param left. (NotNull)
         */
        protected AbstractBasicCompare(T left) {
            this.left = left;
        }

        /** {@inheritDoc} */
        @Override
        public boolean isLessThan(T right) {
            return left.compareTo(right) < 0;
        }

        /** {@inheritDoc} */
        @Override
        public boolean isLessEqual(T right) {
            return left.compareTo(right) <= 0;
        }

        /** {@inheritDoc} */
        @Override
        public boolean isEqual(T right) {
            return left.compareTo(right) == 0;
        }

        /** {@inheritDoc} */
        @Override
        public boolean isGreaterEqual(T right) {
            return left.compareTo(right) >= 0;
        }

        /** {@inheritDoc} */
        @Override
        public boolean isGreaterThan(T right) {
            return left.compareTo(right) > 0;
        }

    }

    // ===================================================================================
    //                                                                      比較方法の種類
    //                                                                      ==============

    /**
     * 基本的な比較パターン。
     * <pre>
     * <, <=, =, >= , >
     * <pre>
     * @author mito
     * @param <T> 比較する型
     */
    public interface BasicCompare<T> {

        /**
         * left < right.
         * 
         * @param right 比較対象. (NotNull)
         * @return 比較対象より小さければ true
         */
        boolean isLessThan(T right);

        /**
         * left <= right.
         * 
         * @param right 比較対象. (NotNull)
         * @return 比較対象以下であれば true
         */
        boolean isLessEqual(T right);

        /**
         * left = right.
         *  
         * @param right 比較対象. (NotNull)
         * @return 同じ値であれば true 
         * */
        boolean isEqual(T right);

        /**
         * left >= right.
         * 
         * @param right 比較対象. (NotNull)
         * @return 比較対象以上であれば true
         */
        boolean isGreaterEqual(T right);

        /**
         * left > right.
         * 
         * @param right 比較対象. (NotNull)
         * @return 比較対象より大きければ true
         */
        boolean isGreaterThan(T right);
    }
}