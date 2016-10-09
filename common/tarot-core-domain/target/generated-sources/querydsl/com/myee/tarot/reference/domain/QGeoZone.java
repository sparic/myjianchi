package com.myee.tarot.reference.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGeoZone is a Querydsl query type for GeoZone
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGeoZone extends EntityPathBase<GeoZone> {

    private static final long serialVersionUID = 317609583L;

    public static final QGeoZone geoZone = new QGeoZone("geoZone");

    public final StringPath code = createString("code");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> level = createNumber("level", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> parent = createNumber("parent", Long.class);

    public QGeoZone(String variable) {
        super(GeoZone.class, forVariable(variable));
    }

    public QGeoZone(Path<? extends GeoZone> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGeoZone(PathMetadata metadata) {
        super(GeoZone.class, metadata);
    }

}

