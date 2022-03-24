package com.company.model;

public class OperatingDepartment extends Department {

    private int freeOperatingRooms;

    public OperatingDepartment() {
    }

    public OperatingDepartment(Hospital hospital, int amountOfRooms, int floor, int freeOperatingRooms) {
        super(hospital, amountOfRooms, floor);
        this.freeOperatingRooms = freeOperatingRooms;
    }

    public int getFreeOperatingRooms() {
        return freeOperatingRooms;
    }

    public void setFreeOperatingRooms(int freeOperatingRooms) {
        this.freeOperatingRooms = freeOperatingRooms;
    }

    @Override
    public String toString() {
        return "OperatingDepartment{" +
                "freeOperatingRooms=" + freeOperatingRooms +
                '}';
    }
}
