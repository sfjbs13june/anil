package com.anil.app.controller;

import com.anil.app.model.Appointment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/doctor")
public class DoctorController {
    @GetMapping("/doctorappointment")
    public List<Appointment> getAppointments(@RequestParam String doctorName){

    }
    @PostMapping("/save")
    public Appointment saveAppointment(@RequestParam String appointmentName){

    }

}
