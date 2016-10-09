package com.myee.tarot.reference.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static volatile SingularAttribute<Address, String> address;
	public static volatile SingularAttribute<Address, GeoZone> province;
	public static volatile SingularAttribute<Address, GeoZone> city;
	public static volatile SingularAttribute<Address, GeoZone> mall;
	public static volatile SingularAttribute<Address, String> postalCode;
	public static volatile SingularAttribute<Address, Double> latitude;
	public static volatile SingularAttribute<Address, GeoZone> county;
	public static volatile SingularAttribute<Address, String> travelInfo;
	public static volatile SingularAttribute<Address, Long> id;
	public static volatile SingularAttribute<Address, GeoZone> circle;
	public static volatile SingularAttribute<Address, Double> longitude;

}

