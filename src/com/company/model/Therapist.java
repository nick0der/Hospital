package com.company.model;

import com.company.enums.HealthStatus;

import java.time.LocalDate;

public class Therapist extends Employee {

    private TherapyRoom therapyRoom;

    public Therapist() {
    }

    public Therapist(String fullName, String gender, LocalDate birthday, int salary, int experienceYears, String education, Department department, TherapyRoom therapyRoom) {
        super(fullName, gender, birthday, salary, experienceYears, education, department);
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
