package com.myee.tarot.admin.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QForgotPasswordSecurityToken is a Querydsl query type for ForgotPasswordSecurityToken
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QForgotPasswordSecurityToken extends EntityPathBase<ForgotPasswordSecurityToken> {

    private static final long serialVersionUID = -1021974231L;

    public static final QForgotPasswordSecurityToken forgotPasswordSecurityToken = new QForgotPasswordSecurityToken("forgotPasswordSecurityToken");

    public final NumberPath<Long> adminUserId = createNumber("adminUserId", Long.class);

    public final DateTimePath<java.util.Date> createDate = createDateTime("createDate", java.util.Date.class);

    public final StringPath token = createString("token");

    public final DateTimePath<java.util.Date> tokenUsedDate = createDateTime("tokenUsedDate", java.util.Date.class);

    public final BooleanPath tokenUsedFlag = createBoolean("tokenUsedFlag");

    public QForgotPasswordSecurityToken(String variable) {
        super(ForgotPasswordSecurityToken.class, forVariable(variable));
    }

    public QForgotPasswordSecurityToken(Path<? extends ForgotPasswordSecurityToken> path) {
        super(path.getType(), path.getMetadata());
    }

    public QForgotPasswordSecurityToken(PathMetadata metadata) {
        super(ForgotPasswordSecurityToken.class, metadata);
    }

}

