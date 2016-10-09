package com.myee.tarot.profile.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = 1328782954L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomer customer = new QCustomer("customer");

    public final com.myee.tarot.core.audit.QAuditable auditable;

    public final StringPath challengeAnswer = createString("challengeAnswer");

    public final QChallengeQuestion challengeQuestion;

    public final ListPath<CustomerAddress, QCustomerAddress> customerAddresses = this.<CustomerAddress, QCustomerAddress>createList("customerAddresses", CustomerAddress.class, QCustomerAddress.class, PathInits.DIRECT2);

    public final MapPath<String, CustomerAttribute, QCustomerAttribute> customerAttributes = this.<String, CustomerAttribute, QCustomerAttribute>createMap("customerAttributes", String.class, CustomerAttribute.class, QCustomerAttribute.class);

    public final com.myee.tarot.reference.domain.QLocale customerLocale;

    public final ListPath<CustomerPayment, QCustomerPayment> customerPayments = this.<CustomerPayment, QCustomerPayment>createList("customerPayments", CustomerPayment.class, QCustomerPayment.class, PathInits.DIRECT2);

    public final ListPath<CustomerPhone, QCustomerPhone> customerPhones = this.<CustomerPhone, QCustomerPhone>createList("customerPhones", CustomerPhone.class, QCustomerPhone.class, PathInits.DIRECT2);

    public final BooleanPath deactivated = createBoolean("deactivated");

    public final StringPath emailAddress = createString("emailAddress");

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastName = createString("lastName");

    public final StringPath password = createString("password");

    public final BooleanPath passwordChangeRequired = createBoolean("passwordChangeRequired");

    public final BooleanPath receiveEmail = createBoolean("receiveEmail");

    public final BooleanPath registered = createBoolean("registered");

    public final StringPath taxExemptionCode = createString("taxExemptionCode");

    public final StringPath username = createString("username");

    public QCustomer(String variable) {
        this(Customer.class, forVariable(variable), INITS);
    }

    public QCustomer(Path<? extends Customer> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomer(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomer(PathMetadata metadata, PathInits inits) {
        this(Customer.class, metadata, inits);
    }

    public QCustomer(Class<? extends Customer> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditable = inits.isInitialized("auditable") ? new com.myee.tarot.core.audit.QAuditable(forProperty("auditable")) : null;
        this.challengeQuestion = inits.isInitialized("challengeQuestion") ? new QChallengeQuestion(forProperty("challengeQuestion")) : null;
        this.customerLocale = inits.isInitialized("customerLocale") ? new com.myee.tarot.reference.domain.QLocale(forProperty("customerLocale")) : null;
    }

}

