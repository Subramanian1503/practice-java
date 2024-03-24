package com.upskillyourself.designpatterns.structural.adapter;

import com.upskillyourself.designpatterns.structural.adapter.charger.Iphone4sCharger;
import com.upskillyourself.designpatterns.structural.adapter.charger.Iphone4sTo6sAdapter;
import com.upskillyourself.designpatterns.structural.adapter.iphone.Iphone;
import com.upskillyourself.designpatterns.structural.adapter.iphone.Iphone6s;

public class Application {

    public static void main(String args[]) {
        Iphone iphone = new Iphone6s(new Iphone4sTo6sAdapter(new Iphone4sCharger()));
        iphone.charge();
    }
}
