package com.company;

public class Ambulance extends Transport{

    private Hospital hospital;

    public Ambulance(Hospital hospital) {
        this.hospital = hospital;
    }

    public Ambulance(String model, int year, int price, String licensePlate, Hospital hospital) {
        super(model, year, price, licensePlate);
        this.hospital = hospital;
    }


    //Getters and setters

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
