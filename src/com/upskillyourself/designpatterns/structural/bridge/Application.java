package com.upskillyourself.designpatterns.structural.bridge;

import com.upskillyourself.designpatterns.structural.bridge.color.Blue;
import com.upskillyourself.designpatterns.structural.bridge.shape.Circle;
import com.upskillyourself.designpatterns.structural.bridge.shape.Shape;

public class Application {

    public static void main(String args[]){
        Shape circle = new Circle(new Blue());
        circle.getShape();
    }
}
