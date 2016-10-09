package com.myee.tarot.target.dao.impl;

import com.myee.tarot.core.dao.GenericEntityDaoImpl;
import com.myee.tarot.target.Signature;
import com.myee.tarot.target.dao.SignatureDao;
import org.springframework.stereotype.Repository;

/**
 * Created by Ray.Fu on 2016/10/9.
 */
@Repository
public class SignatureDaoImpl extends GenericEntityDaoImpl<Long, Signature> implements SignatureDao {
}
