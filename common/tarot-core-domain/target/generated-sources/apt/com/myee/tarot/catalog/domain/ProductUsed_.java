package com.myee.tarot.catalog.domain;

import com.myee.tarot.merchant.domain.MerchantStore;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProductUsed.class)
public abstract class ProductUsed_ {

	public static volatile SingularAttribute<ProductUsed, String> code;
	public static volatile ListAttribute<ProductUsed, DeviceUsed> deviceUsed;
	public static volatile SingularAttribute<ProductUsed, String> description;
	public static volatile ListAttribute<ProductUsed, ProductUsedAttribute> attributes;
	public static volatile SingularAttribute<ProductUsed, Long> id;
	public static volatile SingularAttribute<ProductUsed, MerchantStore> store;
	public static volatile SingularAttribute<ProductUsed, String> productNum;
	public static volatile SingularAttribute<ProductUsed, String> type;

}

