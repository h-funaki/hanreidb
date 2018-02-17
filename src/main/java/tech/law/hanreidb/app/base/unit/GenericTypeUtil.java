/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.unit;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.dbflute.util.DfReflectionUtil;

/**
 * クラスの型推奨情報からインスタンスを作成します。
 * @author mito AF-11 新規作成
 * @author awaawa
 * @author jflute
 */
public class GenericTypeUtil {

    public static <T extends Object> T getActualTypeInstance(Class<?> target, int index) {
        Class<?> actualTypeClass = getActualTypeClass(target, index);
        return newInstance(actualTypeClass);
    }

    public static Class<?> getActualTypeClass(Class<?> target, int index) {
        Type type = target.getGenericSuperclass();
        return (Class<?>) ((ParameterizedType) type).getActualTypeArguments()[index];
    }

    public static <T extends Object> T getActualTypeInstance(Class<?> target, Class<?> genericInterface, int index) {
        Class<?> actualTypeClass = getActualTypeClass(target, genericInterface, index);
        return newInstance(actualTypeClass);
    }

    public static Class<?> getActualTypeClass(Class<?> target, Class<?> genericInterface, int index) {
        for (Type type : target.getGenericInterfaces()) {
            final Class<?> rawClass = DfReflectionUtil.getRawClass(type);
            if (rawClass != null && rawClass.equals(genericInterface)) {
                return (Class<?>) ((ParameterizedType) type).getActualTypeArguments()[index];
            }
        }
        throw new IllegalStateException("インスタンス化に失敗しました。なんとかしてください: " + target + ", " + genericInterface);
    }

    protected static <T> T newInstance(Class<?> actualTypeClass) {
        if (actualTypeClass.equals(Void.class)) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T t = (T) DfReflectionUtil.newInstance(actualTypeClass);
        return t;
    }
}
