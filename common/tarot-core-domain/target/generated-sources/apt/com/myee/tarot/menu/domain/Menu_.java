package com.myee.tarot.menu.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Menu.class)
public abstract class Menu_ {

	public static volatile SingularAttribute<Menu, String> name;
	public static volatile ListAttribute<Menu, MenuItem> menuItems;
	public static volatile SingularAttribute<Menu, Long> id;

}

