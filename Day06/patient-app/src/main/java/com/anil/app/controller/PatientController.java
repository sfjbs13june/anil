package com.anil.app.controller;


import com.anil.app.model.Patient;
import com.anil.app.service.PatientService1;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @PostMapping("/patient/save")
    public Patient savePatient(@RequestBody Patient patient){
        System.out.println(patient);
        return patient;
    }

    @PutMapping("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient, @RequestParam("disease") String disease, @RequestParam("age") String age){
        PatientService1 patientService = null;
        return patientService.updateDetail(patient,disease,age);
    }
}
