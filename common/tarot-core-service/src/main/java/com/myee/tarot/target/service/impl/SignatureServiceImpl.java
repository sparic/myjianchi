package com.myee.tarot.target.service.impl;

import com.myee.tarot.core.service.GenericEntityServiceImpl;
import com.myee.tarot.target.Signature;
import com.myee.tarot.target.dao.SignatureDao;
import com.myee.tarot.target.service.SignatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ray.Fu on 2016/10/9.
 */
@Service
public class SignatureServiceImpl extends GenericEntityServiceImpl<Long, Signature> implements SignatureService{

    private SignatureDao signatureDao;

    @Autowired
    public SignatureServiceImpl(SignatureDao signatureDao) {
        super(signatureDao);
        this.signatureDao = signatureDao;
    }
}
