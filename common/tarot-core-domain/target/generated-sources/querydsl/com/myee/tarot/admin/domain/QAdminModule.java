package com.myee.tarot.admin.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminModule is a Querydsl query type for AdminModule
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminModule extends EntityPathBase<AdminModule> {

    private static final long serialVersionUID = -1561497751L;

    public static final QAdminModule adminModule = new QAdminModule("adminModule");

    public final NumberPath<Integer> displayOrder = createNumber("displayOrder", Integer.class);

    public final StringPath icon = createString("icon");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath moduleKey = createString("moduleKey");

    public final StringPath name = createString("name");

    public final ListPath<AdminSection, QAdminSection> sections = this.<AdminSection, QAdminSection>createList("sections", AdminSection.class, QAdminSection.class, PathInits.DIRECT2);

    public QAdminModule(String variable) {
        super(AdminModule.class, forVariable(variable));
    }

    public QAdminModule(Path<? extends AdminModule> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminModule(PathMetadata metadata) {
        super(AdminModule.class, metadata);
    }

}

