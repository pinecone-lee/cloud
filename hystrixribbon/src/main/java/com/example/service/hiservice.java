package com.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class hiservice {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hierror")
    public String hi(String name){
        return restTemplate.getForObject("http://client/hi?name=" + name,String.class);
    }

    public String hierror(){
        return "error";
    }
}
