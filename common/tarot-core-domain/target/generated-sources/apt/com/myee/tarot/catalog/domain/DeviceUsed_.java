package com.myee.tarot.catalog.domain;

import com.myee.tarot.merchant.domain.MerchantStore;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DeviceUsed.class)
public abstract class DeviceUsed_ {

	public static volatile SingularAttribute<DeviceUsed, String> deviceNum;
	public static volatile ListAttribute<DeviceUsed, ProductUsed> productUsed;
	public static volatile SingularAttribute<DeviceUsed, String> heartbeat;
	public static volatile SingularAttribute<DeviceUsed, String> name;
	public static volatile SingularAttribute<DeviceUsed, String> description;
	public static volatile ListAttribute<DeviceUsed, DeviceUsedAttribute> attributes;
	public static volatile SingularAttribute<DeviceUsed, Long> id;
	public static volatile SingularAttribute<DeviceUsed, MerchantStore> store;
	public static volatile SingularAttribute<DeviceUsed, Device> device;
	public static volatile SingularAttribute<DeviceUsed, String> boardNo;

}

