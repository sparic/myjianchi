package com.myee.tarot.catering.domain;

import com.myee.tarot.merchant.domain.MerchantStore;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TableType.class)
public abstract class TableType_ {

	public static volatile SingularAttribute<TableType, String> name;
	public static volatile SingularAttribute<TableType, String> description;
	public static volatile SingularAttribute<TableType, Long> id;
	public static volatile SingularAttribute<TableType, MerchantStore> store;
	public static volatile SingularAttribute<TableType, Integer> minimum;
	public static volatile SingularAttribute<TableType, Integer> capacity;

}

