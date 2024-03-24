package com.upskillyourself.designpatterns.creational.singleton;

public class Singleton {

    private static Singleton singleton;

    public synchronized static Singleton getInstance(){
        if(null == singleton){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void printValue(){
        System.out.println("printing the singleton class");
    }
}
