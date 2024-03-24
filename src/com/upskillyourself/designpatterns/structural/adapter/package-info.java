package com.upskillyourself.designpatterns.structural.adapter;

/**
 * What is adapter design pattern ?
 * - Adpater design pattern acts as a wrapper between two non compatible interfaces.
 * - It helps to make successful communication between two classes which are different from each other
 *
 * Why is it required ?
 * - When we found that we are having two different components which needs to
 * be communicate with each other but the request models are not same across each other
 * it that can we can use a adapter design pattern which will act as a interface between
 * two non compatible interfaces.'
 *
 * How to do ?
 * Introduce a new adapter class which implementes the destination interface
 * on the implementation method implement the code to convert the request format from source
 * to the request format of destination.
 *
 * Good example - https://medium.com/@akshatsharma0610/adapter-design-pattern-in-java-fa20d6df25b8
 */