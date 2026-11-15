package com.demo.java_hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello world, podman sucessfully setup and CI/CD also setup completed)";
    }

    @GetMapping("/api")
    public String goodMorning() {
        return "This is a restApi!!";
    }

}
