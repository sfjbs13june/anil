package com.anil.app.exception;

import com.anil.app.model.Patient;

public class PatientNotFoundException extends Exception {
    public PatientNotFoundException(String message){
        super(message);
    }

}
