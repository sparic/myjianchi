package com.myee.tarot.profile.domain;

import com.myee.tarot.core.audit.Auditable;
import com.myee.tarot.reference.domain.Locale;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> lastName;
	public static volatile SingularAttribute<Customer, Boolean> passwordChangeRequired;
	public static volatile SingularAttribute<Customer, String> challengeAnswer;
	public static volatile ListAttribute<Customer, CustomerAddress> customerAddresses;
	public static volatile ListAttribute<Customer, CustomerPayment> customerPayments;
	public static volatile SingularAttribute<Customer, Boolean> receiveEmail;
	public static volatile SingularAttribute<Customer, Boolean> registered;
	public static volatile SingularAttribute<Customer, String> taxExemptionCode;
	public static volatile SingularAttribute<Customer, Boolean> deactivated;
	public static volatile SingularAttribute<Customer, Locale> customerLocale;
	public static volatile SingularAttribute<Customer, String> firstName;
	public static volatile SingularAttribute<Customer, String> password;
	public static volatile SingularAttribute<Customer, String> emailAddress;
	public static volatile MapAttribute<Customer, String, CustomerAttribute> customerAttributes;
	public static volatile SingularAttribute<Customer, Auditable> auditable;
	public static volatile SingularAttribute<Customer, Long> id;
	public static volatile SingularAttribute<Customer, ChallengeQuestion> challengeQuestion;
	public static volatile ListAttribute<Customer, CustomerPhone> customerPhones;
	public static volatile SingularAttribute<Customer, String> username;

}

