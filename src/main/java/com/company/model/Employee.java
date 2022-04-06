package com.company.model;

import java.time.LocalDate;

import com.company.enums.Gender;

public abstract class Employee extends Person  {

    private int salary;
    private int experienceYears;
    private String education;
    public static int totalEmployees = 0;

    public Employee() {
        totalEmployees += 1;
    }

    public Employee(String fullName, Gender gender, LocalDate birthday, int salary,
                    int experienceYears, String education) {
        super(fullName, gender, birthday);
        this.salary = salary;
        this.experienceYears = experienceYears;
        this.education = education;
        totalEmployees += 1;
    }

    public void work(){
        System.out.println("Working");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", experienceYears=" + experienceYears +
                ", education='" + education + '\'' +
                '}';
    }
}
