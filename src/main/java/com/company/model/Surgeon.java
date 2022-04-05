package com.company.model;

import com.company.enums.Gender;
import com.company.enums.HealthStatus;
import com.company.interfaces.IOperate;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.time.LocalDate;

public final class Surgeon extends Employee implements IOperate {

    private static final Logger LOGGER = LogManager.getLogger(Nurse.class);

    private boolean operating;
    private OperatingRoom operatingRoom;

    public Surgeon(boolean operating) {
        this.operating = operating;
    }

    public Surgeon(String fullName, Gender gender, LocalDate birthday, int salary, int experienceYears,
                   String education, boolean operating, OperatingRoom operatingRoom) {
        super(fullName, gender, birthday, salary, experienceYears, education);
        this.operating = operating;
        this.operatingRoom = operatingRoom;
    }

    public void startOperate(Patient patient) {
        operating = true;
        patient.setHealthStatus(HealthStatus.BEINGOPERATED);
        LOGGER.info("Surgeon " + getFullName() + " is now operating");
        LOGGER.info("Patient " + patient.getFullName() + " is being operated");
    }

    public void endOperate(Patient patient){
        operating = false;
        patient.setHealthStatus(HealthStatus.HEALTY);
        LOGGER.info("Surgeon " + getFullName() + " ended operation");
        LOGGER.info("Patient " + patient.getFullName() + " is now healthy");
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
