package com.myee.tarot.profile.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomerAddress is a Querydsl query type for CustomerAddress
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomerAddress extends EntityPathBase<CustomerAddress> {

    private static final long serialVersionUID = -584357334L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomerAddress customerAddress = new QCustomerAddress("customerAddress");

    public final com.myee.tarot.reference.domain.QAddress address;

    public final StringPath addressName = createString("addressName");

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QCustomerAddress(String variable) {
        this(CustomerAddress.class, forVariable(variable), INITS);
    }

    public QCustomerAddress(Path<? extends CustomerAddress> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerAddress(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerAddress(PathMetadata metadata, PathInits inits) {
        this(CustomerAddress.class, metadata, inits);
    }

    public QCustomerAddress(Class<? extends CustomerAddress> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new com.myee.tarot.reference.domain.QAddress(forProperty("address"), inits.get("address")) : null;
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
    }

}

