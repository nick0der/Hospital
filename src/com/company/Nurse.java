package com.company;

import java.time.LocalDate;

public class Nurse extends Employee{

    public Nurse() {
    }

    public Nurse(String fullName, String gender, LocalDate birthday, int salary,
                 int experienceYears, String education, Department department) {
        super(fullName, gender, birthday, salary, experienceYears, education, department);
    }

    public void work() {
        System.out.println("Nurse is working");
    }
}
