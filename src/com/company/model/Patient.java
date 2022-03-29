package com.company.model;

import com.company.enums.Gender;
import com.company.enums.HealthStatus;

import java.time.LocalDate;

public final class Patient extends Person {

    private HealthStatus healthStatus;
    private StationaryRoom hospitalRoom;

    public Patient() {
    }

    public Patient(String fullName, Gender gender, LocalDate birthday, HealthStatus healthStatus, StationaryRoom hospitalRoom) {
        super(fullName, gender, birthday);
        this.healthStatus = healthStatus;
        this.hospitalRoom = hospitalRoom;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public StationaryRoom getHospitalRoom() {
        return hospitalRoom;
    }

    public void setHospitalRoom(StationaryRoom hospitalRoom) {
        this.hospitalRoom = hospitalRoom;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "healthStatus=" + healthStatus +
                ", hospitalRoom=" + hospitalRoom +
                '}';
    }
}
