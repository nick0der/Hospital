package com.company;

public class MedicalSupply {
    private String name;
    private int amount;
    private Hospital hospital;

    public MedicalSupply() {
    }

    public MedicalSupply(String name, int amount, Hospital hospital) {
        this.name = name;
        this.amount = amount;
        this.hospital = hospital;
    }


    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
