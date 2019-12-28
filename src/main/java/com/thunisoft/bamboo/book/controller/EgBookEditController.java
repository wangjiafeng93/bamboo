package com.thunisoft.bamboo.book.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thunisoft.bamboo.book.service.IEgBookService;
import com.thunisoft.bamboo.pojo.EgBook;
import com.thunisoft.artery.data.annotation.DataTranslate;
import com.thunisoft.artery.data.annotation.ExceptionTips;
import com.thunisoft.artery.util.uuid.UUIDHelper;

/**
 * 
 * EgBookEditController
 *
 * @description 图书新增、编辑
 * @author artery6一键生成
 * @author huayu
 * @date 2019年05月13日 21:45
 * @version 1.0
 */
@Controller
@RequestMapping("book/egBookEdit")
public class EgBookEditController {
    @Autowired
    IEgBookService egBookService;

    /**
     * html模板入口
     * 
     * @return 'resources/templates'下的html模板
     */
    @GetMapping(value= {"/insert", "/"})
    public String index(HttpServletRequest request) {
        return "book/egBookEdit";
    }

    @GetMapping("/update/{id}")
    @DataTranslate
    public String update(HttpServletRequest request, @PathVariable String id) {
        request.setAttribute("rs", egBookService.selectByPrimaryKey(id));
        return "book/egBookEdit";
    }

    @RequestMapping("/doUpdate")
    @ExceptionTips("保存人员失败")
    @ResponseBody
    public Object doUpdate(@RequestBody EgBook egBook) {
        if (StringUtils.isBlank(egBook.getId())) {
            egBook.setId(UUIDHelper.getUuid());
            egBookService.insert(egBook);
        } else {
            egBookService.updateByPrimaryKey(egBook);
        }
        return "ok";
    }
}