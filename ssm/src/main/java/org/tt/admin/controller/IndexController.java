package org.tt.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zang on 2017/2/28.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String goIndex(HttpServletRequest request) {
        request.setAttribute("name","我是张三。");
        return "index";
    }
}

