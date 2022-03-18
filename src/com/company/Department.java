package com.company;

public class Department {
    private Hospital hospital;
    private String name;

    public Department() {
    }

    public Department(Hospital hospital, String name) {
        this.hospital = hospital;
        this.name = name;
    }


    //Getters and setters:

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
