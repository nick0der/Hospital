package com.company.model;

import com.company.model.Room;
import com.company.model.StationaryDepartment;

public class StationaryRoom extends Room {

    private StationaryDepartment stationaryDepartment;
    private int totalBeds;
    private int freeBeds;

    public StationaryRoom() {
    }

    public StationaryRoom(int number, int width, int height, StationaryDepartment stationaryDepartment, int totalBeds, int freeBeds) {
        super(number, width, height);
        this.stationaryDepartment = stationaryDepartment;
        this.totalBeds = totalBeds;
        this.freeBeds = freeBeds;
    }

    public StationaryDepartment getStationaryDepartment() {
        return stationaryDepartment;
    }

    public void setStationaryDepartment(StationaryDepartment stationaryDepartment) {
        this.stationaryDepartment = stationaryDepartment;
    }

    public int getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(int totalBeds) {
        this.totalBeds = totalBeds;
    }

    public int getFreeBeds() {
        return freeBeds;
    }

    public void setFreeBeds(int freeBeds) {
        this.freeBeds = freeBeds;
    }

    @Override
    public String toString() {
        return "StationaryRoom{" +
                "stationaryDepartment=" + stationaryDepartment +
                ", totalBeds=" + totalBeds +
                ", freeBeds=" + freeBeds +
                '}';
    }
}
