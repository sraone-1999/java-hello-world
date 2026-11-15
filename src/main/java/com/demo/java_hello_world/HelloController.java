package com.demo.java_hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello world, Trying to setup podman here :)";
    }

    @GetMapping("/good morning")
    public String goodMorning() {
        return "Good Morning! this is auto deployed with CI/CD pipeline...yahoo";
    }

}
