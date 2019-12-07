package com.smn.dsalgos.recursion;

import org.junit.jupiter.api.Test;

@SuppressWarnings("MagicNumber")
class HelloWorldRecursionTest {

    private final HelloWorldRecursion helloWorldRecursion = new HelloWorldRecursion();

    @Test
    void printHelloWorld() {
        helloWorldRecursion.printHelloWorld(10);
    }

}