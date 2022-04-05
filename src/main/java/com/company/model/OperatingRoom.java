package com.company.model;

public final class OperatingRoom extends Room {

    private int beds;
    private int scalpels;
    private int scissors;
    private int pincers;
    private OperatingDepartment operatingDepartment;

    public OperatingRoom() {
    }

    public OperatingRoom(int number, int width, int height, int beds, int scalpels, int scissors, int pincers, OperatingDepartment operatingDepartment) {
        super(number, width, height);
        this.beds = beds;
        this.scalpels = scalpels;
        this.scissors = scissors;
        this.pincers = pincers;
        this.operatingDepartment = operatingDepartment;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getScalpels() {
        return scalpels;
    }

    public void setScalpels(int scalpels) {
        this.scalpels = scalpels;
    }

    public int getScissors() {
        return scissors;
    }

    public void setScissors(int scissors) {
        this.scissors = scissors;
    }

    public int getPincers() {
        return pincers;
    }

    public void setPincers(int pincers) {
        this.pincers = pincers;
    }

    public OperatingDepartment getOperatingDepartment() {
        return operatingDepartment;
    }

    public void setOperatingDepartment(OperatingDepartment operatingDepartment) {
        this.operatingDepartment = operatingDepartment;
    }

    @Override
    public String toString() {
        return "OperatingRoom{" +
                "beds=" + beds +
                ", scalpels=" + scalpels +
                ", scissors=" + scissors +
                ", pincers=" + pincers +
                ", operatingDepartment=" + operatingDepartment +
                '}';
    }
}
