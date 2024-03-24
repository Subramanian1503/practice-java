package com.upskillyourself.designpatterns.creational.factory;

/**
 * What is factory design pattern ?
 * - Provides interface to create objects.
 * - The object creation will be done in super class but the object can be altered by subclass
 * <p>
 * Why is it required ?
 * - Achieving the same behavior in different ways using different object
 * - Example: Triggering a test execution using COSYM as tool or ECU as test tool
 * <p>
 * How to do ?
 * - Move the decider method to a class called factoryClass
 * - This is not still factory pattern yet
 * - Bring abstraction for factory class, so that there can be some more factory classes can be extended.
 * - Now it is a factory pattern
 * <p>
 * Good example - https://prasadct.medium.com/factory-method-design-patternfactory-method-design-pattern-with-real-world-example-4ee909a24ab6
 */