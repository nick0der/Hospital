package com.company.model;

public abstract class Room {

    private int number;
    private int width;
    private int height;

    public Room() {
    }

    public Room(int number, int width, int height) {
        this.number = number;
        this.width = width;
        this.height = height;
    }

    //Auto-calculated variable
    public int getArea(){
        return width * height;
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

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
