package com.company;

import java.time.LocalDate;

public class Doctor extends Employee{

    private String speciality;

    public Doctor() {
    }

    public Doctor(String fullName, String gender, LocalDate birthday, int salary, int experienceYears,
                  String education, Department department, String speciality) {
        super(fullName, gender, birthday, salary, experienceYears, education, department);
        this.speciality = speciality;
    }

    public void work(){
        System.out.println("Doctor is working");
    }

    public void curePatient(Patient patient) {

        if (patient.isCured()){
            System.out.println("Everything is ok. Patient is cured.");
        } else {
            String prescript = "";

            if (patient.symptoms.contains(Symptoms.TEMPERATURE)){
                prescript += "Paracetamol ";
            }
            if (patient.symptoms.contains(Symptoms.HEADACHE)){
                prescript += "Citramon ";
            }
            if (patient.symptoms.contains(Symptoms.STOMACHACHE)){
                prescript += "Pancreatin ";
            }
            patient.setPrescription(prescript);
            patient.setCured(true);

            System.out.println("Patient " + patient.getFullName() + " cured by " + this.getFullName());
        }
    }

    //Getters and setters :

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
