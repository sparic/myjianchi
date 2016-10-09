package com.myee.tarot.cms.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPageTemplateFieldGroupXref is a Querydsl query type for PageTemplateFieldGroupXref
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPageTemplateFieldGroupXref extends EntityPathBase<PageTemplateFieldGroupXref> {

    private static final long serialVersionUID = 1541043093L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPageTemplateFieldGroupXref pageTemplateFieldGroupXref = new QPageTemplateFieldGroupXref("pageTemplateFieldGroupXref");

    public final NumberPath<java.math.BigDecimal> groupOrder = createNumber("groupOrder", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QPageTemplate pageTemplate;

    public QPageTemplateFieldGroupXref(String variable) {
        this(PageTemplateFieldGroupXref.class, forVariable(variable), INITS);
    }

    public QPageTemplateFieldGroupXref(Path<? extends PageTemplateFieldGroupXref> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPageTemplateFieldGroupXref(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPageTemplateFieldGroupXref(PathMetadata metadata, PathInits inits) {
        this(PageTemplateFieldGroupXref.class, metadata, inits);
    }

    public QPageTemplateFieldGroupXref(Class<? extends PageTemplateFieldGroupXref> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pageTemplate = inits.isInitialized("pageTemplate") ? new QPageTemplate(forProperty("pageTemplate"), inits.get("pageTemplate")) : null;
    }

}

