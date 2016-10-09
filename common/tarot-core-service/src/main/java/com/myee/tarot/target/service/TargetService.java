package com.myee.tarot.target.service;

import com.myee.tarot.catalog.domain.Device;
import com.myee.tarot.core.service.GenericEntityService;
import com.myee.tarot.core.util.ajax.AjaxResponse;
import com.myee.tarot.target.Signature;
import com.myee.tarot.target.Target;

/**
 * Created by Ray.Fu on 2016/10/9.
 */
public interface TargetService extends GenericEntityService<Long, Target> {

    boolean createTarget(Target target);

    AjaxResponse signIn(Signature signature);
}
