package com.dsoumaila.solildprinciple;

public class SuperCoolGuitarWithFlames extends Guitar{
    private String flameColor;

    public String getFlameColor() {
        return flameColor;
    }

    // After few months of the Guitar.class creating, We decide to add flameColor to Guitar characteristics and to avoid
    // to modify Guitar class, we decide to extend it for Open/Closed Principle.
}
