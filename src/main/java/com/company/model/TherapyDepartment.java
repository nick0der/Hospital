package com.company.model;

import com.company.exceptions.IncorrectArgumentException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public final class TherapyDepartment extends Department {

    private static final Logger LOGGER = LogManager.getLogger(TherapyDepartment.class);

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
        try {
            if (numberOfTherapists < 0) throw new IncorrectArgumentException(numberOfTherapists + " is negative. Use only positive numbers.");
            this.numberOfTherapists = numberOfTherapists;
        } catch (IncorrectArgumentException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "TherapyDepartment{" +
                "therapyName='" + therapyName + '\'' +
                ", numberOfTherapists=" + numberOfTherapists +
                '}';
    }
}
