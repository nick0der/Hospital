package com.company;


public enum Symptoms {
    HEADACHE("Headache"),
    STOMACHACHE("Stomachache"),
    TEMPERATURE("Temperature");

    private final String value;

    private Symptoms(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}