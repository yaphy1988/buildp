package com.ai.buildp.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "system")
public class SystemMgrAction {

    /**
     * 获取系统参数
     * @param request
     * @param response
     * @return
     * Date: 2015年3月12日 <br>
     * @author xuanjian
     */
    @RequestMapping(value = "log4j")
    public String getEnv(HttpServletRequest request, HttpServletResponse response){
        
        return "";
    }
    
}
