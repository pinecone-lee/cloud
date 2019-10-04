package com.example.controller;

import com.example.service.hiinterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hicontroller {
    @Autowired
    hiinterface hiinterface;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name") String name){
        return hiinterface.hi(name);
    }
}
