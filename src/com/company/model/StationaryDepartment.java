package com.company.model;

import com.company.model.Department;
import com.company.model.Hospital;

public class StationaryDepartment extends Department {

    private int dropCounters;

    public StationaryDepartment() {
    }

    public StationaryDepartment(Hospital hospital, int amountOfRooms, int floor, int dropCounters) {
        super(hospital, amountOfRooms, floor);
        this.dropCounters = dropCounters;
    }

    public int getDropCounters() {
        return dropCounters;
    }

    public void setDropCounters(int dropCounters) {
        this.dropCounters = dropCounters;
    }

    @Override
    public String toString() {
        return "StationaryDepartment{" +
                "dropCounters=" + dropCounters +
                '}';
    }
}
