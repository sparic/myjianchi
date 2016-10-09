package com.myee.tarot.merchant.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMerchant is a Querydsl query type for Merchant
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMerchant extends EntityPathBase<Merchant> {

    private static final long serialVersionUID = -1515631163L;

    public static final QMerchant merchant = new QMerchant("merchant");

    public final StringPath businessType = createString("businessType");

    public final StringPath cuisineType = createString("cuisineType");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath logo = createString("logo");

    public final StringPath name = createString("name");

    public QMerchant(String variable) {
        super(Merchant.class, forVariable(variable));
    }

    public QMerchant(Path<? extends Merchant> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMerchant(PathMetadata metadata) {
        super(Merchant.class, metadata);
    }

}

