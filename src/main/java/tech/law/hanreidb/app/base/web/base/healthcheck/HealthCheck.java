/*
 * Copyright(c) u-next.
 */
package tech.law.hanreidb.app.base.web.base.healthcheck;

import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.newImmutableList;
import static tech.law.hanreidb.app.base.util.UnextStaticImportUtil.toImmutable;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.jar.Manifest;

import javax.sql.XADataSource;

import org.dbflute.optional.OptionalThing;
import org.eclipse.collections.impl.utility.ArrayIterate;
import org.lastaflute.core.util.ContainerUtil;
import org.lastaflute.db.dbcp.HookedConnectionPool;
import org.lastaflute.db.dbcp.HookedXADataSource;
import org.lastaflute.jta.dbcp.ConnectionPool;
import org.lastaflute.web.util.LaServletContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.law.hanreidb.app.base.web.base.healthcheck.HealthCheckContentResult.DatabasePart;
import tech.law.hanreidb.app.base.web.base.healthcheck.HealthCheckContentResult.ManifestPart;
import tech.law.hanreidb.app.base.web.base.healthcheck.HealthCheckContentResult.ManifestPart.ManifestAttributePart;

/**
 * @author mito
 */
public interface HealthCheck {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    public static final Logger logger = LoggerFactory.getLogger(HealthCheck.class);

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    default HealthCheckContentResult mappingToContent() {
        HealthCheckContentResult content = prepareContentResult();
        mappingToManifest(content);
        mappingToDatabase(content);
        mappingToKvs(content);

        return content;
    }

    default HealthCheckContentResult prepareContentResult() {
        return new HealthCheckContentResult();
    }

    default void mappingToManifest(HealthCheckContentResult content) {
        content.manifest = getManifest().map(this::convertToManifestPart).orElse(null);
    }

    /**
     * マニフェスト取得
     * @return マニフェスト. (NotNull)
     */
    default OptionalThing<Manifest> getManifest() {
        String path = getManifestPath();
        if (!Files.exists(Paths.get(path))) {
            return OptionalThing.empty();
        }
        try (FileInputStream fio = new FileInputStream(path)) {
            return OptionalThing.of(new Manifest(fio));
        } catch (IOException e) {
            logger.error("マニフェストファイルの読み込みに失敗しました。 path:{}", path, e);
            return OptionalThing.empty();
        }
    }

    /**
     * マニフェストファイルのパスを取得
     * @return マニフェストファイルのパス. (NotNull)
     */
    default String getManifestPath() {
        return LaServletContextUtil.getServletContext().getRealPath("/META-INF/MANIFEST.MF");
    }

    /**
     * マニフェストPartへ変換
     * @param manifest マニフェスト. (NotNull)
     * @return マニフェストPart. (NotNull)
     */
    default ManifestPart convertToManifestPart(Manifest manifest) {
        ManifestPart part = new ManifestPart();
        part.attribute_list =
                toImmutable(manifest.getMainAttributes().entrySet()).toList().collect(this::convertToManifestAttributePart).toImmutable();

        return part;
    }

    default ManifestAttributePart convertToManifestAttributePart(Entry<Object, Object> attr) {
        ManifestAttributePart part = new ManifestAttributePart();
        part.key = attr.getKey().toString();
        part.value = attr.getValue().toString();

        return part;
    }

    default void mappingToDatabase(HealthCheckContentResult content) {
        content.database_list = ArrayIterate
                .collect(ContainerUtil.searchComponentsAll(ConnectionPool.class), this::convertToDatabaseConditionPart).toImmutable();
    }

    default DatabasePart convertToDatabaseConditionPart(ConnectionPool con) {
        DatabasePart part = new DatabasePart();
        part.name = extractConnectionName(con);

        try {
            part.connect = con.checkOut().getPhysicalConnection().isValid(1);
        } catch (SQLException e) {
            logger.error("{} の接続に失敗しました。", part.name, e);
            part.connect = false;
        }

        return part;
    }

    // コネクションからなにかしらの識別子を取る
    default String extractConnectionName(ConnectionPool con) {
        if (con != null && con instanceof HookedConnectionPool) {
            XADataSource xaDataSource = HookedConnectionPool.class.cast(con).getXADataSource();
            if (xaDataSource instanceof HookedXADataSource) {
                HookedXADataSource source = HookedXADataSource.class.cast(xaDataSource);
                return source.getURL();
            }
        }

        return "(接続先の情報を取得できません)";
    }

    default void mappingToKvs(HealthCheckContentResult content) {
        content.kvs_list = newImmutableList();
    }
}
