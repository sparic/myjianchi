package com.myee.tarot.admin.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AdminModule.class)
public abstract class AdminModule_ {

	public static volatile SingularAttribute<AdminModule, String> name;
	public static volatile SingularAttribute<AdminModule, String> icon;
	public static volatile SingularAttribute<AdminModule, Integer> displayOrder;
	public static volatile SingularAttribute<AdminModule, Long> id;
	public static volatile ListAttribute<AdminModule, AdminSection> sections;
	public static volatile SingularAttribute<AdminModule, String> moduleKey;

}

