package com.myee.tarot.catalog.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductUsed is a Querydsl query type for ProductUsed
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProductUsed extends EntityPathBase<ProductUsed> {

    private static final long serialVersionUID = -82176304L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductUsed productUsed = new QProductUsed("productUsed");

    public final ListPath<ProductUsedAttribute, QProductUsedAttribute> attributes = this.<ProductUsedAttribute, QProductUsedAttribute>createList("attributes", ProductUsedAttribute.class, QProductUsedAttribute.class, PathInits.DIRECT2);

    public final StringPath code = createString("code");

    public final StringPath description = createString("description");

    public final ListPath<DeviceUsed, QDeviceUsed> deviceUsed = this.<DeviceUsed, QDeviceUsed>createList("deviceUsed", DeviceUsed.class, QDeviceUsed.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath productNum = createString("productNum");

    public final com.myee.tarot.merchant.domain.QMerchantStore store;

    public final StringPath type = createString("type");

    public QProductUsed(String variable) {
        this(ProductUsed.class, forVariable(variable), INITS);
    }

    public QProductUsed(Path<? extends ProductUsed> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductUsed(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProductUsed(PathMetadata metadata, PathInits inits) {
        this(ProductUsed.class, metadata, inits);
    }

    public QProductUsed(Class<? extends ProductUsed> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.store = inits.isInitialized("store") ? new com.myee.tarot.merchant.domain.QMerchantStore(forProperty("store"), inits.get("store")) : null;
    }

}

