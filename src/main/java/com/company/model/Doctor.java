package com.company.model;

import com.company.enums.Gender;

import java.time.LocalDate;

public abstract class Doctor extends Employee {

    private String certification;

    public Doctor() {
    }

    public Doctor(String fullName, Gender gender, LocalDate birthday, int salary, int experienceYears, String education, Department department, String certification) {
        super(fullName, gender, birthday, salary, experienceYears, education);
        this.certification = certification;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "certification='" + certification + '\'' +
                '}';
    }
}
