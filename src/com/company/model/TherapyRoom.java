package com.company.model;

import com.company.model.Room;
import com.company.model.TherapyDepartment;

public class TherapyRoom extends Room {
    TherapyDepartment therapyDepartment;

    public TherapyRoom() {
    }

    public TherapyRoom(int number, int width, int height, TherapyDepartment therapyDepartment) {
        super(number, width, height);
        this.therapyDepartment = therapyDepartment;
    }

    public TherapyDepartment getTherapyDepartment() {
        return therapyDepartment;
    }

    public void setTherapyDepartment(TherapyDepartment therapyDepartment) {
        this.therapyDepartment = therapyDepartment;
    }

    @Override
    public String toString() {
        return "TherapyRoom{" +
                "therapyDepartment=" + therapyDepartment +
                '}';
    }
}
