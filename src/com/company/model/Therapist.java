package com.company.model;

import com.company.enums.Gender;
import com.company.enums.HealthStatus;
import com.company.interfaces.ITherapy;

import java.time.LocalDate;

public final class Therapist extends Employee implements ITherapy {

    private TherapyRoom therapyRoom;

    public Therapist() {
    }

    public Therapist(String fullName, Gender gender, LocalDate birthday, int salary, int experienceYears, String education, Department department, TherapyRoom therapyRoom) {
        super(fullName, gender, birthday, salary, experienceYears, education);
        this.therapyRoom = therapyRoom;
    }

    public void doTherapy(Patient patient){
        patient.setHealthStatus(HealthStatus.HEALTY);
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
