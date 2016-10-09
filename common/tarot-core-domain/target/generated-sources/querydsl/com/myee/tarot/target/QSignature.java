package com.myee.tarot.target;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSignature is a Querydsl query type for Signature
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSignature extends EntityPathBase<Signature> {

    private static final long serialVersionUID = -159812716L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSignature signature = new QSignature("signature");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> signedStatus = createNumber("signedStatus", Integer.class);

    public final DateTimePath<java.util.Date> signTime = createDateTime("signTime", java.util.Date.class);

    public final QTarget target;

    public QSignature(String variable) {
        this(Signature.class, forVariable(variable), INITS);
    }

    public QSignature(Path<? extends Signature> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSignature(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSignature(PathMetadata metadata, PathInits inits) {
        this(Signature.class, metadata, inits);
    }

    public QSignature(Class<? extends Signature> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.target = inits.isInitialized("target") ? new QTarget(forProperty("target")) : null;
    }

}

