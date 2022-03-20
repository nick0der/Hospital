package com.company.model;

import java.time.LocalDate;

public class Nurse extends Employee {

    private StationaryRoom hospitalRoom;

    public Nurse() {
    }

    public Nurse(String fullName, String gender, LocalDate birthday, int salary,
                 int experienceYears, String education, Department department, StationaryRoom hospitalRoom) {
        super(fullName, gender, birthday, salary, experienceYears, education, department);
        this.hospitalRoom = hospitalRoom;
    }

    public void work() {
        System.out.println("Nurse is working");
    }

    public StationaryRoom getHospitalRoom() {
        return hospitalRoom;
    }

    public void setHospitalRoom(StationaryRoom stationaryRoom) {
        this.hospitalRoom = stationaryRoom;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "hospitalRoom=" + hospitalRoom +
                '}';
    }
}
