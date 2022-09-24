package com.cydeo.lab04springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {



    @RequestMapping("/login/{email}/{phoneNumber}")
    public String getLogin(@PathVariable("email") String email, @PathVariable("phoneNumber") String phoneNumber, Model model){
        model.addAttribute("email",email);
        model.addAttribute("phoneNumber",phoneNumber);
        model.addAttribute("loginMessage", "Login successful");



        return "login/login-info";
    }

}
