package com.company.model;

import com.company.enums.Gender;

import java.time.LocalDate;

public abstract class Person {

    private String fullName;
    private Gender gender;
    private LocalDate birthday;

    public Person() {
    }

    public Person(String fullName, Gender gender, LocalDate birthday) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    //Birthday setter with exception (cannot be under 1900 year)
    public void setBirthday(LocalDate birthday) {
        try {
            if (birthday.isBefore(LocalDate.of(1900, 1, 1)))
                throw new IllegalArgumentException("Date " + birthday.toString() + " is very old. Choose new date.");
                this.birthday = birthday;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
