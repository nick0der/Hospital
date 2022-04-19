package com.company.model;

import java.time.LocalDate;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.company.enums.Gender;
import com.company.interfaces.INurse;

public final class Nurse extends Employee implements INurse {

    private static final Logger LOGGER = LogManager.getLogger(Nurse.class);

    private StationaryRoom stationaryRoom;

    public Nurse() {
    }

    public Nurse(String fullName, Gender gender, LocalDate birthday, int salary,
                 int experienceYears, String education, StationaryRoom hospitalRoom) {
        super(fullName, gender, birthday, salary, experienceYears, education);
        this.stationaryRoom = stationaryRoom;
    }

    public void attendRoom(StationaryRoom stationaryRoom) {
        String message = "Nurse " + this.getFullName() + " attended room №" + stationaryRoom.getNumber();
        LOGGER.info(message);
    }

    public StationaryRoom getHospitalRoom() {
        return stationaryRoom;
    }

    public void setHospitalRoom(StationaryRoom stationaryRoom) {
        this.stationaryRoom = stationaryRoom;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "hospitalRoom=" + stationaryRoom +
                '}';
    }
}
