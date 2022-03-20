package com.company.model;

import java.time.LocalDate;

public abstract class Employee extends Person {

    private int salary;
    private int experienceYears;
    private String education;
    private Department department;

    public Employee() {
    }

    public Employee(String fullName, String gender, LocalDate birthday, int salary,
                    int experienceYears, String education, Department department) {
        super(fullName, gender, birthday);
        this.salary = salary;
        this.experienceYears = experienceYears;
        this.education = education;
        this.department = department;
    }

    public void work(){
        System.out.println("Working");
    }


    //Getters and setters:

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

    public Department getDepartment() {
        return department;
    }

    public void setHospital(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", experienceYears=" + experienceYears +
                ", education='" + education + '\'' +
                ", department=" + department +
                '}';
    }
}
