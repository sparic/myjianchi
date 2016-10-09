package com.myee.tarot.target.service.impl;

import com.myee.tarot.core.service.GenericEntityServiceImpl;
import com.myee.tarot.core.util.ajax.AjaxResponse;
import com.myee.tarot.target.Signature;
import com.myee.tarot.target.Target;
import com.myee.tarot.target.dao.TargetDao;
import com.myee.tarot.target.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ray.Fu on 2016/10/9.
 */
@Service
public class TargetServiceImpl extends GenericEntityServiceImpl<Long, Target> implements TargetService {

    private TargetDao targetDao;

    @Autowired
    public TargetServiceImpl(TargetDao targetDao) {
        super(targetDao);
        this.targetDao = targetDao;
    }

    @Override
    public boolean createTarget(Target target) {
        boolean flag = targetDao.createTarget(target);
        return flag;
    }

    @Override
    public AjaxResponse signIn(Signature signature) {
        return targetDao.signIn(signature);
    }
}
