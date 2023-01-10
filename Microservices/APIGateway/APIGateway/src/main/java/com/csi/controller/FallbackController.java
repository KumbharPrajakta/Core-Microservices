package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallbackController {
    @GetMapping("/employeefallback")
    public String employeeFallback(){
        return "employee service is down please wait!!!!";
    }

    @GetMapping("/departmentfallback")
    public String departmentFallback(){
        return "department service is down please wait!!!!";
    }
}
