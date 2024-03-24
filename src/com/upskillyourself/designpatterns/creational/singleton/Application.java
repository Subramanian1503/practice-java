package com.upskillyourself.designpatterns.creational.singleton;

public class Application {

    public static void main(String args[]){
        Singleton singleton = Singleton.getInstance();

        singleton.printValue();
    }
}
