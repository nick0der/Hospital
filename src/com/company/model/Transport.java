package com.company.model;

public abstract class Transport {

    private String model;
    private int year;
    private int price;
    private String licensePlate;

    public Transport() {
    }

    public Transport(String model, int year, int price, String licensePlate) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        try {
            if (year < 1900) throw new IllegalArgumentException(year + " is not valid value. Year must be 1900 or higher.");
            this.year = year;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
