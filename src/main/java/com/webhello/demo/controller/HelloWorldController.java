package com.webhello.demo.controller;

import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hellodemo", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorldController {

    @GetMapping("/{name}")
    @Description("takes in name as path variable returns welcome with that name")
    public String returnWelcome(@PathVariable String name){
        return "Welcome " + name + "!";
    }
}
