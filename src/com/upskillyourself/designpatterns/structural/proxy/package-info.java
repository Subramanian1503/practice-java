package com.upskillyourself.designpatterns.structural.proxy;

/**
 * What is proxy design pattern?
 * Proxy design pattern is a structural design pattern, which can be
 * used to provide a proxy between the real object and the client that uses it
 * Here this proxy helps to provide restricted control to the client of the real object.
 * <p>
 * Why we require proxy design pattern?
 * - Proxy design pattern is required in scenarios where we dont want to provide the real object
 * to the client to access it instead we need to provide a substitute which will provide
 * restricted access or control to the real object
 * <p>
 * How to use proxy design pattern?
 * - Create the template for real object
 * - Create the proxy with restricted list of methods that provided by real object
 * - When proxy is created by the client create the real object as well
 * - When client calls the method call the real object method.
 * <p>
 * Reference: https://medium.com/@thecodebean/proxy-design-pattern-implementation-in-java-450c02898a21
 */