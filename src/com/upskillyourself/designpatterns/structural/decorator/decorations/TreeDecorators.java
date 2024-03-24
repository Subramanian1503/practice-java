package com.upskillyourself.designpatterns.structural.decorator.decorations;

import com.upskillyourself.designpatterns.structural.decorator.christmasTree.ChristmasTree;

public class TreeDecorators implements ChristmasTree {

    private ChristmasTree christmasTree;

    public TreeDecorators(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }


    @Override
    public void decorate() {
        christmasTree.decorate();
    }
}
