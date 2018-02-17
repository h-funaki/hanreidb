/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.unit.police;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;

import org.dbflute.helper.message.ExceptionMessageBuilder;
import org.dbflute.util.DfCollectionUtil;
import org.lastaflute.web.validation.Required;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.type.PrimitiveType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.javadoc.JavadocBlockTag;

/**
 * Javadoc の Null 説明のチェック。
 * @author awane
 */
public class JavadocNullDescriptionPolice extends AbstractJavaParserPolice<JavadocNullDescriptionPolice> {

    @Override
    public boolean containsTestClass() {
        return true;
    }

    /**
     * 無視するフィールドの場合、 {@code true} を返す。
     * @param fieldDeclaration fieldDeclaration
     * @return 無視するフィールドの場合、 {@code true}
     */
    public boolean isIgnoreField(FieldDeclaration fieldDeclaration) {
        return !fieldDeclaration.hasJavaDocComment() || (fieldDeclaration.isFinal() && !fieldDeclaration.toString().contains("="));
    }

    /**
     * 無視するメソッドの場合、 {@code true} を返す。
     * @param methodDeclaration methodDeclaration
     * @return 無視するフィールドの場合、 {@code true}
     */
    public boolean isIgnoreMethod(MethodDeclaration methodDeclaration) {
        return !methodDeclaration.hasJavaDocComment();
    }

    /**
     * Null 説明が不要なフィールドの場合、 {@code true} を返す。
     * @param fieldDeclaration fieldDeclaration
     * @return Null 説明が不要なフィールドの場合、 {@code true}
     */
    public boolean isUnnecessaryField(FieldDeclaration fieldDeclaration) {
        boolean unnecessary = false;
        if (fieldDeclaration.getParentNode().isPresent()) {
            Node node = fieldDeclaration.getParentNode().get();
            if (node instanceof ClassOrInterfaceDeclaration) {
                unnecessary = ((ClassOrInterfaceDeclaration) node).isInterface();
            }
        }

        return unnecessary || fieldDeclaration.isFinal() || getFieldIgnoreAnnotationList().stream()
                .anyMatch(ignoreAnnotation -> fieldDeclaration.getAnnotationByClass(ignoreAnnotation).isPresent());
    }

    /**
     * Null 説明が不要なメソッドの場合、 {@code true} を返す。
     * @param methodDeclaration methodDeclaration
     * @return Null 説明が不要なメソッドの場合、 {@code true}
     */
    public boolean isUnnecessaryMethod(MethodDeclaration methodDeclaration) {
        return false;
    }

    /**
     * フォールドの Null 説明を厳密に確認する場合、 {@code true} を返す。
     * @return フォールドの Null 説明を厳密に確認する場合、 {@code true}
     */
    public boolean isStrictField() {
        return true;
    }

    /**
     * メソッドの Null 説明を厳密に確認する場合、 {@code true} を返す。
     * @returnメソッドの  Null 説明を厳密に確認する場合、 {@code true}
     */
    public boolean isStrictMethod() {
        return true;
    }

    public List<Class<? extends Annotation>> getFieldIgnoreAnnotationList() {
        return DfCollectionUtil.newArrayList(NotNull.class, Required.class, Resource.class);
    }

    protected boolean isPrimitiveType(Type type) {
        return (type instanceof PrimitiveType);
    }

    @Override
    protected Optional<String> validate(File srcFile, Class<?> clazz, CompilationUnit compilationUnit) {
        List<String> errorList = DfCollectionUtil.newArrayList();
        VoidVisitorAdapter<Void> adapter = new VoidVisitorAdapter<Void>() {

            public void visit(final FieldDeclaration fieldDeclaration, final Void v) {
                if (isIgnoreField(fieldDeclaration)) {
                    return;
                }
                try {
                    if (!validateFieldJavadocNullDescription(fieldDeclaration)) {
                        errorList.add(fieldDeclaration.toString());
                    }
                } catch (RuntimeException e) {
                    errorList.add(String.format("%s\njavadoc parse error. error messge=%s", fieldDeclaration.toString(), e.getMessage()));
                }
                super.visit(fieldDeclaration, v);
            }

            public void visit(final MethodDeclaration methodDeclaration, final Void v) {
                if (isIgnoreMethod(methodDeclaration)) {
                    return;
                }
                String methodDeclarationAsString = methodDeclaration.getDeclarationAsString();
                try {
                    methodDeclaration.getJavadoc().ifPresent(javadoc -> {
                        javadoc.getBlockTags().forEach(blockTag -> {
                            if (JavadocBlockTag.Type.PARAM.equals(blockTag.getType())) {
                                blockTag.getName().ifPresent(name -> {
                                    methodDeclaration.getParameterByName(name).ifPresent(parameter -> {
                                        if (!validateMethodJavadocNullDescription(methodDeclaration, parameter.getType(),
                                                blockTag.getContent().toText())) {
                                            errorList.add(String.format("methodDeclaration=%s, javadocblock=%s", methodDeclarationAsString,
                                                    blockTag.toText()));
                                        }
                                    });
                                });
                            }
                            if (JavadocBlockTag.Type.RETURN.equals(blockTag.getType())) {
                                if (!validateMethodJavadocNullDescription(methodDeclaration, methodDeclaration.getType(),
                                        blockTag.getContent().toText())) {
                                    errorList.add(String.format("methodDeclaration=%s, javadocblock=%s", methodDeclarationAsString,
                                            blockTag.toText()));
                                }
                            }
                        });
                    });
                } catch (RuntimeException e) {
                    errorList.add(String.format("methodDeclaration=%s, javadoc parse error. error messge=%s", methodDeclarationAsString,
                            e.getMessage()));
                }
                super.visit(methodDeclaration, v);
            }
        };
        adapter.visit(compilationUnit, null);
        if (errorList.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(errorList.stream().collect(Collectors.joining(System.lineSeparator())));
    }

    protected boolean validateFieldJavadocNullDescription(FieldDeclaration fieldDeclaration) {
        Type type = fieldDeclaration.getElementType();
        return fieldDeclaration.getJavadoc().map(javadoc -> {
            String description = javadoc.getDescription().toText();
            if (isPrimitiveType(type) || isUnnecessaryField(fieldDeclaration)) {
                return isStrictField() && !hasJavadocNullDescription(description);
            } else {
                return hasJavadocNullDescription(description);
            }
        }).orElse(true);
    }

    protected boolean validateMethodJavadocNullDescription(MethodDeclaration methodDeclaration, Type type, String description) {
        if (isPrimitiveType(type) || isUnnecessaryMethod(methodDeclaration)) {
            return isStrictMethod() && !hasJavadocNullDescription(description);
        } else {
            return hasJavadocNullDescription(description);
        }
    }

    protected boolean hasJavadocNullDescription(String descriptionText) {
        String description = descriptionText.replace("\n", " ");

        return description.matches(".* \\(NotNull(, (EmptyAllowed|NotEmpty))?(, NotNullElement)?(: .*)?\\)$")
                || description.matches(".* \\(NullAllowed(: .*)?\\)$");
    }

    @Override
    protected String getExceptionNotice() {
        return "フィールドの説明、メソッドの Javadoc の @param/@return の説明には、NotNull、NullAllowed を入れてください。\nただし、以下の場合は不要です。\n・プリミティブ型\n・初期値がある\n・アノテーション["
                + getFieldIgnoreAnnotationList().stream().map(l -> l.getSimpleName()).collect(Collectors.joining(", ")) + "] がある";
    }

    @Override
    protected void addExceptionElement(ExceptionMessageBuilder br) {
        br.addItem("Advice");
        br.addElement("For example(not primitive type):");
        br.addElement("  (x):");
        br.addElement("    @param xxx");
        br.addElement("    @return xxx");
        br.addElement("    @param xxx(NotNull) -> Space required.");
        br.addElement("    @param xxx    (NotNull) -> much space.");
        br.addElement("  (o):");
        br.addElement("    @param xxx (NotNull)");
        br.addElement("    @param xxx (NotNull NotEmpty)");
        br.addElement("    @param xxx (NotNull EmptyAllowed: xxx)");
        br.addElement("    @param xxx (NullAllowed)");
        br.addElement("    @param xxx (NullAllowed: xxx)");
        br.addElement("    @return xxx (NotNull)");
        br.addElement("For example(primitive type):");
        br.addElement("  (x):");
        br.addElement("    @param xxx (NotNull)");
        br.addElement("    @return xxx (NotNull)");
        br.addElement("  (o):");
        br.addElement("    @param xxx");
        br.addElement("    @return xxx");
    }
}
