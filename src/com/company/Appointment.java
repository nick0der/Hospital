package com.company;

import java.time.LocalDate;

public class Appointment {
    private Room room;
    private Doctor doctor;
    private Patient patient;
    private LocalDate date;

    public Appointment() {
    }

    public Appointment(Room room, Doctor doctor, Patient patient, LocalDate date) {
        this.room = room;
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }


    //Getters and setters

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
