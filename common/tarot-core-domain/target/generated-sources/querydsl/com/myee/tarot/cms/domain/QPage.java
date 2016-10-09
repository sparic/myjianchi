package com.myee.tarot.cms.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPage is a Querydsl query type for Page
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPage extends EntityPathBase<Page> {

    private static final long serialVersionUID = -100373957L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPage page = new QPage("page");

    public final DateTimePath<java.util.Date> activeEndDate = createDateTime("activeEndDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> activeStartDate = createDateTime("activeStartDate", java.util.Date.class);

    public final MapPath<String, PageAttribute, QPageAttribute> additionalAttributes = this.<String, PageAttribute, QPageAttribute>createMap("additionalAttributes", String.class, PageAttribute.class, QPageAttribute.class);

    public final StringPath description = createString("description");

    public final BooleanPath excludeFromSiteMap = createBoolean("excludeFromSiteMap");

    public final StringPath fullUrl = createString("fullUrl");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath metaDescription = createString("metaDescription");

    public final StringPath metaTitle = createString("metaTitle");

    public final BooleanPath offlineFlag = createBoolean("offlineFlag");

    public final MapPath<String, PageField, QPageField> pageFields = this.<String, PageField, QPageField>createMap("pageFields", String.class, PageField.class, QPageField.class);

    public final QPageTemplate pageTemplate;

    public final NumberPath<Integer> priority = createNumber("priority", Integer.class);

    public QPage(String variable) {
        this(Page.class, forVariable(variable), INITS);
    }

    public QPage(Path<? extends Page> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPage(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPage(PathMetadata metadata, PathInits inits) {
        this(Page.class, metadata, inits);
    }

    public QPage(Class<? extends Page> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pageTemplate = inits.isInitialized("pageTemplate") ? new QPageTemplate(forProperty("pageTemplate"), inits.get("pageTemplate")) : null;
    }

}

