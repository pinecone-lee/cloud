package com.example.controller;

import com.example.service.hiservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hicontroller {
    @Autowired
    hiservice hiservice;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name") String name){
        return hiservice.hi(name);
    }
}
