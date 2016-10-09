package com.myee.tarot.target;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTarget is a Querydsl query type for Target
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTarget extends EntityPathBase<Target> {

    private static final long serialVersionUID = 2105533493L;

    public static final QTarget target = new QTarget("target");

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> signId = createNumber("signId", Long.class);

    public QTarget(String variable) {
        super(Target.class, forVariable(variable));
    }

    public QTarget(Path<? extends Target> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTarget(PathMetadata metadata) {
        super(Target.class, metadata);
    }

}

