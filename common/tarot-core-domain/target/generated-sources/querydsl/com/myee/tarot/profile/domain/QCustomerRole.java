package com.myee.tarot.profile.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomerRole is a Querydsl query type for CustomerRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomerRole extends EntityPathBase<CustomerRole> {

    private static final long serialVersionUID = 909200896L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomerRole customerRole = new QCustomerRole("customerRole");

    public final QCustomer customer;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.myee.tarot.reference.domain.QRole role;

    public QCustomerRole(String variable) {
        this(CustomerRole.class, forVariable(variable), INITS);
    }

    public QCustomerRole(Path<? extends CustomerRole> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerRole(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomerRole(PathMetadata metadata, PathInits inits) {
        this(CustomerRole.class, metadata, inits);
    }

    public QCustomerRole(Class<? extends CustomerRole> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.role = inits.isInitialized("role") ? new com.myee.tarot.reference.domain.QRole(forProperty("role")) : null;
    }

}

