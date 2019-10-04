package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class hiservice implements hiinterface {
    @Override
    public String hi(@RequestParam(value = "name") String name) {
        return name+" is died";
    }
}
