package com.company;

import com.company.enums.DrivingCategory;
import com.company.model.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Hospital hospital = new Hospital("Central Children Hospital", "vul. Halytska 11, Chernivtsi", "+380968903411");
        OperatingDepartment operatingDepartment1 = new OperatingDepartment(hospital, 12, 3, 10);
        OperatingRoom operatingRoom1 = new OperatingRoom(10, 250, 350, 37, 98, 21, 10, operatingDepartment1);
        Ambulance ambulance1 = new Ambulance("Mercedes Benz Sprinter", 2005, 1700, "AL1273BO", hospital, "№12931430");

        Surgeon surgeon1 = new Surgeon("Test", "male",
                LocalDate.of(2000, 12, 12), 5000,
                7, "Bachelor", false, operatingRoom1);
        Driver driver = new Driver("Test", "male", LocalDate.of(2000, 12, 12), 5000,
                7, "Bachelor", ambulance1, Arrays.asList(DrivingCategory.A, DrivingCategory.B));

        //Print static field
        System.out.println("Total employees: " + Employee.totalEmployees);
    }
}
