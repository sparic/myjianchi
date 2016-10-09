package com.myee.tarot.menu.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenuItem is a Querydsl query type for MenuItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMenuItem extends EntityPathBase<MenuItem> {

    private static final long serialVersionUID = 1620570918L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenuItem menuItem = new QMenuItem("menuItem");

    public final StringPath actionUrl = createString("actionUrl");

    public final StringPath altText = createString("altText");

    public final StringPath customHtml = createString("customHtml");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.myee.tarot.reference.domain.QMedia image;

    public final StringPath label = createString("label");

    public final QMenu linkedMenu;

    public final com.myee.tarot.cms.domain.QPage linkedPage;

    public final QMenu parentMenu;

    public final NumberPath<java.math.BigDecimal> sequence = createNumber("sequence", java.math.BigDecimal.class);

    public final StringPath type = createString("type");

    public QMenuItem(String variable) {
        this(MenuItem.class, forVariable(variable), INITS);
    }

    public QMenuItem(Path<? extends MenuItem> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMenuItem(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMenuItem(PathMetadata metadata, PathInits inits) {
        this(MenuItem.class, metadata, inits);
    }

    public QMenuItem(Class<? extends MenuItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.image = inits.isInitialized("image") ? new com.myee.tarot.reference.domain.QMedia(forProperty("image")) : null;
        this.linkedMenu = inits.isInitialized("linkedMenu") ? new QMenu(forProperty("linkedMenu")) : null;
        this.linkedPage = inits.isInitialized("linkedPage") ? new com.myee.tarot.cms.domain.QPage(forProperty("linkedPage"), inits.get("linkedPage")) : null;
        this.parentMenu = inits.isInitialized("parentMenu") ? new QMenu(forProperty("parentMenu")) : null;
    }

}

