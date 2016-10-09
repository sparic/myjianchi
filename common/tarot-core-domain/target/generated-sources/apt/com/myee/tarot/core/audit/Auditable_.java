package com.myee.tarot.core.audit;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Auditable.class)
public abstract class Auditable_ {

	public static volatile SingularAttribute<Auditable, Date> dateCreated;
	public static volatile SingularAttribute<Auditable, Long> updatedBy;
	public static volatile SingularAttribute<Auditable, Long> createdBy;
	public static volatile SingularAttribute<Auditable, Date> dateUpdated;

}

