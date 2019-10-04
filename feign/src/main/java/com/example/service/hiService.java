package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Parameter;

@FeignClient(value = "client")
public interface hiService {
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name") String name);
}
