package com.myee.tarot.reference.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPhone is a Querydsl query type for Phone
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPhone extends EntityPathBase<Phone> {

    private static final long serialVersionUID = -447133248L;

    public static final QPhone phone = new QPhone("phone");

    public final StringPath countryCode = createString("countryCode");

    public final StringPath extension = createString("extension");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final BooleanPath isDefault = createBoolean("isDefault");

    public final StringPath phoneNumber = createString("phoneNumber");

    public QPhone(String variable) {
        super(Phone.class, forVariable(variable));
    }

    public QPhone(Path<? extends Phone> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPhone(PathMetadata metadata) {
        super(Phone.class, metadata);
    }

}

