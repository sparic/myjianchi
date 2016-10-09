package com.myee.tarot.web.target;

import com.google.common.collect.Maps;
import com.myee.tarot.core.exception.ServiceException;
import com.myee.tarot.core.util.ajax.AjaxPageableResponse;
import com.myee.tarot.core.util.ajax.AjaxResponse;
import com.myee.tarot.target.Signature;
import com.myee.tarot.target.Target;
import com.myee.tarot.target.service.SignatureService;
import com.myee.tarot.target.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by Ray.Fu on 2016/10/9.
 */
@Controller
public class TargetController {

    @Autowired
    private TargetService targetService;
    @Autowired
    private SignatureService signatureService;


    @RequestMapping(value = {"/target/home.html", "/target/", "/target"}, method = RequestMethod.GET)
    public String displayDashboard(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "/target/myindex";
    }

    @RequestMapping(value = "/target/create", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResponse createTarget(String content) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        try {
            Target target = new Target();
            target.setContent(content);
            target.setSignId(3L);
            targetService.save(target);
            Signature signature = new Signature();
            signature.setTarget(target);
            signatureService.save(signature);
            Map map = Maps.newHashMap();
            map.put("target",target);
            ajaxResponse.setDataMap(map);
        } catch (ServiceException e) {
            e.printStackTrace();
            return AjaxResponse.failed(-1);
        }
        return ajaxResponse;
    }

    @RequestMapping(value = "/target/test", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResponse test() {
        return AjaxResponse.success();
    }

}
