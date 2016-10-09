package com.myee.tarot.core.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDescription is a Querydsl query type for Description
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QDescription extends EntityPathBase<Description> {

    private static final long serialVersionUID = -2007964888L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDescription description1 = new QDescription("description1");

    public final com.myee.tarot.core.audit.QAuditable auditable;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath title = createString("title");

    public QDescription(String variable) {
        this(Description.class, forVariable(variable), INITS);
    }

    public QDescription(Path<? extends Description> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDescription(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDescription(PathMetadata metadata, PathInits inits) {
        this(Description.class, metadata, inits);
    }

    public QDescription(Class<? extends Description> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.auditable = inits.isInitialized("auditable") ? new com.myee.tarot.core.audit.QAuditable(forProperty("auditable")) : null;
    }

}

