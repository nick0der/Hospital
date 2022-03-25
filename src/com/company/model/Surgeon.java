package com.company.model;

import com.company.enums.HealthStatus;
import com.company.interfaces.IOperate;

import java.time.LocalDate;

public final class Surgeon extends Employee implements IOperate {

    private boolean operating;
    private OperatingRoom operatingRoom;

    public Surgeon(boolean operating) {
        this.operating = operating;
    }

    public Surgeon(String fullName, String gender, LocalDate birthday, int salary, int experienceYears,
                   String education, boolean operating, OperatingRoom operatingRoom) {
        super(fullName, gender, birthday, salary, experienceYears, education);
        this.operating = operating;
        this.operatingRoom = operatingRoom;
    }

    public void startOperate(Patient patient) {
        operating = true;
        patient.setHealthStatus(HealthStatus.BEINGOPERATED);
    }

    public void endOperate(Patient patient){
        operating = false;
        patient.setHealthStatus(HealthStatus.HEALTY);
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    public OperatingRoom getOperatingRoom() {
        return operatingRoom;
    }

    public void setOperatingRoom(OperatingRoom operatingRoom) {
        this.operatingRoom = operatingRoom;
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "operating=" + operating +
                '}';
    }
}
