package com.myee.tarot.admin.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminRole is a Querydsl query type for AdminRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminRole extends EntityPathBase<AdminRole> {

    private static final long serialVersionUID = 499082419L;

    public static final QAdminRole adminRole = new QAdminRole("adminRole");

    public final SetPath<AdminPermission, QAdminPermission> allPermissions = this.<AdminPermission, QAdminPermission>createSet("allPermissions", AdminPermission.class, QAdminPermission.class, PathInits.DIRECT2);

    public final SetPath<AdminUser, QAdminUser> allUsers = this.<AdminUser, QAdminUser>createSet("allUsers", AdminUser.class, QAdminUser.class, PathInits.DIRECT2);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QAdminRole(String variable) {
        super(AdminRole.class, forVariable(variable));
    }

    public QAdminRole(Path<? extends AdminRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminRole(PathMetadata metadata) {
        super(AdminRole.class, metadata);
    }

}

