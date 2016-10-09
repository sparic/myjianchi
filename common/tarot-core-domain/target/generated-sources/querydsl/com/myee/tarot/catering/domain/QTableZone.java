package com.myee.tarot.catering.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTableZone is a Querydsl query type for TableZone
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTableZone extends EntityPathBase<TableZone> {

    private static final long serialVersionUID = -2050330394L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTableZone tableZone = new QTableZone("tableZone");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.myee.tarot.merchant.domain.QMerchantStore store;

    public QTableZone(String variable) {
        this(TableZone.class, forVariable(variable), INITS);
    }

    public QTableZone(Path<? extends TableZone> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTableZone(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTableZone(PathMetadata metadata, PathInits inits) {
        this(TableZone.class, metadata, inits);
    }

    public QTableZone(Class<? extends TableZone> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.store = inits.isInitialized("store") ? new com.myee.tarot.merchant.domain.QMerchantStore(forProperty("store"), inits.get("store")) : null;
    }

}

