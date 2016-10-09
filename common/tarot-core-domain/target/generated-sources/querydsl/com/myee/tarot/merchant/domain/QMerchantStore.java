package com.myee.tarot.merchant.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMerchantStore is a Querydsl query type for MerchantStore
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMerchantStore extends EntityPathBase<MerchantStore> {

    private static final long serialVersionUID = 907120156L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMerchantStore merchantStore = new QMerchantStore("merchantStore");

    public final com.myee.tarot.reference.domain.QAddress address;

    public final StringPath code = createString("code");

    public final NumberPath<Integer> cpp = createNumber("cpp", Integer.class);

    public final StringPath description = createString("description");

    public final BooleanPath experience = createBoolean("experience");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMerchant merchant;

    public final StringPath name = createString("name");

    public final StringPath phone = createString("phone");

    public final StringPath postalCode = createString("postalCode");

    public final NumberPath<Float> ratings = createNumber("ratings", Float.class);

    public QMerchantStore(String variable) {
        this(MerchantStore.class, forVariable(variable), INITS);
    }

    public QMerchantStore(Path<? extends MerchantStore> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMerchantStore(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMerchantStore(PathMetadata metadata, PathInits inits) {
        this(MerchantStore.class, metadata, inits);
    }

    public QMerchantStore(Class<? extends MerchantStore> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new com.myee.tarot.reference.domain.QAddress(forProperty("address"), inits.get("address")) : null;
        this.merchant = inits.isInitialized("merchant") ? new QMerchant(forProperty("merchant")) : null;
    }

}

