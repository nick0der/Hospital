package com.company;

import java.time.LocalDate;

public class Receptionist extends Employee {

    public Receptionist() {
    }

    public Receptionist(String fullName, String gender, LocalDate birthday, int salary, int experienceYears, String education, Department department) {
        super(fullName, gender, birthday, salary, experienceYears, education, department);
    }
}
