package com.dsoumaila.solildprinciple;

public class Guitar {
    private String make;
    private String model;
    private int volume;

    public Guitar() {
    }

    public Guitar(String make, String model, int volume) {
        this.make = make;
        this.model = model;
        this.volume = volume;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }
}
