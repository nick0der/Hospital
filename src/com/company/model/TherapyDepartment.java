package com.company.model;

import com.company.model.Department;
import com.company.model.Hospital;

public class TherapyDepartment extends Department {

    private String therapyName;
    private int numberOfTherapists;

    public TherapyDepartment() {
    }

    public TherapyDepartment(Hospital hospital, int amountOfRooms, int floor, String therapyName, int numberOfTherapists) {
        super(hospital, amountOfRooms, floor);
        this.therapyName = therapyName;
        this.numberOfTherapists = numberOfTherapists;
    }

    public String getTherapyName() {
        return therapyName;
    }

    public void setTherapyName(String therapyName) {
        this.therapyName = therapyName;
    }

    public int getNumberOfTherapists() {
        return numberOfTherapists;
    }

    public void setNumberOfTherapists(int numberOfTherapists) {
        this.numberOfTherapists = numberOfTherapists;
    }

    @Override
    public String toString() {
        return "TherapyDepartment{" +
                "therapyName='" + therapyName + '\'' +
                ", numberOfTherapists=" + numberOfTherapists +
                '}';
    }
}
