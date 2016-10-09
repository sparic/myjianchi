package com.myee.tarot.profile.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomerPhone is a Querydsl query type for CustomerPhone
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomerPhone extends EntityPathBase<CustomerPhone> {

    private static final long serialVersionUID = -1881595612L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomerPhone customerPhone = new QCustomerPhone("customerPhone");

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.myee.tarot.reference.domain.QPhone phone;

    public final StringPath phoneName = createString("phoneName");

    public QCustomerPhone(String variable) {
        this(CustomerPhone.class, forVariable(variable), INITS);
    }

    public QCustomerPhone(Path<? extends CustomerPhone> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerPhone(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerPhone(PathMetadata metadata, PathInits inits) {
        this(CustomerPhone.class, metadata, inits);
    }

    public QCustomerPhone(Class<? extends CustomerPhone> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.phone = inits.isInitialized("phone") ? new com.myee.tarot.reference.domain.QPhone(forProperty("phone")) : null;
    }

}

