package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String tst() {
        System.out.println("In str from feature branch1");
        return "Hello String";
    }
}
