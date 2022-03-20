package com.company.model;

public class OperatingDepartment {

    private int freeOperatingRooms;

    public OperatingDepartment() {
    }

    public OperatingDepartment(int freeOperatingRooms) {
        this.freeOperatingRooms = freeOperatingRooms;
    }

    @Override
    public String toString() {
        return "OperatingDepartment{" +
                "freeOperatingRooms=" + freeOperatingRooms +
                '}';
    }
}
