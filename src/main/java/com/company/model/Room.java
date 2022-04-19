package com.company.model;

import com.company.interfaces.Area;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.company.exceptions.IncorrectArgumentException;

public abstract class Room {

    private static final Logger LOGGER = LogManager.getLogger(Room.class);

    private int number;
    private int width;
    private int length;

    public Room() {
    }

    public Room(int number, int width, int length) {
        this.number = number;
        this.width = width;
        this.length = length;
    }

    //Auto-calculated variable
    public int getArea(){
        Area area = (int x, int y) -> x * y;
        return area.calculate(width, length);
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

    public int getLength() {
        return length;
    }

    //Length setter with exception (length cannot be negative)
    public void setLength(int length) {
        try {
            if (length < 0) throw new IncorrectArgumentException("Length cannot be negative: " + length);
            this.length = length;
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
                ", length=" + length +
                '}';
    }
}
