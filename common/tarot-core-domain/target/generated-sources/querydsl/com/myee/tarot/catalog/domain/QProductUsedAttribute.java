package com.myee.tarot.catalog.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductUsedAttribute is a Querydsl query type for ProductUsedAttribute
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProductUsedAttribute extends EntityPathBase<ProductUsedAttribute> {

    private static final long serialVersionUID = 633626028L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductUsedAttribute productUsedAttribute = new QProductUsedAttribute("productUsedAttribute");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QProductUsed productUsed;

    public final BooleanPath searchable = createBoolean("searchable");

    public final StringPath value = createString("value");

    public QProductUsedAttribute(String variable) {
        this(ProductUsedAttribute.class, forVariable(variable), INITS);
    }

    public QProductUsedAttribute(Path<? extends ProductUsedAttribute> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductUsedAttribute(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductUsedAttribute(PathMetadata metadata, PathInits inits) {
        this(ProductUsedAttribute.class, metadata, inits);
    }

    public QProductUsedAttribute(Class<? extends ProductUsedAttribute> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productUsed = inits.isInitialized("productUsed") ? new QProductUsed(forProperty("productUsed"), inits.get("productUsed")) : null;
    }

}

