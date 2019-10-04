package com.example.controller;

import com.example.service.hiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hiController {
    @Autowired
    private hiService hiService;

    @RequestMapping("/hi")
    public String hi(String name){
        return hiService.hi(name);
    }
}
