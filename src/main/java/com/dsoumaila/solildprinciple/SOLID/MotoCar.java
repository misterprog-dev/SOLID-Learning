package com.dsoumaila.solildprinciple.SOLID;

public class MotoCar implements Car {
    private Engine engine;

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(1000);
    }
}
