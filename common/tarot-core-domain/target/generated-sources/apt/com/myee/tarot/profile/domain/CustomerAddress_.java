package com.myee.tarot.profile.domain;

import com.myee.tarot.reference.domain.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CustomerAddress.class)
public abstract class CustomerAddress_ {

	public static volatile SingularAttribute<CustomerAddress, Address> address;
	public static volatile SingularAttribute<CustomerAddress, String> addressName;
	public static volatile SingularAttribute<CustomerAddress, Long> id;
	public static volatile SingularAttribute<CustomerAddress, Customer> customer;

}

