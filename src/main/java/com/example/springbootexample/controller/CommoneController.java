package com.example.springbootexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class CommoneController {

    @GetMapping(value = "/welcome")
    public String producer(@RequestParam("empName") String empName, @RequestParam("empId") String empId, @RequestParam("salary") int salary) {
        return "Hello world";
    }
}
