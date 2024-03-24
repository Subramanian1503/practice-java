package com.upskillyourself.designpatterns.structural.proxy.image;

public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromFile(fileName);
    }

    private void loadImageFromFile(String fileName){
        System.out.println("Loading image from file with name " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying the real image with file name "+ fileName );
    }
}
