package com.cydeo.lab04springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {


    @RequestMapping("search-product/{name}")
    public String getProduct(Model model, @PathVariable String name){
        model.addAttribute(name);

        return "product/product-list";
    }
}
