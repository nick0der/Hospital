package com.company.model;

import java.time.LocalDate;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.company.enums.Gender;
import com.company.interfaces.INurse;

public final class Nurse extends Employee implements INurse {

    private static final Logger LOGGER = LogManager.getLogger(Nurse.class);

    private StationaryRoom hospitalRoom;

    public Nurse() {
    }

    public Nurse(String fullName, Gender gender, LocalDate birthday, int salary,
                 int experienceYears, String education, StationaryRoom hospitalRoom) {
        super(fullName, gender, birthday, salary, experienceYears, education);
        this.hospitalRoom = hospitalRoom;
    }

    public void attendRoom(StationaryRoom stationaryRoom) {
        String message = "Nurse " + this.getFullName() + " attended room №" + stationaryRoom.getNumber();
        LOGGER.info(message);
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
