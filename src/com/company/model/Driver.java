package com.company.model;

import com.company.enums.DrivingCategory;
import com.company.enums.Gender;

import java.time.LocalDate;
import java.util.List;

public final class Driver extends Employee {

    private Ambulance ambulance;
    List<DrivingCategory> categories;

    public Driver() {
    }

    public Driver(String fullName, Gender gender, LocalDate birthday, int salary, int experienceYears, String education, Ambulance ambulance, List<DrivingCategory> categories) {
        super(fullName, gender, birthday, salary, experienceYears, education);
        this.ambulance = ambulance;
        this.categories = categories;
    }

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public List<DrivingCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<DrivingCategory> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "ambulance=" + ambulance +
                ", categories=" + categories +
                '}';
    }
}
