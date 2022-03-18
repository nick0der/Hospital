package com.company;

import java.time.LocalDate;

public class Secretary extends Employee{

    public Secretary() {
    }

    public Secretary(String fullName, String gender, LocalDate birthday, int salary, int experienceYears, String education, Department department) {
        super(fullName, gender, birthday, salary, experienceYears, education, department);
    }
}
