package com.zzzl.lemall.controller;

import com.zzzl.lemall.domain.Ctegory;
import com.zzzl.lemall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/6 15:17
 * 4
 */
@Controller
@RequestMapping("/category")
@CrossOrigin(value = "*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ResponseBody
    @RequestMapping("/getAllCteGory")
    public List<Ctegory> selectAllCteGory() {
        System.out.println("controller.....成功访问");
        List<Ctegory> ctegories = categoryService.selectCtegory();

        return ctegories;
    }
}
