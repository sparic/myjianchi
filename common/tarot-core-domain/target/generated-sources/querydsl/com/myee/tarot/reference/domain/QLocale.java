package com.myee.tarot.reference.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLocale is a Querydsl query type for Locale
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLocale extends EntityPathBase<Locale> {

    private static final long serialVersionUID = -1084650424L;

    public static final QLocale locale = new QLocale("locale");

    public final BooleanPath defaultFlag = createBoolean("defaultFlag");

    public final StringPath friendlyName = createString("friendlyName");

    public final StringPath id = createString("id");

    public final BooleanPath useInSearchIndex = createBoolean("useInSearchIndex");

    public QLocale(String variable) {
        super(Locale.class, forVariable(variable));
    }

    public QLocale(Path<? extends Locale> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLocale(PathMetadata metadata) {
        super(Locale.class, metadata);
    }

}

