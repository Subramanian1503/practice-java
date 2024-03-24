package com.upskillyourself.designpatterns.structural.bridge.color;

public class Red implements Color {
    @Override
    public void fillColor() {
        System.out.println("red color");
    }
}
