package com.myee.tarot.profile.domain;

import com.myee.tarot.reference.domain.Phone;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CustomerPhone.class)
public abstract class CustomerPhone_ {

	public static volatile SingularAttribute<CustomerPhone, Phone> phone;
	public static volatile SingularAttribute<CustomerPhone, Long> id;
	public static volatile SingularAttribute<CustomerPhone, String> phoneName;
	public static volatile SingularAttribute<CustomerPhone, Customer> customer;

}

