package com.upskillyourself.designpatterns.creational.singleton;

/**
 * What is singleton pattern?
 * Sometimes while development we need to ensure that only
 * a single instance of that class is only created and is it accessible
 * from anywhere. In this case we can use singleton pattern.
 *
 * Problem that singleton pattern solves
 * - We need to create a object of a client to communicate to the client.
 * This object need not be created for every time the communication happends
 * in that case we use singleton pattern.
 *
 * Components that singleton pattern requires
 * - A class with its own type as a private variable
 * - A static method to check whether the variable is null if yes, assign new instance
 * if not return the variable.
 *
 * Example: Maintaining user session in the CLI
 *
 * Reference: https://medium.com/@thecodebean/singleton-design-pattern-implementation-in-java-1fba4ecc959f#:~:text=The%20Singleton%20Design%20Pattern%20ensures,resources%2C%20settings%2C%20or%20functionality.
 */