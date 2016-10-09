package com.myee.tarot.catalog.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DeviceAttribute.class)
public abstract class DeviceAttribute_ {

	public static volatile SingularAttribute<DeviceAttribute, String> name;
	public static volatile SingularAttribute<DeviceAttribute, Long> id;
	public static volatile SingularAttribute<DeviceAttribute, String> value;
	public static volatile SingularAttribute<DeviceAttribute, Device> device;
	public static volatile SingularAttribute<DeviceAttribute, Boolean> searchable;

}

