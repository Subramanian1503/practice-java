package com.upskillyourself.designpatterns.structural.bridge.shape;

import com.upskillyourself.designpatterns.structural.bridge.color.Color;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }


    @Override
    public void getShape() {
        System.out.print("Rectangle shape filled with");
        color.fillColor();
    }
}
