package com.upskillyourself.solid.liskovsubstitution.after;

public class MotorCar implements Car {

    private Engine engine;

    @Override
    public boolean turnOn() {
        return false;
    }

    @Override
    public void accelerate() {

    }

    private class Engine {
    }
}
