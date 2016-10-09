package com.myee.tarot.target.dao.impl;

import com.myee.tarot.core.dao.GenericEntityDaoImpl;
import com.myee.tarot.core.util.ajax.AjaxResponse;
import com.myee.tarot.target.QSignature;
import com.myee.tarot.target.QTarget;
import com.myee.tarot.target.Signature;
import com.myee.tarot.target.Target;
import com.myee.tarot.target.dao.TargetDao;
import org.springframework.stereotype.Repository;

/**
 * Created by Ray.Fu on 2016/10/9.
 */
@Repository
public class TargetDaoImpl extends GenericEntityDaoImpl<Long, Target> implements TargetDao {

    @Override
    public boolean createTarget(Target target) {
        QTarget qTarget = QTarget.target;

        return false;
    }

    @Override
    public AjaxResponse signIn(Signature signature) {
        QSignature qSignature = QSignature.signature;
        return AjaxResponse.success();
    }
}
