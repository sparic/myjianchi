package com.myee.tarot.cms.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPageField is a Querydsl query type for PageField
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPageField extends EntityPathBase<PageField> {

    private static final long serialVersionUID = -219712641L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPageField pageField = new QPageField("pageField");

    public final com.myee.tarot.core.audit.QAuditable auditable;

    public final StringPath fieldKey = createString("fieldKey");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lobValue = createString("lobValue");

    public final QPage page;

    public final StringPath stringValue = createString("stringValue");

    public QPageField(String variable) {
        this(PageField.class, forVariable(variable), INITS);
    }

    public QPageField(Path<? extends PageField> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPageField(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPageField(PathMetadata metadata, PathInits inits) {
        this(PageField.class, metadata, inits);
    }

    public QPageField(Class<? extends PageField> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditable = inits.isInitialized("auditable") ? new com.myee.tarot.core.audit.QAuditable(forProperty("auditable")) : null;
        this.page = inits.isInitialized("page") ? new QPage(forProperty("page"), inits.get("page")) : null;
    }

}

