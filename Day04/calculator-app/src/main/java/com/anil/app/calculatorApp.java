package com.anil.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class calculatorApp {

// 1) /add (request parameter a,request parameter b) {return  a+b;
    @GetMapping("/add")
        public double add(@RequestParam("a") double a,@RequestParam ("b") double b){
        return a+b;
    }

    @GetMapping("/sub")
    public double sub(@RequestParam("a") double a,@RequestParam("b") double b){
        return a-b;
    }

    @GetMapping("/mul")
    public double mul(@RequestParam("a") double a,@RequestParam("b")double b){
        return a*b;
    }

    @GetMapping("/div")
    public double div(@RequestParam("a") double a,@RequestParam("b")double b){
        return a/b;
    }

}
