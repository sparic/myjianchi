package com.myee.tarot.cms.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPageTemplate is a Querydsl query type for PageTemplate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPageTemplate extends EntityPathBase<PageTemplate> {

    private static final long serialVersionUID = -321572907L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPageTemplate pageTemplate = new QPageTemplate("pageTemplate");

    public final ListPath<PageTemplateFieldGroupXref, QPageTemplateFieldGroupXref> fieldGroups = this.<PageTemplateFieldGroupXref, QPageTemplateFieldGroupXref>createList("fieldGroups", PageTemplateFieldGroupXref.class, QPageTemplateFieldGroupXref.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.myee.tarot.reference.domain.QLocale locale;

    public final StringPath templateDescription = createString("templateDescription");

    public final StringPath templateName = createString("templateName");

    public final StringPath templatePath = createString("templatePath");

    public QPageTemplate(String variable) {
        this(PageTemplate.class, forVariable(variable), INITS);
    }

    public QPageTemplate(Path<? extends PageTemplate> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPageTemplate(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPageTemplate(PathMetadata metadata, PathInits inits) {
        this(PageTemplate.class, metadata, inits);
    }

    public QPageTemplate(Class<? extends PageTemplate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.locale = inits.isInitialized("locale") ? new com.myee.tarot.reference.domain.QLocale(forProperty("locale")) : null;
    }

}

