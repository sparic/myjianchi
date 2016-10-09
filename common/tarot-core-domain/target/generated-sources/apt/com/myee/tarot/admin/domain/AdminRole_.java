package com.myee.tarot.admin.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AdminRole.class)
public abstract class AdminRole_ {

	public static volatile SetAttribute<AdminRole, AdminUser> allUsers;
	public static volatile SingularAttribute<AdminRole, String> name;
	public static volatile SingularAttribute<AdminRole, String> description;
	public static volatile SingularAttribute<AdminRole, Long> id;
	public static volatile SetAttribute<AdminRole, AdminPermission> allPermissions;

}

