package com.myee.tarot.profile.domain;

import com.myee.tarot.reference.domain.Role;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CustomerRole.class)
public abstract class CustomerRole_ {

	public static volatile SingularAttribute<CustomerRole, Role> role;
	public static volatile SingularAttribute<CustomerRole, Long> id;
	public static volatile SingularAttribute<CustomerRole, Customer> customer;

}

