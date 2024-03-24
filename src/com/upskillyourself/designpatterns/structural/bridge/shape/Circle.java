package com.upskillyourself.designpatterns.structural.bridge.shape;

import com.upskillyourself.designpatterns.structural.bridge.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void getShape() {
        System.out.print("Circle shape filled with");
        color.fillColor();
    }
}

