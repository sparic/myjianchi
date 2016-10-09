package com.myee.tarot.profile.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QChallengeQuestion is a Querydsl query type for ChallengeQuestion
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChallengeQuestion extends EntityPathBase<ChallengeQuestion> {

    private static final long serialVersionUID = -1328838563L;

    public static final QChallengeQuestion challengeQuestion = new QChallengeQuestion("challengeQuestion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath question = createString("question");

    public QChallengeQuestion(String variable) {
        super(ChallengeQuestion.class, forVariable(variable));
    }

    public QChallengeQuestion(Path<? extends ChallengeQuestion> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChallengeQuestion(PathMetadata metadata) {
        super(ChallengeQuestion.class, metadata);
    }

}

