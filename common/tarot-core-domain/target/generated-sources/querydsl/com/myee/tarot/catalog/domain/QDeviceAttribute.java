package com.myee.tarot.catalog.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeviceAttribute is a Querydsl query type for DeviceAttribute
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDeviceAttribute extends EntityPathBase<DeviceAttribute> {

    private static final long serialVersionUID = -474086294L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeviceAttribute deviceAttribute = new QDeviceAttribute("deviceAttribute");

    public final QDevice device;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final BooleanPath searchable = createBoolean("searchable");

    public final StringPath value = createString("value");

    public QDeviceAttribute(String variable) {
        this(DeviceAttribute.class, forVariable(variable), INITS);
    }

    public QDeviceAttribute(Path<? extends DeviceAttribute> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeviceAttribute(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeviceAttribute(PathMetadata metadata, PathInits inits) {
        this(DeviceAttribute.class, metadata, inits);
    }

    public QDeviceAttribute(Class<? extends DeviceAttribute> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.device = inits.isInitialized("device") ? new QDevice(forProperty("device")) : null;
    }

}

