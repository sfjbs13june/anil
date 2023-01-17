package com.anil.app.springcontroller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Sayhello() {
        return "Hello from App";
    }

    @RequestMapping("/request/hello")
    public String requestHello() {return "Hello from Request Mapping";
    }

    @GetMapping("/welcome1")
    public String welcome1(@RequestParam("name") String name) {
        return "Welcome to " + name;
    }

    @GetMapping("/send{message}")
    public String sendMessage(@PathVariable String message ) {
        return "send message "+message ;
    }

}
