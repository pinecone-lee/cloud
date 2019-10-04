package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.helloService;

@RestController
public class helloController {
    @Autowired
    helloService helloService;

    @RequestMapping("/hi")
    public String sayhello(@RequestParam  String name){
        return helloService.hello(name);
    }
}
