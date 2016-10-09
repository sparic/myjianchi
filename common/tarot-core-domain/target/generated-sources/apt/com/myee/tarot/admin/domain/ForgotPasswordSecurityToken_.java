package com.myee.tarot.admin.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ForgotPasswordSecurityToken.class)
public abstract class ForgotPasswordSecurityToken_ {

	public static volatile SingularAttribute<ForgotPasswordSecurityToken, Long> adminUserId;
	public static volatile SingularAttribute<ForgotPasswordSecurityToken, Boolean> tokenUsedFlag;
	public static volatile SingularAttribute<ForgotPasswordSecurityToken, Date> tokenUsedDate;
	public static volatile SingularAttribute<ForgotPasswordSecurityToken, String> token;
	public static volatile SingularAttribute<ForgotPasswordSecurityToken, Date> createDate;

}

