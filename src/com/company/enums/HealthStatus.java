package com.company.enums;

public enum HealthStatus {
    SICK("Sick"),
    HEALTY("Healthy"),
    BEINGOPERATED("Being operated");

    private final String value;

    private HealthStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}