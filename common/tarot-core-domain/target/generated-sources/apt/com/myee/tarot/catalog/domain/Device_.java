package com.myee.tarot.catalog.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Device.class)
public abstract class Device_ {

	public static volatile SingularAttribute<Device, String> versionNum;
	public static volatile SingularAttribute<Device, String> name;
	public static volatile SingularAttribute<Device, String> description;
	public static volatile ListAttribute<Device, DeviceAttribute> attributes;
	public static volatile SingularAttribute<Device, Long> id;

}

