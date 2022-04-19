package com.company.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.company.enums.DrivingCategory;
import com.company.enums.Gender;
import jdk.jfr.Category;
import org.apache.commons.lang3.StringUtils;

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

    public String getCategoriesString(){
        return categories.stream()
                .map(item -> item + "(" + item.getValue() + ")")
                .collect(Collectors.joining(","));

//        return StringUtils.join(categories.stream()
//        .map(item -> item + "(" + item.getValue() + ")")
//        .collect(Collectors.toList()), ",");
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
