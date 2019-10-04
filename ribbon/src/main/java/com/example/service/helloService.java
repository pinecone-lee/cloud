package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class helloService {
    @Autowired
    RestTemplate restTemplate;
    public String hello(String name){
        return restTemplate.getForObject("http://CLIENT/hi?name="+name,String.class);
    }
}
