package com.myee.tarot.catering.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTableType is a Querydsl query type for TableType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTableType extends EntityPathBase<TableType> {

    private static final long serialVersionUID = -2050499468L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTableType tableType = new QTableType("tableType");

    public final NumberPath<Integer> capacity = createNumber("capacity", Integer.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> minimum = createNumber("minimum", Integer.class);

    public final StringPath name = createString("name");

    public final com.myee.tarot.merchant.domain.QMerchantStore store;

    public QTableType(String variable) {
        this(TableType.class, forVariable(variable), INITS);
    }

    public QTableType(Path<? extends TableType> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTableType(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTableType(PathMetadata metadata, PathInits inits) {
        this(TableType.class, metadata, inits);
    }

    public QTableType(Class<? extends TableType> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.store = inits.isInitialized("store") ? new com.myee.tarot.merchant.domain.QMerchantStore(forProperty("store"), inits.get("store")) : null;
    }

}

