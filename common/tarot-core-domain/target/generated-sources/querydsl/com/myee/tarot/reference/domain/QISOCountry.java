package com.myee.tarot.reference.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QISOCountry is a Querydsl query type for ISOCountry
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QISOCountry extends EntityPathBase<ISOCountry> {

    private static final long serialVersionUID = -990707137L;

    public static final QISOCountry iSOCountry = new QISOCountry("iSOCountry");

    public final StringPath alpha2 = createString("alpha2");

    public final StringPath alpha3 = createString("alpha3");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> numericCode = createNumber("numericCode", Integer.class);

    public final StringPath status = createString("status");

    public QISOCountry(String variable) {
        super(ISOCountry.class, forVariable(variable));
    }

    public QISOCountry(Path<? extends ISOCountry> path) {
        super(path.getType(), path.getMetadata());
    }

    public QISOCountry(PathMetadata metadata) {
        super(ISOCountry.class, metadata);
    }

}

