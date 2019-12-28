package com.thunisoft.bamboo.book.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.bamboo.book.service.IEgBookService;

/**
 * 
 * EgBookDetailController
 *
 * @description 图书详情
 * @author artery6一键生成
 * @author huayu
 * @date 2019年05月13日 21:45
 * @version 1.0
 */
@Controller
@RequestMapping("book/egBookDetail")
public class EgBookDetailController {
    @Autowired
    IEgBookService egBookService;

    @GetMapping(value= {"/{id}", "/"})
    @DataTranslate
    public String index(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("rs", egBookService.selectByPrimaryKey(id));
        return "book/egBookDetail";
    }
}