package com.upskillyourself.designpatterns.structural.decorator;

import com.upskillyourself.designpatterns.structural.decorator.christmasTree.ChristmasTree;
import com.upskillyourself.designpatterns.structural.decorator.christmasTree.ChristmasTreeImpl;
import com.upskillyourself.designpatterns.structural.decorator.decorations.BubbleLight;

public class Application {

    public static void main(String args[]){
        ChristmasTree christmasTree = new BubbleLight(new ChristmasTreeImpl());
        christmasTree.decorate();
    }
}
