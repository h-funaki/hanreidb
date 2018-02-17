package tech.law.hanreidb.app.base.web.action.inoutlogging;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.collections.api.list.ImmutableList;

/**
 * 特定のフォーマットで構築された文字列を部分的にマスクするためのクラス。
 * @author mito
 */
public class InOutLogMaskFilterCreator {

    /**
     * Parameter形式で構築された文字列中の、指定されたキーの値をすべてマスクします。
     * @param keyList マスクするキーの一覧 (NotNull)
     * @return マスク後の文字列 (NotNull)
     */
    public Function<String, String> createParameterFilter(ImmutableList<String> keyList) {
        return createFilter(keyList.collect(InOutLogMaskFilterCreator::getParameterMaskPattern));
    }

    /**
     * JSON 形式で構築された文字列中の、指定されたキーの値をすべてマスクします。
     * @param keyList マスクするキーの一覧 (NotNull)
     * @return マスク後の文字列 (NotNull)
     */
    public Function<String, String> createJsonFilter(ImmutableList<String> keyList) {
        return createFilter(keyList.collect(InOutLogMaskFilterCreator::getJsonMaskPattern));
    }

    /**
     * レスポンスの文字列中の、指定されたキーの値をすべてマスクします。
     * @param keyList マスクするキーの一覧 (NotNull)
     * @return マスク後の文字列 (NotNull)
     */
    public Function<String, String> createResponseFilter(ImmutableList<String> keyList) {
        return createFilter(keyList.collect(InOutLogMaskFilterCreator::getJsonMaskPattern));
    }

    protected Function<String, String> createFilter(ImmutableList<Pattern> patternList) {
        return value -> {
            StringBuilder buf = new StringBuilder(value);

            patternList.each(pattern -> {
                maskMessageByPattern(buf, pattern);
            });

            return buf.toString();
        };
    }

    protected static Pattern getParameterMaskPattern(String key) {
        return Pattern.compile("[{\\s]" + key + "=(.*?)[,}]", Pattern.MULTILINE);
    }

    protected static Pattern getJsonMaskPattern(String key) {
        return Pattern.compile(".*\"" + key + "\":.*?\"(.*?)\"", Pattern.MULTILINE);
    }

    protected static void maskMessageByPattern(final StringBuilder message, Pattern pattern) {
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            int group = 1;
            while (group <= matcher.groupCount()) {
                if (matcher.group(group) != null) {
                    for (int i = matcher.start(group); i < matcher.end(group); i++) {
                        message.setCharAt(i, '*');
                        // XXX mito 桁数がわかっちゃうので固定のほうがいいかも (2018/01/10)
                    }
                }
                group++;
            }
        }
    }
}
