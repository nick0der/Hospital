package com.company.model;

import java.time.LocalDate;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.company.enums.Gender;
import com.company.enums.HealthStatus;
import com.company.interfaces.ITherapy;

public final class Therapist extends Employee implements ITherapy {

    private static final Logger LOGGER = LogManager.getLogger(Nurse.class);

    private TherapyRoom therapyRoom;

    public Therapist() {
    }

    public Therapist(String fullName, Gender gender, LocalDate birthday, int salary, int experienceYears, String education, Department department, TherapyRoom therapyRoom) {
        super(fullName, gender, birthday, salary, experienceYears, education);
        this.therapyRoom = therapyRoom;
    }

    public void doTherapy(Patient patient){
        patient.setHealthStatus(HealthStatus.HEALTY);
        LOGGER.info("Therapist " + getFullName() + " did therapy on " + patient.getFullName());
    }

    public TherapyRoom getTherapyRoom() {
        return therapyRoom;
    }

    public void setTherapyRoom(TherapyRoom therapyRoom) {
        this.therapyRoom = therapyRoom;
    }

    @Override
    public String toString() {
        return "Therapist{" +
                "therapyRoom=" + therapyRoom +
                '}';
    }
}
