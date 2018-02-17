/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.db;

import org.apache.commons.lang3.RandomStringUtils;
import org.dbflute.Entity;
import org.dbflute.exception.EntityAlreadyExistsException;
import org.dbflute.helper.function.IndependentProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * なんとかPUBLIC_CODEを登録するときの、ちょい便利な処理付きインターフェース。<br>
 * DBFluteのBehaviorでimplementsさせて必要な処理を実装して、<br>
 * insertGeneratingPublicCode()を呼べば、"公開コードの生成もしつつ登録" になる。
 * @param <ENTITY> 登録するEntityの型
 * @author awane
 * @author jflute
 * @author nagahori
 * @author mito
 */
public interface PublicCodeHandleable<ENTITY extends Entity> {

    Logger logger = LoggerFactory.getLogger(PublicCodeHandleable.class);

    /**
     * 公開コードの生成もしつつ登録する。<br>
     * これを呼ぶだけで、公開コードのダミー値登録と、その後の正式に値による更新処理も行われる。
     * <pre>
     * e.g. こんなかんじ
     *  personBhv.insertGeneratingPublicCode(person, () -> personBhv.insert(person));
     * </pre>
     * @param entity The inserted entity without public code. (NotNull)
     * @param noArgInLambda insert処理のコールバック、指定した Entity をそのまま insert() する処理を書いて欲しい (NotNull)
     */
    default void insertGeneratingPublicCode(ENTITY entity, IndependentProcessor noArgInLambda) {
        setupDummyPublicCode(entity);
        try {
            noArgInLambda.process();
        } catch (EntityAlreadyExistsException e) { // 公開コードの重複の可能性 (別の制約かもしれないけど)
            setupDummyPublicCode(entity);
            try {
                logger.debug("...Retrying inserting by dummy public code: {}", entity);
                noArgInLambda.process();
            } catch (EntityAlreadyExistsException retryEx) { // さすがに公開コードとは考えにくい
                throw e; // 一回目の方でthrow (その方が本当の原因を表している可能性が高いと考えるため)
            }
        }
        updateFormalPublicCode(entity);
    }

    default String ramdomDummyCode() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    /**
     * エンティティの公開コードにダミー公開コードを設定する。(毎回変わるランダム値を想定)
     * @param entity エンティティ (NotNull)
     */
    void setupDummyPublicCode(ENTITY entity);

    /**
     * エンティティの公開コードに正式な公開コードを設定して更新する。<br>
     * 指定したエンティティの値がどうであれば、公開コード(と共通カラム)だけを更新する。<br>
     * 登録直後のエンティティを指定するのが吉。
     * @param entity エンティティ、更新後に正式な公開コードが格納されている (NotNull)
     */
    void updateFormalPublicCode(ENTITY entity);
}