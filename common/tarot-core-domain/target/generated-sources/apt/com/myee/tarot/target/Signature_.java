package com.myee.tarot.target;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Signature.class)
public abstract class Signature_ {

	public static volatile SingularAttribute<Signature, Date> signTime;
	public static volatile SingularAttribute<Signature, Integer> signedStatus;
	public static volatile SingularAttribute<Signature, Long> id;
	public static volatile SingularAttribute<Signature, Target> target;

}

