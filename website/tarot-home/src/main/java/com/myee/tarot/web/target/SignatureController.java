package com.myee.tarot.web.target;

import com.google.common.collect.Maps;
import com.myee.tarot.core.exception.ServiceException;
import com.myee.tarot.core.util.ajax.AjaxResponse;
import com.myee.tarot.target.Signature;
import com.myee.tarot.target.Target;
import com.myee.tarot.target.service.SignatureService;
import com.myee.tarot.target.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Ray.Fu on 2016/10/9.
 */
@Controller
public class SignatureController {

    @Autowired
    private SignatureService signatureService;

    @RequestMapping(value = "target/signIn", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResponse signIn(Integer signStatus, Long signId) {
        Signature signature = new Signature();
        Target target = new Target();
        target.setSignId(signId);
        signature.setTarget(target);
        AjaxResponse ajaxResponse = new AjaxResponse();
        Map map = Maps.newHashMap();
        try {
            signatureService.update(signature);
            map.put("signature",signature);
            ajaxResponse.setDataMap(map);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return ajaxResponse;
    }
}
