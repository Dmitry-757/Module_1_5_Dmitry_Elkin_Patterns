package com.Dmitry_Elkin.Patterns.structural.facade;

public enum Container {
    BOTTLE_1_5(1.5),
    BOTTLE_3_0(3),
    PET_KEG_10(10),
    PET_KEG_20(20),
    PET_KEG_30(30),
    STEEL_KEG_25(25),
    STEEL_KEG_50(50);
    private double value;
    Container(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
