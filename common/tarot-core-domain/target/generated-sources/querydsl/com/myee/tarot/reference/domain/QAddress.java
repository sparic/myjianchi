package com.myee.tarot.reference.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAddress is a Querydsl query type for Address
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAddress extends EntityPathBase<Address> {

    private static final long serialVersionUID = -750527546L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAddress address1 = new QAddress("address1");

    public final StringPath address = createString("address");

    public final QGeoZone circle;

    public final QGeoZone city;

    public final QGeoZone county;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    public final QGeoZone mall;

    public final StringPath postalCode = createString("postalCode");

    public final QGeoZone province;

    public final StringPath travelInfo = createString("travelInfo");

    public QAddress(String variable) {
        this(Address.class, forVariable(variable), INITS);
    }

    public QAddress(Path<? extends Address> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAddress(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAddress(PathMetadata metadata, PathInits inits) {
        this(Address.class, metadata, inits);
    }

    public QAddress(Class<? extends Address> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.circle = inits.isInitialized("circle") ? new QGeoZone(forProperty("circle")) : null;
        this.city = inits.isInitialized("city") ? new QGeoZone(forProperty("city")) : null;
        this.county = inits.isInitialized("county") ? new QGeoZone(forProperty("county")) : null;
        this.mall = inits.isInitialized("mall") ? new QGeoZone(forProperty("mall")) : null;
        this.province = inits.isInitialized("province") ? new QGeoZone(forProperty("province")) : null;
    }

}

