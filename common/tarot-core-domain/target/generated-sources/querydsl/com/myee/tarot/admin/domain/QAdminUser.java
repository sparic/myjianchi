package com.myee.tarot.admin.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminUser is a Querydsl query type for AdminUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminUser extends EntityPathBase<AdminUser> {

    private static final long serialVersionUID = 499175432L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminUser adminUser = new QAdminUser("adminUser");

    public final BooleanPath activeStatusFlag = createBoolean("activeStatusFlag");

    public final SetPath<AdminPermission, QAdminPermission> allPermissions = this.<AdminPermission, QAdminPermission>createSet("allPermissions", AdminPermission.class, QAdminPermission.class, PathInits.DIRECT2);

    public final SetPath<AdminRole, QAdminRole> allRoles = this.<AdminRole, QAdminRole>createSet("allRoles", AdminRole.class, QAdminRole.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> lastLogin = createDateTime("lastLogin", java.util.Date.class);

    public final StringPath login = createString("login");

    public final StringPath loginIP = createString("loginIP");

    public final com.myee.tarot.merchant.domain.QMerchantStore merchantStore;

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public QAdminUser(String variable) {
        this(AdminUser.class, forVariable(variable), INITS);
    }

    public QAdminUser(Path<? extends AdminUser> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAdminUser(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAdminUser(PathMetadata metadata, PathInits inits) {
        this(AdminUser.class, metadata, inits);
    }

    public QAdminUser(Class<? extends AdminUser> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.merchantStore = inits.isInitialized("merchantStore") ? new com.myee.tarot.merchant.domain.QMerchantStore(forProperty("merchantStore"), inits.get("merchantStore")) : null;
    }

}

