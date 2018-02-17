/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newArrayList;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

/**
 * DBFlute の検索で Specify の指定は必須。
 *
 * Specify 指定のない検索は、
 * littleAdjustmentMap.dfprop#isSpecifyColumnRequired を true にする事で実行時エラーにできますが、
 * ポリスでは以下の点で意味があります。
 *
 *・テストケースで実行コードが含まれていない（カバレッジが足りていない）ケースでも拾えます。
 *・Specify 共通化というアンチパターンのチェックができます。
 *  Specify は書き出した bhv 固有のものとしてください。
 *  共通化することで、不必要な定義を含めてしまう可能性が出てくるので。
 * @author mito
 */
public class SpecifyColumnRequiredPolice extends AbstractJavaPolice<SpecifyColumnRequiredPolice> {

    @Override
    public boolean containsTestClass() {
        return true;
    }

    @Override
    public Optional<String> validate(File srcFile, Class<?> clazz) {
        for (String logic : parseBhvSelect(srcFile)) {
            if (!logic.contains("specify()")) {
                return Optional.of(logic);
            }
        }

        return Optional.empty();
    }

    private List<String> parseBhvSelect(File srcFile) {
        List<String> bhvSelectList = newArrayList();
        List<String> logic = newArrayList();

        try {
            int counter = 0;
            boolean bhvSelect = false;
            int bracesOpen = 0;
            int bracesClose = 0;

            for (String line : Files.readAllLines(srcFile.toPath(), StandardCharsets.UTF_8)) {
                counter++;

                if (line.contains("Bhv.selectEntity") //
                        || line.contains("Bhv.selectList") //
                        || line.contains("Bhv.selectPage") //
                        || line.contains("Bhv.selectCursor") //
                        || line.contains("Bhv.load")) {
                    bhvSelect = true;
                }

                if (line.contains(" kvs")) {
                    bhvSelect = false; // ちょっと雑だけど、、kvsBhv を回避
                }

                if (!bhvSelect) {
                    continue;
                }

                logic.add("[" + counter + "]" + line);

                bracesOpen += StringUtils.countMatches(line, '(');
                bracesClose += StringUtils.countMatches(line, ')');

                if (bracesOpen > 0 && bracesClose > 0 && bracesOpen == bracesClose) {
                    bhvSelectList.add(logic.stream().collect(Collectors.joining("\n")));
                    bhvSelect = false;
                    bracesOpen = 0;
                    bracesClose = 0;
                    logic.clear();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("チェックしたいファイルを読み込めません。filePath = " + srcFile.getAbsolutePath(), e);
        }

        return bhvSelectList;
    }

    @Override
    protected String getExceptionNotice() {
        return "Specify の指定が無い検索を見つけました。";
    }
}
