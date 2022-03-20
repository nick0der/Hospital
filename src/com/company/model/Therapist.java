package com.company.model;

import com.company.enums.HealthStatus;

public class Therapist extends Employee {

    private TherapyRoom therapyRoom;

    public Therapist() {
    }

    public Therapist(TherapyRoom therapyRoom) {
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
