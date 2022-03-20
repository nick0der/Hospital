package com.company.model;

public class Ambulance extends Transport {

    private Hospital hospital;
    private String trackNumber;

    public Ambulance() {
    }

    public Ambulance(String model, int year, int price, String licensePlate, Hospital hospital, String trackNumber) {
        super(model, year, price, licensePlate);
        this.hospital = hospital;
        this.trackNumber = trackNumber;
    }

    public void move(String address){
        System.out.println("Ambulance " + trackNumber + " is moving to " + address);
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    @Override
    public String toString() {
        return "Ambulance{" +
                "hospital=" + hospital +
                ", trackNumber='" + trackNumber + '\'' +
                '}';
    }
}
