package com.myee.tarot.catering.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTable is a Querydsl query type for Table
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTable extends EntityPathBase<Table> {

    private static final long serialVersionUID = 324826650L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTable table = new QTable("table");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.myee.tarot.merchant.domain.QMerchantStore store;

    public final QTableType tableType;

    public final QTableZone tableZone;

    public QTable(String variable) {
        this(Table.class, forVariable(variable), INITS);
    }

    public QTable(Path<? extends Table> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTable(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTable(PathMetadata metadata, PathInits inits) {
        this(Table.class, metadata, inits);
    }

    public QTable(Class<? extends Table> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.store = inits.isInitialized("store") ? new com.myee.tarot.merchant.domain.QMerchantStore(forProperty("store"), inits.get("store")) : null;
        this.tableType = inits.isInitialized("tableType") ? new QTableType(forProperty("tableType"), inits.get("tableType")) : null;
        this.tableZone = inits.isInitialized("tableZone") ? new QTableZone(forProperty("tableZone"), inits.get("tableZone")) : null;
    }

}

