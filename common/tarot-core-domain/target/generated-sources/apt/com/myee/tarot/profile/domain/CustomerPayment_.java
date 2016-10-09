package com.myee.tarot.profile.domain;

import com.myee.tarot.reference.domain.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CustomerPayment.class)
public abstract class CustomerPayment_ {

	public static volatile SingularAttribute<CustomerPayment, String> paymentToken;
	public static volatile SingularAttribute<CustomerPayment, Boolean> isDefault;
	public static volatile MapAttribute<CustomerPayment, String, String> additionalFields;
	public static volatile SingularAttribute<CustomerPayment, Long> id;
	public static volatile SingularAttribute<CustomerPayment, Address> billingAddress;
	public static volatile SingularAttribute<CustomerPayment, Customer> customer;

}

