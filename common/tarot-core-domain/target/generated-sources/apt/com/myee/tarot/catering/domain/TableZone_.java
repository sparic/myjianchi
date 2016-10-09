package com.myee.tarot.catering.domain;

import com.myee.tarot.merchant.domain.MerchantStore;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TableZone.class)
public abstract class TableZone_ {

	public static volatile SingularAttribute<TableZone, String> name;
	public static volatile SingularAttribute<TableZone, String> description;
	public static volatile SingularAttribute<TableZone, Long> id;
	public static volatile SingularAttribute<TableZone, MerchantStore> store;

}

