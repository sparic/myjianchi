package com.myee.tarot.core.domain;

import com.myee.tarot.core.audit.Auditable;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Description.class)
public abstract class Description_ {

	public static volatile SingularAttribute<Description, Auditable> auditable;
	public static volatile SingularAttribute<Description, String> name;
	public static volatile SingularAttribute<Description, String> description;
	public static volatile SingularAttribute<Description, Long> id;
	public static volatile SingularAttribute<Description, String> title;

}

