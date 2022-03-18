package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person{

    List<Symptoms> symptoms;
    private String prescription;
    private boolean cured;

    public Patient() {
    }

    public Patient(String fullName, String gender, LocalDate birthday, List<Symptoms> symptoms, String prescription, boolean cured) {
        super(fullName, gender, birthday);
        this.symptoms = symptoms;
        this.prescription = prescription;
        this.cured = cured;
    }


    //Getters and setters:

    public List<Symptoms> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<Symptoms> symptoms) {
        this.symptoms = symptoms;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public boolean isCured() {
        return cured;
    }

    public void setCured(boolean cured) {
        this.cured = cured;
    }
}
