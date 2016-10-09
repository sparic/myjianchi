package com.myee.tarot.cms.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Page.class)
public abstract class Page_ {

	public static volatile MapAttribute<Page, String, PageField> pageFields;
	public static volatile SingularAttribute<Page, Date> activeStartDate;
	public static volatile SingularAttribute<Page, String> fullUrl;
	public static volatile SingularAttribute<Page, Boolean> excludeFromSiteMap;
	public static volatile SingularAttribute<Page, PageTemplate> pageTemplate;
	public static volatile SingularAttribute<Page, String> description;
	public static volatile SingularAttribute<Page, Integer> priority;
	public static volatile SingularAttribute<Page, Boolean> offlineFlag;
	public static volatile SingularAttribute<Page, String> metaDescription;
	public static volatile SingularAttribute<Page, String> metaTitle;
	public static volatile SingularAttribute<Page, Long> id;
	public static volatile SingularAttribute<Page, Date> activeEndDate;
	public static volatile MapAttribute<Page, String, PageAttribute> additionalAttributes;

}

