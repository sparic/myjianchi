package com.myee.tarot.reference.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Phone.class)
public abstract class Phone_ {

	public static volatile SingularAttribute<Phone, String> extension;
	public static volatile SingularAttribute<Phone, Boolean> isDefault;
	public static volatile SingularAttribute<Phone, String> phoneNumber;
	public static volatile SingularAttribute<Phone, String> countryCode;
	public static volatile SingularAttribute<Phone, Long> id;
	public static volatile SingularAttribute<Phone, Boolean> isActive;

}

