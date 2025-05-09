package com.fullstack.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallBackController {

    @GetMapping("/employeefallback")
    public ResponseEntity<String> employeeFallBack(){
        return ResponseEntity.ok("Employee Service is Down Please wait!!!!!");
    }

    @GetMapping("/departmentfallback")
    public ResponseEntity<String> departmentFallBack(){
        return ResponseEntity.ok("Department Service is Down Please wait!!!!!");
    }
}
