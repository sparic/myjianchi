package com.myee.tarot.admin.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminPermissionQualifiedEntity is a Querydsl query type for AdminPermissionQualifiedEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminPermissionQualifiedEntity extends EntityPathBase<AdminPermissionQualifiedEntity> {

    private static final long serialVersionUID = 1600104883L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminPermissionQualifiedEntity adminPermissionQualifiedEntity = new QAdminPermissionQualifiedEntity("adminPermissionQualifiedEntity");

    public final QAdminPermission adminPermission;

    public final StringPath ceilingEntityFullyQualifiedName = createString("ceilingEntityFullyQualifiedName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QAdminPermissionQualifiedEntity(String variable) {
        this(AdminPermissionQualifiedEntity.class, forVariable(variable), INITS);
    }

    public QAdminPermissionQualifiedEntity(Path<? extends AdminPermissionQualifiedEntity> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAdminPermissionQualifiedEntity(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAdminPermissionQualifiedEntity(PathMetadata metadata, PathInits inits) {
        this(AdminPermissionQualifiedEntity.class, metadata, inits);
    }

    public QAdminPermissionQualifiedEntity(Class<? extends AdminPermissionQualifiedEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adminPermission = inits.isInitialized("adminPermission") ? new QAdminPermission(forProperty("adminPermission")) : null;
    }

}

