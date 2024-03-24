package com.upskillyourself.designpatterns.structural.decorator.decorations;

import com.upskillyourself.designpatterns.structural.decorator.christmasTree.ChristmasTree;

public class TreeTopper extends TreeDecorators {

    public TreeTopper(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public void decorate() {
        super.decorate();
        decorateWithTreeToppers();
    }

    private void decorateWithTreeToppers() {
        System.out.println("Decorated with Tree toppers");
    }
}
