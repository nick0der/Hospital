package com.company;

import java.time.LocalDate;

public abstract class Person {

    private String fullName;
    private String gender;
    private LocalDate birthday;

    public Person() {
    }

    public Person(String fullName, String gender, LocalDate birthday) {
        this.fullName = fullName;
        this.gender = gender;
        this.birthday = birthday;
    }


    //Getters and setters:

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
