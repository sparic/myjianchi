package com.myee.tarot.admin.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminPermission is a Querydsl query type for AdminPermission
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminPermission extends EntityPathBase<AdminPermission> {

    private static final long serialVersionUID = -1685010356L;

    public static final QAdminPermission adminPermission = new QAdminPermission("adminPermission");

    public final ListPath<AdminPermission, QAdminPermission> allChildPermissions = this.<AdminPermission, QAdminPermission>createList("allChildPermissions", AdminPermission.class, QAdminPermission.class, PathInits.DIRECT2);

    public final ListPath<AdminPermission, QAdminPermission> allParentPermissions = this.<AdminPermission, QAdminPermission>createList("allParentPermissions", AdminPermission.class, QAdminPermission.class, PathInits.DIRECT2);

    public final SetPath<AdminRole, QAdminRole> allRoles = this.<AdminRole, QAdminRole>createSet("allRoles", AdminRole.class, QAdminRole.class, PathInits.DIRECT2);

    public final SetPath<AdminUser, QAdminUser> allUsers = this.<AdminUser, QAdminUser>createSet("allUsers", AdminUser.class, QAdminUser.class, PathInits.DIRECT2);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isFriendly = createBoolean("isFriendly");

    public final StringPath name = createString("name");

    public final ListPath<AdminPermissionQualifiedEntity, QAdminPermissionQualifiedEntity> qualifiedEntities = this.<AdminPermissionQualifiedEntity, QAdminPermissionQualifiedEntity>createList("qualifiedEntities", AdminPermissionQualifiedEntity.class, QAdminPermissionQualifiedEntity.class, PathInits.DIRECT2);

    public final StringPath type = createString("type");

    public QAdminPermission(String variable) {
        super(AdminPermission.class, forVariable(variable));
    }

    public QAdminPermission(Path<? extends AdminPermission> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminPermission(PathMetadata metadata) {
        super(AdminPermission.class, metadata);
    }

}

