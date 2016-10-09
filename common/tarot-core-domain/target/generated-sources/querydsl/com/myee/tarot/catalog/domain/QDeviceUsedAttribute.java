package com.myee.tarot.catalog.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeviceUsedAttribute is a Querydsl query type for DeviceUsedAttribute
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDeviceUsedAttribute extends EntityPathBase<DeviceUsedAttribute> {

    private static final long serialVersionUID = -2092136915L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeviceUsedAttribute deviceUsedAttribute = new QDeviceUsedAttribute("deviceUsedAttribute");

    public final QDeviceUsed deviceUsed;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final BooleanPath searchable = createBoolean("searchable");

    public final StringPath value = createString("value");

    public QDeviceUsedAttribute(String variable) {
        this(DeviceUsedAttribute.class, forVariable(variable), INITS);
    }

    public QDeviceUsedAttribute(Path<? extends DeviceUsedAttribute> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeviceUsedAttribute(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDeviceUsedAttribute(PathMetadata metadata, PathInits inits) {
        this(DeviceUsedAttribute.class, metadata, inits);
    }

    public QDeviceUsedAttribute(Class<? extends DeviceUsedAttribute> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.deviceUsed = inits.isInitialized("deviceUsed") ? new QDeviceUsed(forProperty("deviceUsed"), inits.get("deviceUsed")) : null;
    }

}

