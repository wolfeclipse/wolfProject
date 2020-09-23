package com.myproject.WolfProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/restaurants")
    public String massageRestaurants(){
        return "There will be a list of restaurants in future";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "This is a hello page!";
    }
}
