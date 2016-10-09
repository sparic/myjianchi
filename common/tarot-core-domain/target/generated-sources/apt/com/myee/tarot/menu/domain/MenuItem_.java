package com.myee.tarot.menu.domain;

import com.myee.tarot.cms.domain.Page;
import com.myee.tarot.reference.domain.Media;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MenuItem.class)
public abstract class MenuItem_ {

	public static volatile SingularAttribute<MenuItem, Menu> linkedMenu;
	public static volatile SingularAttribute<MenuItem, BigDecimal> sequence;
	public static volatile SingularAttribute<MenuItem, Media> image;
	public static volatile SingularAttribute<MenuItem, Page> linkedPage;
	public static volatile SingularAttribute<MenuItem, String> altText;
	public static volatile SingularAttribute<MenuItem, String> actionUrl;
	public static volatile SingularAttribute<MenuItem, Long> id;
	public static volatile SingularAttribute<MenuItem, String> label;
	public static volatile SingularAttribute<MenuItem, String> type;
	public static volatile SingularAttribute<MenuItem, Menu> parentMenu;
	public static volatile SingularAttribute<MenuItem, String> customHtml;

}

