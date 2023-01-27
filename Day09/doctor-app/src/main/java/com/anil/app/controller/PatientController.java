package com.anil.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/patient")
public class PatientController {
    @GetMapping("/myappointment")
    public List<Appendable> getMyAppointment(@RequestParam String patientName){
        
    }
}
