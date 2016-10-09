package com.myee.tarot.catering.domain;

import com.myee.tarot.merchant.domain.MerchantStore;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Table.class)
public abstract class Table_ {

	public static volatile SingularAttribute<Table, TableType> tableType;
	public static volatile SingularAttribute<Table, TableZone> tableZone;
	public static volatile SingularAttribute<Table, String> name;
	public static volatile SingularAttribute<Table, String> description;
	public static volatile SingularAttribute<Table, Long> id;
	public static volatile SingularAttribute<Table, MerchantStore> store;

}

