package com.myee.tarot.core.audit;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditable is a Querydsl query type for Auditable
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QAuditable extends BeanPath<Auditable> {

    private static final long serialVersionUID = -814598260L;

    public static final QAuditable auditable = new QAuditable("auditable");

    public final NumberPath<Long> createdBy = createNumber("createdBy", Long.class);

    public final DateTimePath<java.util.Date> dateCreated = createDateTime("dateCreated", java.util.Date.class);

    public final DateTimePath<java.util.Date> dateUpdated = createDateTime("dateUpdated", java.util.Date.class);

    public final NumberPath<Long> updatedBy = createNumber("updatedBy", Long.class);

    public QAuditable(String variable) {
        super(Auditable.class, forVariable(variable));
    }

    public QAuditable(Path<? extends Auditable> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditable(PathMetadata metadata) {
        super(Auditable.class, metadata);
    }

}

