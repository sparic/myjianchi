package com.myee.tarot.merchant.domain;

import com.myee.tarot.reference.domain.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MerchantStore.class)
public abstract class MerchantStore_ {

	public static volatile SingularAttribute<MerchantStore, Integer> cpp;
	public static volatile SingularAttribute<MerchantStore, String> code;
	public static volatile SingularAttribute<MerchantStore, Address> address;
	public static volatile SingularAttribute<MerchantStore, String> phone;
	public static volatile SingularAttribute<MerchantStore, Float> ratings;
	public static volatile SingularAttribute<MerchantStore, String> postalCode;
	public static volatile SingularAttribute<MerchantStore, String> name;
	public static volatile SingularAttribute<MerchantStore, String> description;
	public static volatile SingularAttribute<MerchantStore, Merchant> merchant;
	public static volatile SingularAttribute<MerchantStore, Long> id;
	public static volatile SingularAttribute<MerchantStore, Boolean> experience;

}

