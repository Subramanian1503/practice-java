package com.upskillyourself.designpatterns.structural.proxy.image;

public class ProxyImage implements Image {

    private final String fileName;
    private RealImage realImage;


    public ProxyImage(String fileName) {
        this.fileName = fileName;
        this.realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        realImage.display();
    }
}
