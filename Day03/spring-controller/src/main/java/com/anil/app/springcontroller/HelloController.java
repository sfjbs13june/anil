package com.anil.app.springcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Sayhello(){
        return "Hello from App";
    }

    @RequestMapping("/request/hello")
    public String requestHello(){
        return "Hello from Request Mapping";
    }

}
