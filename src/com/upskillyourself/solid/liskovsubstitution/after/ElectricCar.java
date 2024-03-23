package com.upskillyourself.solid.liskovsubstitution.after;

public class ElectricCar implements Car {

    private ElectricMotor electricMotor;

    // It does not have the engine instead it has electric motor
    @Override
    public boolean turnOn() {
        return false;
    }

    @Override
    public void accelerate() {
    }

    private class ElectricMotor {
    }
}
