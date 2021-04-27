package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Echo {

    @RequestMapping(value = "/echo")
    public String echo1() {
        return "echo1";
    }
}
