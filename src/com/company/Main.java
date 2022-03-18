package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Hospital hospital = new Hospital("Children hospital №3",
                "Halytska street 1", "+380503940244");

        Department department1 = new Department(hospital, "Department of otolaryngology");
        Department department2 = new Department(hospital, "Department of therapy");

        Nurse nurse1 = new Nurse("Domrer Natalie", "Female", LocalDate.of(2000, 7, 12),
                9000, 2, "Bachelor's Degree", department1);
        Nurse nurse2 = new Nurse("Brown Annie", "Female", LocalDate.of(1997, 11, 20),
                12500, 5, "Master's Degree", department2);

        Doctor doctor1 = new Doctor("Smith John", "Male", LocalDate.of(1990, 5, 11),
                15500, 7, "Master's Degree", department1, "therapist");
        Doctor doctor2 = new Doctor("White Timothy", "Male", LocalDate.of(1997, 3, 7),
                13700, 5, "Master's Degree", department2, "therapist");

        Patient patient1 = new Patient("Preston John", "Male", LocalDate.of(1998, 9, 7),
                Arrays.asList(Symptoms.TEMPERATURE, Symptoms.HEADACHE), "", false);

        doctor1.curePatient(patient1);
        System.out.println("Prescription: " + patient1.getPrescription());

    }
}
