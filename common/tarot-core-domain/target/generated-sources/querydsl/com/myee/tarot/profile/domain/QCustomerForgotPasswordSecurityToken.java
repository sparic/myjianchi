package com.myee.tarot.profile.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCustomerForgotPasswordSecurityToken is a Querydsl query type for CustomerForgotPasswordSecurityToken
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomerForgotPasswordSecurityToken extends EntityPathBase<CustomerForgotPasswordSecurityToken> {

    private static final long serialVersionUID = 1399917457L;

    public static final QCustomerForgotPasswordSecurityToken customerForgotPasswordSecurityToken = new QCustomerForgotPasswordSecurityToken("customerForgotPasswordSecurityToken");

    public final DateTimePath<java.util.Date> createDate = createDateTime("createDate", java.util.Date.class);

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath id = createString("id");

    public final DateTimePath<java.util.Date> tokenUsedDate = createDateTime("tokenUsedDate", java.util.Date.class);

    public final BooleanPath tokenUsedFlag = createBoolean("tokenUsedFlag");

    public QCustomerForgotPasswordSecurityToken(String variable) {
        super(CustomerForgotPasswordSecurityToken.class, forVariable(variable));
    }

    public QCustomerForgotPasswordSecurityToken(Path<? extends CustomerForgotPasswordSecurityToken> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomerForgotPasswordSecurityToken(PathMetadata metadata) {
        super(CustomerForgotPasswordSecurityToken.class, metadata);
    }

}

