package com.company.model;

import com.company.enums.HealthStatus;
import com.company.model.Department;
import com.company.model.Employee;
import com.company.model.OperatingRoom;
import com.company.model.Patient;

import java.time.LocalDate;

public class Surgeon extends Employee {

    private boolean operating;
    private OperatingRoom operatingRoom;

    public Surgeon(boolean operating) {
        this.operating = operating;
    }

    public Surgeon(String fullName, String gender, LocalDate birthday, int salary, int experienceYears, String education, Department department, boolean operating, OperatingRoom operatingRoom) {
        super(fullName, gender, birthday, salary, experienceYears, education, department);
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
