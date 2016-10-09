package com.myee.tarot.admin.domain;

import com.myee.tarot.merchant.domain.MerchantStore;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AdminUser.class)
public abstract class AdminUser_ {

	public static volatile SingularAttribute<AdminUser, Date> lastLogin;
	public static volatile SingularAttribute<AdminUser, String> password;
	public static volatile SingularAttribute<AdminUser, String> phoneNumber;
	public static volatile SingularAttribute<AdminUser, String> loginIP;
	public static volatile SingularAttribute<AdminUser, String> name;
	public static volatile SingularAttribute<AdminUser, Boolean> activeStatusFlag;
	public static volatile SetAttribute<AdminUser, AdminRole> allRoles;
	public static volatile SingularAttribute<AdminUser, Long> id;
	public static volatile SingularAttribute<AdminUser, String> login;
	public static volatile SingularAttribute<AdminUser, MerchantStore> merchantStore;
	public static volatile SetAttribute<AdminUser, AdminPermission> allPermissions;
	public static volatile SingularAttribute<AdminUser, String> email;

}

