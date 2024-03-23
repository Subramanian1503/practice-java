package com.upskillyourself.solid.liskovsubstitution.before;

public class MotorCar implements Car{

    private Engine engine;

    @Override
    public boolean turnOnEngine() {
        return false;
    }

    @Override
    public void accelerate() {

    }

    private class Engine {
    }
}
