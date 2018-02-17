/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Optional;

import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.eclipse.collections.impl.Counter;

/**
 * EclipseCollections を推進するために Java8 標準 stream() を禁止する。
 * @author mito
 */
public class CollectionStreamPolice extends AbstractJavaPolice<CollectionStreamPolice> {

    @Override
    public boolean containsTestClass() {
        return true;
    }

    @Override
    public Optional<String> validate(File srcFile, Class<?> clazz) {
        try {
            Counter counter = new Counter();
            for (String line : Files.readAllLines(srcFile.toPath(), StandardCharsets.UTF_8)) {
                counter.increment();
                if (line.contains(".stream()")) {
                    String detail = String.format("Line %d: %s", counter.getCount(), clazz.getName());
                    return Optional.of(detail);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("チェックしたいファイルを読み込めません。filePath = " + srcFile.getAbsolutePath(), e);
        }

        return Optional.empty();
    }

    @Override
    protected String getExceptionNotice() {
        return "Java8標準 stream() は禁止されています。\nEclipseCollections を使用してください。\n詳しいサンプルはリソースを開くから XxxEclipseCollections を参照してください。";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example:");
        br.addElement("  (x):");
        br.addElement("    memberList.stream().map()...");
        br.addElement("    memberSet.stream().map()...");
        br.addElement("    memberMap.entrySet().stream().map()...");
        br.addElement("  (o):");
        br.addElement("    toImmutable(memberList).collect()...");
        br.addElement("    toImmutable(memberSet).collect()...");
        br.addElement("    toImmutable(memberMap).collect()...");
    }
}
