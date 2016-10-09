package com.myee.tarot.cms.domain;

import com.myee.tarot.core.audit.Auditable;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PageField.class)
public abstract class PageField_ {

	public static volatile SingularAttribute<PageField, String> stringValue;
	public static volatile SingularAttribute<PageField, String> fieldKey;
	public static volatile SingularAttribute<PageField, String> lobValue;
	public static volatile SingularAttribute<PageField, Auditable> auditable;
	public static volatile SingularAttribute<PageField, Long> id;
	public static volatile SingularAttribute<PageField, Page> page;

}

