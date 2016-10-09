package com.myee.tarot.profile.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CustomerForgotPasswordSecurityToken.class)
public abstract class CustomerForgotPasswordSecurityToken_ {

	public static volatile SingularAttribute<CustomerForgotPasswordSecurityToken, Long> customerId;
	public static volatile SingularAttribute<CustomerForgotPasswordSecurityToken, Boolean> tokenUsedFlag;
	public static volatile SingularAttribute<CustomerForgotPasswordSecurityToken, String> id;
	public static volatile SingularAttribute<CustomerForgotPasswordSecurityToken, Date> tokenUsedDate;
	public static volatile SingularAttribute<CustomerForgotPasswordSecurityToken, Date> createDate;

}

