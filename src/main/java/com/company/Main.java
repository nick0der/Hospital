package com.company;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.company.enums.HealthStatus;
import com.company.model.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.company.enums.DrivingCategory;
import com.company.enums.Gender;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        List<Hospital> hospitals = Arrays.asList(
                new Hospital("Central Children Hospital", "vul. Halytska 11, Chernivtsi", "+380968903411")
        );

        List<OperatingDepartment> operatingDepartments = Arrays.asList(
                new OperatingDepartment(hospitals.get(0), 10, 1, 5),
                new OperatingDepartment(hospitals.get(0), 12, 2, 7)
        );

        List<StationaryDepartment> stationaryDepartments = Arrays.asList(
                new StationaryDepartment(hospitals.get(0), 7, 3, 5),
                new StationaryDepartment(hospitals.get(0), 9, 3, 7)
        );

        List<TherapyDepartment> therapyDepartments = Arrays.asList(
                new TherapyDepartment(hospitals.get(0), 3, 3, "Physical therapy", 5),
                new TherapyDepartment(hospitals.get(0), 5, 3, "Aromatherapy", 3)
        );

        List<OperatingRoom> operatingRooms = Arrays.asList(
                new OperatingRoom(1,3,4,5,12,4,8,operatingDepartments.get(0)),
                new OperatingRoom(2,3,4,8,10,2,3,operatingDepartments.get(0)),
                new OperatingRoom(3,3,4,3,5,7,5,operatingDepartments.get(0))
        );

        List<StationaryRoom> stationaryRooms = Arrays.asList(
                new StationaryRoom(1,3,5,stationaryDepartments.get(0),6,5),
                new StationaryRoom(2,3,4,stationaryDepartments.get(0),6,2),
                new StationaryRoom(3,2,5,stationaryDepartments.get(0),5,3)
        );

        List<TherapyRoom> therapyRooms = Arrays.asList(
                new TherapyRoom(1,3,4, therapyDepartments.get(0)),
                new TherapyRoom(2,3,5, therapyDepartments.get(0)),
                new TherapyRoom(3,4,5, therapyDepartments.get(1))
        );

        List<Ambulance> ambulances = Arrays.asList(
                new Ambulance("Mercedes Benz Sprinter", 2005, 1700, "AL1273BO",
                        hospitals.get(0), Ambulance.generateTrackNumber()),
                new Ambulance("Mercedes Benz Sprinter", 2007, 2100, "NK3450LM",
                        hospitals.get(0), Ambulance.generateTrackNumber())
        );

        List<Driver> drivers = Arrays.asList(
                new Driver("John Wick", Gender.MALE, LocalDate.of(1995, 5, 12), 1200, 7,
                        "Bachelor", ambulances.get(0), Arrays.asList(DrivingCategory.B, DrivingCategory.C)),
                new Driver("Ivan Duck", Gender.MALE, LocalDate.of(2000, 3, 8), 750, 3,
                        "Upper secondary education", ambulances.get(0), Arrays.asList(DrivingCategory.B, DrivingCategory.BE))
        );

        List<Surgeon> surgeons = Arrays.asList(
                new Surgeon("Dave Watson", Gender.MALE, LocalDate.of(2000, 12, 12), 5000, 7,
                        "Bachelor", false, operatingRooms.get(0))
        );

        List<Nurse> nurses = Arrays.asList(
                new Nurse("Eva Blue", Gender.FEMALE, LocalDate.of(2000, 12, 12), 5000, 5,
                        "Bachelor", stationaryRooms.get(0))
        );

        List<Therapist> therapists = Arrays.asList(
                new Therapist("Walter White", Gender.MALE, LocalDate.of(2000, 12, 12), 5000, 7,
                        "Master", therapyRooms.get(0))
        );

        List<Patient> patients = Arrays.asList(
                new Patient("Jesse Pinkman", Gender.MALE, LocalDate.of(2000, 10, 9), HealthStatus.SICK, stationaryRooms.get(0)),
                new Patient("Jake Brake", Gender.MALE, LocalDate.of(1990, 7, 6), HealthStatus.HEALTY, null),
                new Patient("Boris Brown", Gender.MALE, LocalDate.of(1991, 9, 12), HealthStatus.BEINGOPERATED, stationaryRooms.get(1))
        );

        LOGGER.info(drivers.get(0).getCategoriesString());

        hospitals.forEach(item -> LOGGER.info(item.toString()));
        operatingDepartments.forEach(item -> LOGGER.info(item.toString()));
        stationaryDepartments.forEach(item -> LOGGER.info(item.toString()));
        therapyDepartments.forEach(item -> LOGGER.info(item.toString()));
        operatingRooms.forEach(item -> LOGGER.info(item.toString()));
        stationaryRooms.forEach(item -> LOGGER.info(item.toString()));
        therapyRooms.forEach(item -> LOGGER.info(item.toString()));
        ambulances.forEach(item -> LOGGER.info(item.toString()));
        drivers.forEach(item -> LOGGER.info(item.toString()));
        surgeons.forEach(item -> LOGGER.info(item.toString()));
        nurses.forEach(item -> LOGGER.info(item.toString()));
        therapists.forEach(item -> LOGGER.info(item.toString()));
        patients.forEach(item -> LOGGER.info(item.toString()));
    }
}
