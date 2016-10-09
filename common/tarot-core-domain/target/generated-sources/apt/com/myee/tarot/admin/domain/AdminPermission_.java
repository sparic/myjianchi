package com.myee.tarot.admin.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AdminPermission.class)
public abstract class AdminPermission_ {

	public static volatile SingularAttribute<AdminPermission, Boolean> isFriendly;
	public static volatile SetAttribute<AdminPermission, AdminUser> allUsers;
	public static volatile SingularAttribute<AdminPermission, String> name;
	public static volatile SingularAttribute<AdminPermission, String> description;
	public static volatile SetAttribute<AdminPermission, AdminRole> allRoles;
	public static volatile ListAttribute<AdminPermission, AdminPermission> allChildPermissions;
	public static volatile SingularAttribute<AdminPermission, Long> id;
	public static volatile SingularAttribute<AdminPermission, String> type;
	public static volatile ListAttribute<AdminPermission, AdminPermissionQualifiedEntity> qualifiedEntities;
	public static volatile ListAttribute<AdminPermission, AdminPermission> allParentPermissions;

}

