package com.myee.tarot.cms.domain;

import com.myee.tarot.reference.domain.Locale;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PageTemplate.class)
public abstract class PageTemplate_ {

	public static volatile ListAttribute<PageTemplate, PageTemplateFieldGroupXref> fieldGroups;
	public static volatile SingularAttribute<PageTemplate, String> templateName;
	public static volatile SingularAttribute<PageTemplate, String> templateDescription;
	public static volatile SingularAttribute<PageTemplate, Long> id;
	public static volatile SingularAttribute<PageTemplate, Locale> locale;
	public static volatile SingularAttribute<PageTemplate, String> templatePath;

}

