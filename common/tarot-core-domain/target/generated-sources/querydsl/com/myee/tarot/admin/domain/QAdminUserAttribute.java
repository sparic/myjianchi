package com.myee.tarot.admin.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminUserAttribute is a Querydsl query type for AdminUserAttribute
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminUserAttribute extends EntityPathBase<AdminUserAttribute> {

    private static final long serialVersionUID = 548307828L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminUserAttribute adminUserAttribute = new QAdminUserAttribute("adminUserAttribute");

    public final QAdminUser adminUser;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath value = createString("value");

    public QAdminUserAttribute(String variable) {
        this(AdminUserAttribute.class, forVariable(variable), INITS);
    }

    public QAdminUserAttribute(Path<? extends AdminUserAttribute> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAdminUserAttribute(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAdminUserAttribute(PathMetadata metadata, PathInits inits) {
        this(AdminUserAttribute.class, metadata, inits);
    }

    public QAdminUserAttribute(Class<? extends AdminUserAttribute> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adminUser = inits.isInitialized("adminUser") ? new QAdminUser(forProperty("adminUser"), inits.get("adminUser")) : null;
    }

}

