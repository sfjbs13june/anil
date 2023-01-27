package com.anil.app.service;
import com.anil.app.model.Patient;
import org.springframework.stereotype.Component;
@Component
public class PatientService1 {
    public Patient updateDetail(Patient patient, String disease,String age) {
        patient.setDisease(disease);
        patient.setAge(age);
        return patient;
    }
}


