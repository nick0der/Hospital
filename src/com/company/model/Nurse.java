package com.company.model;

import com.company.interfaces.INurse;

import java.time.LocalDate;

public final class Nurse extends Employee implements INurse {

    private StationaryRoom hospitalRoom;

    public Nurse() {
    }

    public Nurse(String fullName, String gender, LocalDate birthday, int salary,
                 int experienceYears, String education, StationaryRoom hospitalRoom) {
        super(fullName, gender, birthday, salary, experienceYears, education);
        this.hospitalRoom = hospitalRoom;
    }

    public void attendRoom(StationaryRoom stationaryRoom) {
        System.out.println("Nurse " + this.getFullName() + " attended room №" + stationaryRoom.getNumber());
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
