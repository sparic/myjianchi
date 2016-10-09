package com.myee.tarot.admin.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminSection is a Querydsl query type for AdminSection
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminSection extends EntityPathBase<AdminSection> {

    private static final long serialVersionUID = -418982520L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminSection adminSection = new QAdminSection("adminSection");

    public final StringPath ceilingEntity = createString("ceilingEntity");

    public final NumberPath<Integer> displayOrder = createNumber("displayOrder", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QAdminModule module;

    public final StringPath name = createString("name");

    public final ListPath<AdminPermission, QAdminPermission> permissions = this.<AdminPermission, QAdminPermission>createList("permissions", AdminPermission.class, QAdminPermission.class, PathInits.DIRECT2);

    public final StringPath sectionKey = createString("sectionKey");

    public final StringPath url = createString("url");

    public QAdminSection(String variable) {
        this(AdminSection.class, forVariable(variable), INITS);
    }

    public QAdminSection(Path<? extends AdminSection> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAdminSection(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAdminSection(PathMetadata metadata, PathInits inits) {
        this(AdminSection.class, metadata, inits);
    }

    public QAdminSection(Class<? extends AdminSection> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.module = inits.isInitialized("module") ? new QAdminModule(forProperty("module")) : null;
    }

}

