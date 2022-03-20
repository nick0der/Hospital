package com.company.model;

public abstract class Department {

    private Hospital hospital;
    private int amountOfRooms;
    private int floor;

    public Department() {
    }

    public Department(Hospital hospital, int amountOfRooms, int floor) {
        this.hospital = hospital;
        this.amountOfRooms = amountOfRooms;
        this.floor = floor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getAmountOfRooms() {
        return amountOfRooms;
    }

    public void setAmountOfRooms(int amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Department{" +
                "hospital=" + hospital +
                ", amountOfRooms=" + amountOfRooms +
                ", floor=" + floor +
                '}';
    }
}
