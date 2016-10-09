package com.myee.tarot.profile.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomerPayment is a Querydsl query type for CustomerPayment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomerPayment extends EntityPathBase<CustomerPayment> {

    private static final long serialVersionUID = -223346628L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomerPayment customerPayment = new QCustomerPayment("customerPayment");

    public final MapPath<String, String, StringPath> additionalFields = this.<String, String, StringPath>createMap("additionalFields", String.class, String.class, StringPath.class);

    public final com.myee.tarot.reference.domain.QAddress billingAddress;

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isDefault = createBoolean("isDefault");

    public final StringPath paymentToken = createString("paymentToken");

    public QCustomerPayment(String variable) {
        this(CustomerPayment.class, forVariable(variable), INITS);
    }

    public QCustomerPayment(Path<? extends CustomerPayment> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerPayment(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerPayment(PathMetadata metadata, PathInits inits) {
        this(CustomerPayment.class, metadata, inits);
    }

    public QCustomerPayment(Class<? extends CustomerPayment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.billingAddress = inits.isInitialized("billingAddress") ? new com.myee.tarot.reference.domain.QAddress(forProperty("billingAddress"), inits.get("billingAddress")) : null;
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
    }

}

