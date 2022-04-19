package com.company.model;

import java.time.LocalDate;

import com.company.enums.Gender;
import com.company.enums.HealthStatus;

public final class Patient extends Person {

    private HealthStatus healthStatus;
    private StationaryRoom stationaryRoom;

    public Patient() {
    }

    public Patient(String fullName, Gender gender, LocalDate birthday, HealthStatus healthStatus, StationaryRoom stationaryRoom) {
        super(fullName, gender, birthday);
        this.healthStatus = healthStatus;
        this.stationaryRoom = stationaryRoom;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public StationaryRoom getHospitalRoom() {
        return stationaryRoom;
    }

    public void setHospitalRoom(StationaryRoom hospitalRoom) {
        this.stationaryRoom = hospitalRoom;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "healthStatus=" + healthStatus +
                ", hospitalRoom=" + stationaryRoom +
                '}';
    }
}
