package com.fatecrl.helloworldsb.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/hello-world")
public class HelloWorldSBController {

    @GetMapping()
    public String sayHello(){   
        return "Hello World!";
    }

}
