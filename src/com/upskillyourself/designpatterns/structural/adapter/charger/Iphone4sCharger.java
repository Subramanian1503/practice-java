package com.upskillyourself.designpatterns.structural.adapter.charger;

public class Iphone4sCharger implements IphoneCharger {

    @Override
    public void onCharge() {
        System.out.println("Charging Iphone 4s");
    }
}
