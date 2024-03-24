package com.upskillyourself.designpatterns.structural.proxy.image;

public class ProxyImage implements Image{

    private RealImage realImage;

    private final String fileName;


    public ProxyImage(String fileName) {
        this.fileName = fileName;
        this.realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        realImage.display();
    }
}
