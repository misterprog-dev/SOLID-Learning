package com.dsoumaila.solildprinciple.SOLID;

public class ElectricCar implements Car {
    @Override
    public void turnOnEngine() {
        throw new AssertionError("I don't have a engine");
    }

    @Override
    public void accelerate() {
        //
    }

    // By throwing a car without an engine into the mix, we are inherently changing the behavior of our program.
    // This is a violation of Liskov Substitution Principle
    // One possible solution would be to rework our model into interfaces that take into account the engine-less state of our Car.
}
