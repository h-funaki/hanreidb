/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

/**
 * Java Parser ポリスの土台用。
 * @author mito
 */
public abstract class AbstractJavaParserPolice<T extends AbstractJavaParserPolice<T>>extends AbstractJavaPolice<T> {

    @Override
    public Optional<String> validate(File srcFile, Class<?> clazz) {
        return parseClass(srcFile, clazz).flatMap(compilationUnit -> {
            return validate(srcFile, clazz, compilationUnit);
        });
    }

    protected abstract Optional<String> validate(File srcFile, Class<?> clazz, CompilationUnit compilationUnit);

    // ===================================================================================
    //                                                                         Parse Class
    //                                                                         ===========
    protected Optional<CompilationUnit> parseClass(File srcFile, Class<?> clazz) {
        try (FileInputStream in = new FileInputStream(srcFile)) {
            CompilationUnit compilationUnit = JavaParser.parse(in);
            return Optional.of(compilationUnit);
        } catch (IOException e) {
            return Optional.empty();
        }
    }
}