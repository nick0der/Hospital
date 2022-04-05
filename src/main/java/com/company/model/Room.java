package com.company.model;

import com.company.exceptions.IncorrectArgumentException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public abstract class Room {

    private static final Logger LOGGER = LogManager.getLogger(Room.class);

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

    //Width setter with exception (width cannot be negative)
    public void setWidth(int width) {
        try {
            if (width < 0) throw new IncorrectArgumentException("Width cannot be negative: " + width);
            this.width = width;
        } catch (IncorrectArgumentException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
    }

    public int getHeight() {
        return height;
    }

    //Height setter with exception (height cannot be negative)
    public void setHeight(int height) {
        try {
            if (height < 0) throw new IncorrectArgumentException("Height cannot be negative: " + height);
            this.height = height;
        } catch (IncorrectArgumentException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
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
