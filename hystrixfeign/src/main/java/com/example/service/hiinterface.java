package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "client",fallback = hiservice.class)
public interface hiinterface {
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name") String name);
}
