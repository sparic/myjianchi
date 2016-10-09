package com.myee.tarot.admin.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AdminSection.class)
public abstract class AdminSection_ {

	public static volatile SingularAttribute<AdminSection, String> ceilingEntity;
	public static volatile ListAttribute<AdminSection, AdminPermission> permissions;
	public static volatile SingularAttribute<AdminSection, AdminModule> module;
	public static volatile SingularAttribute<AdminSection, String> name;
	public static volatile SingularAttribute<AdminSection, Integer> displayOrder;
	public static volatile SingularAttribute<AdminSection, Long> id;
	public static volatile SingularAttribute<AdminSection, String> sectionKey;
	public static volatile SingularAttribute<AdminSection, String> url;

}

