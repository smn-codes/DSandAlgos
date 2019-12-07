package com.smn.dsalgos.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("MagicNumber")
class FibonacciSeriesRecursionTest {

    private final FibonacciSeriesRecursion recursion = new FibonacciSeriesRecursion();

    @Test
    void printSeries() {
        recursion.printSeries(47);
    }

    @Test
    void fibonacciNumber5() {
        assertThat(recursion.fibonacciNumber(5)).isEqualTo(3);
    }

    @Test
    void fibonacciNumber10() {
        assertThat(recursion.fibonacciNumber(10)).isEqualTo(34);
    }

}