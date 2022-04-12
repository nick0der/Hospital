package com.company.enums;

public enum DrivingCategory {

    A("Motorbikes"),
    B("Cars No Max 8 passenger seats"),
    BE("B + trailer No Up to 3,500kg"),
    B1("Light vehicles No Up to 550kg with goods"),
    C("Large lorries Yes Max trailer 750kg"),
    CE("C + trailer Yes N/A"),
    C1("C1 Lorries Yes Up to 7,500kg + 750kg trailer"),
    D("Bus Yes Trailer up to 750kg"),
    DE("D + trailer Yes N/A"),
    D1("Minibus Yes Length max 8m, trailer max 750kg"),
    D1E("D1 + trailer Yes N/A"),
    F("Tractor No N/A");

    private final String description;

    private DrivingCategory(String description) {
        this.description = description;
    }

    public String getValue() {
        return description;
    }
}
