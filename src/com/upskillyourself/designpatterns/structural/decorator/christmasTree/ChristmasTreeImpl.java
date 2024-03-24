package com.upskillyourself.designpatterns.structural.decorator.christmasTree;

public class ChristmasTreeImpl implements ChristmasTree{


    @Override
    public void decorate() {
        System.out.println("christmas tree without decoration");
    }
}
