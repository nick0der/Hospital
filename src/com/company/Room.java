package com.company;

public class Room {

    private Department department;
    private int number;
    private int width;
    private int height;

    public Room() {
    }

    public Room(Department department, int number, int width, int height) {
        this.department = department;
        this.number = number;
        this.width = width;
        this.height = height;
    }

    //Auto-calculated variable
    public int getArea(){
        return width * height;
    }


    //Getters and setters:

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
