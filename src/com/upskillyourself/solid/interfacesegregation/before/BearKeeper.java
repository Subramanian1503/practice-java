package com.upskillyourself.solid.interfacesegregation.before;

// All the clients that implements this interface should know how to wash, feed and pet bear
public interface BearKeeper {

    void washBear();

    void feedBear();

    void petBear();
}
