package com.company;

import java.time.LocalDate;
import java.util.Arrays;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.company.enums.DrivingCategory;
import com.company.enums.Gender;
import com.company.model.Hospital;
import com.company.model.OperatingDepartment;
import com.company.model.OperatingRoom;
import com.company.model.Ambulance;
import com.company.model.Surgeon;
import com.company.model.Driver;
import com.company.model.Employee;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        LOGGER.info("Application started");

        Hospital hospital = new Hospital("Central Children Hospital", "vul. Halytska 11, Chernivtsi", "+380968903411");
        OperatingDepartment operatingDepartment1 = new OperatingDepartment(hospital, 12, 3, 10);
        OperatingRoom operatingRoom1 = new OperatingRoom(10, 250, 350, 37, 98, 21, 10, operatingDepartment1);
        Ambulance ambulance1 = new Ambulance("Mercedes Benz Sprinter", 2005, 1700, "AL1273BO", hospital, "№12931430");

        Surgeon surgeon1 = new Surgeon("Test", Gender.MALE,
                LocalDate.of(2000, 12, 12), 5000,
                7, "Bachelor", false, operatingRoom1);
        Driver driver = new Driver("Test", Gender.MALE, LocalDate.of(2000, 12, 12), 5000,
                7, "Bachelor", ambulance1, Arrays.asList(DrivingCategory.A, DrivingCategory.B));

        ambulance1.setYear(-1);

        LOGGER.info(ambulance1.getYear());
        //Print static field
        LOGGER.info("Total employees: " + Employee.totalEmployees);

        LOGGER.info("Application finished");
    }
}
