package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hasoji on 2017/2/11.
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String body() {
        return "/test<br/>/test/json?key=key&value=value<br/>/test/{path}?key=key&value=value";
    }
}
