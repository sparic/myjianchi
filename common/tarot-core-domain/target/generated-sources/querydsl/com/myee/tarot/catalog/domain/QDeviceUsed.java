package com.myee.tarot.catalog.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeviceUsed is a Querydsl query type for DeviceUsed
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDeviceUsed extends EntityPathBase<DeviceUsed> {

    private static final long serialVersionUID = -1251530449L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeviceUsed deviceUsed = new QDeviceUsed("deviceUsed");

    public final ListPath<DeviceUsedAttribute, QDeviceUsedAttribute> attributes = this.<DeviceUsedAttribute, QDeviceUsedAttribute>createList("attributes", DeviceUsedAttribute.class, QDeviceUsedAttribute.class, PathInits.DIRECT2);

    public final StringPath boardNo = createString("boardNo");

    public final StringPath description = createString("description");

    public final QDevice device;

    public final StringPath deviceNum = createString("deviceNum");

    public final StringPath heartbeat = createString("heartbeat");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<ProductUsed, QProductUsed> productUsed = this.<ProductUsed, QProductUsed>createList("productUsed", ProductUsed.class, QProductUsed.class, PathInits.DIRECT2);

    public final com.myee.tarot.merchant.domain.QMerchantStore store;

    public QDeviceUsed(String variable) {
        this(DeviceUsed.class, forVariable(variable), INITS);
    }

    public QDeviceUsed(Path<? extends DeviceUsed> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeviceUsed(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeviceUsed(PathMetadata metadata, PathInits inits) {
        this(DeviceUsed.class, metadata, inits);
    }

    public QDeviceUsed(Class<? extends DeviceUsed> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.device = inits.isInitialized("device") ? new QDevice(forProperty("device")) : null;
        this.store = inits.isInitialized("store") ? new com.myee.tarot.merchant.domain.QMerchantStore(forProperty("store"), inits.get("store")) : null;
    }

}

