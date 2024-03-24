package com.upskillyourself.designpatterns.behavioural.command;

/**
 *
 *
 * What is command pattern ?
 * - Command pattern is used to encapsulate a request into a command object and that
 * can be executed using the execution that we defined in the object.
 *
 * Problem that command pattern solves?
 * - Encapsulating the required methods and the corresponding request
 * into a single class called command. Hence it follows open for extension and closed for modification.
 * - Helps in decoupling the invoking of the command and command execution.
 * - Helps in encapsulating different stages of a life cycle(birth, live, die)
 *
 * Components used in command pattern?
 * - Different commands with its implementation
 * - Invoker of the command
 * - Application client
 *
 * Example: Buying a product involves, Adding to cart, Make payment, Create order, dispath items to logistic
 * Test execution -> Run command, Status command, Download
 *
 * Reference: https://medium.com/swlh/command-pattern-what-it-is-and-how-to-use-it-7ccbc810266d#:~:text=Suppose%20there%20are%20two%20objects,the%20execution%20of%20the%20request.
 */