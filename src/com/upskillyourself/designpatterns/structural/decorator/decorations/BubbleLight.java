package com.upskillyourself.designpatterns.structural.decorator.decorations;

import com.upskillyourself.designpatterns.structural.decorator.christmasTree.ChristmasTree;

public class BubbleLight extends TreeDecorators {

    public BubbleLight(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public void decorate() {
        super.decorate();
        decorateWithBubbleLight();
    }

    private void decorateWithBubbleLight() {
        System.out.println("Decorated with bubble lights");
    }
}
