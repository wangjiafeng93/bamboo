package com.thunisoft.bamboo.controller.jcyMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MobanController Controller
 * 
 *
 * @author huayu
 * @date 2019-11-18
 */
@Controller
@RequestMapping("jcyMap/moban")
public class MobanController {
    /**
     * html模板入口
     * @return 'resources/templates'下的html模板
     */
    @GetMapping()
    public String index(HttpServletRequest request) {
        return "jcyMap/moban.tpl.tpl";
 	}
}