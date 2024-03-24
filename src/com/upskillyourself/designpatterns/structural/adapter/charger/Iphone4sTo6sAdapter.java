package com.upskillyourself.designpatterns.structural.adapter.charger;

public class Iphone4sTo6sAdapter implements IphoneCharger {

    private final Iphone4sCharger iphone4sCharger;

    public Iphone4sTo6sAdapter(Iphone4sCharger iphone4sCharger) {
        this.iphone4sCharger = iphone4sCharger;
    }


    @Override
    public void onCharge() {
        iphone4sCharger.onCharge();
    }
}
