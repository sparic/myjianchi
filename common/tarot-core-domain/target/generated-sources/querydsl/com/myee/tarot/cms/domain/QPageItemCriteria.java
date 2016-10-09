package com.myee.tarot.cms.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPageItemCriteria is a Querydsl query type for PageItemCriteria
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPageItemCriteria extends EntityPathBase<PageItemCriteria> {

    private static final long serialVersionUID = -259901075L;

    public static final QPageItemCriteria pageItemCriteria = new QPageItemCriteria("pageItemCriteria");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QPageItemCriteria(String variable) {
        super(PageItemCriteria.class, forVariable(variable));
    }

    public QPageItemCriteria(Path<? extends PageItemCriteria> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPageItemCriteria(PathMetadata metadata) {
        super(PageItemCriteria.class, metadata);
    }

}

