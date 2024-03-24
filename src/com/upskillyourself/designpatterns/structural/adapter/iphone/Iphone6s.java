package com.upskillyourself.designpatterns.structural.adapter.iphone;

import com.upskillyourself.designpatterns.structural.adapter.charger.IphoneCharger;

public class Iphone6s implements Iphone {

    private IphoneCharger iphone4sTo6sAdapter;

    public Iphone6s(IphoneCharger iphone4sTo6sAdapter) {
        this.iphone4sTo6sAdapter = iphone4sTo6sAdapter;
    }

    @Override
    public void charge() {
        iphone4sTo6sAdapter.onCharge();
    }
}
