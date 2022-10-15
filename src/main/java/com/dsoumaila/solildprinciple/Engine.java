package com.dsoumaila.solildprinciple;

public class Engine {
    private int vitesse;

    public void powerOn(int newVitesse) {
        vitesse = newVitesse;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void on() {
        // Actived engine
    }
}
