package com.myee.tarot.cms.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPageAttribute is a Querydsl query type for PageAttribute
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPageAttribute extends EntityPathBase<PageAttribute> {

    private static final long serialVersionUID = 947499681L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPageAttribute pageAttribute = new QPageAttribute("pageAttribute");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QPage page;

    public final StringPath value = createString("value");

    public QPageAttribute(String variable) {
        this(PageAttribute.class, forVariable(variable), INITS);
    }

    public QPageAttribute(Path<? extends PageAttribute> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPageAttribute(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPageAttribute(PathMetadata metadata, PathInits inits) {
        this(PageAttribute.class, metadata, inits);
    }

    public QPageAttribute(Class<? extends PageAttribute> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.page = inits.isInitialized("page") ? new QPage(forProperty("page"), inits.get("page")) : null;
    }

}

