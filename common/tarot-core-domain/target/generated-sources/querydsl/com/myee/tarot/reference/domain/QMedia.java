package com.myee.tarot.reference.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMedia is a Querydsl query type for Media
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMedia extends EntityPathBase<Media> {

    private static final long serialVersionUID = -450003914L;

    public static final QMedia media = new QMedia("media");

    public final StringPath altText = createString("altText");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath tags = createString("tags");

    public final StringPath title = createString("title");

    public final StringPath url = createString("url");

    public QMedia(String variable) {
        super(Media.class, forVariable(variable));
    }

    public QMedia(Path<? extends Media> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMedia(PathMetadata metadata) {
        super(Media.class, metadata);
    }

}

