package com.company.model;

import java.time.LocalDate;

import com.company.exceptions.IncorrectArgumentException;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.company.enums.Gender;
import com.company.exceptions.DateAboveAvailableException;
import com.company.exceptions.DateBelowAvailableException;

public abstract class Person {

    private static final Logger LOGGER = LogManager.getLogger(Person.class);

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
        try {
            if (!StringUtils.isAlpha(fullName))
                throw new IncorrectArgumentException("Full name must contain only letters.");
            else if (StringUtils.isBlank(fullName)) {
                throw new IncorrectArgumentException("Full name cannot be blank.");
            }
            this.fullName = fullName;
        } catch (IncorrectArgumentException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
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
                throw new DateBelowAvailableException("Date " + birthday.toString() + " is very old. Choose another date.");
            else if (birthday.isAfter(LocalDate.now()))
                throw new DateAboveAvailableException("Date " + birthday.toString() + " is very new. Choose another date.");
                this.birthday = birthday;
        } catch (DateBelowAvailableException | DateAboveAvailableException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
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
