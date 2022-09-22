package com.cydeo.lab04springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {



    @RequestMapping("login/{email}/{phoneNumber}")
    public String getLogin(@PathVariable String email, @PathVariable String phoneNumber, Model model){
        model.addAttribute(email);
        model.addAttribute(phoneNumber);



        return "login/login-info";
    }

}
