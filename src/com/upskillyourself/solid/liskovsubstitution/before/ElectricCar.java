package com.upskillyourself.solid.liskovsubstitution.before;

public class ElectricCar implements Car{

    // It does not have the engine
    @Override
    public boolean turnOnEngine() {
        return false;
    }

    @Override
    public void accelerate() {
    }
}
