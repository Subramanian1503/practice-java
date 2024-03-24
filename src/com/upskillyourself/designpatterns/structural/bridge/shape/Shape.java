package com.upskillyourself.designpatterns.structural.bridge.shape;

import com.upskillyourself.designpatterns.structural.bridge.color.Color;

public abstract class Shape {

    protected final Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract public void getShape();

}
