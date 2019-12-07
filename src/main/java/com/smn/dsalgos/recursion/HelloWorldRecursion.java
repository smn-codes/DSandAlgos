package com.smn.dsalgos.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloWorldRecursion {

    public void printHelloWorld(final int n) {
        if (n < 1) {
            return;
        }
        printHelloWorld(n - 1);
        LOGGER.info("Hello World - {}", n);
    }

}
