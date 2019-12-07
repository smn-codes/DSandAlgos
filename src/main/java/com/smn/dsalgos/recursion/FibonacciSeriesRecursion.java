package com.smn.dsalgos.recursion;

import static java.lang.String.format;

public class FibonacciSeriesRecursion {

    public void printSeries(final int n) {
        if (n >= 2) {
            System.out.println(0);
            System.out.println(1);
        }
        else if (n == 1) {
            System.out.println(0);
            return;
        }
        else {
            return;
        }
        doPrint(0, 1, n - 2);
    }

    private void doPrint(final int prePreviousValue, final int previousValue, final int n) {
        if (n == 0) {
            return;
        }
        int currentValue = prePreviousValue + previousValue;
        System.out.println(currentValue);
        doPrint(previousValue, currentValue, n - 1);
    }

    public int fibonacciNumber(final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException(format("'n'(%d) must not be negative", n));
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacciNumber(n - 2) + fibonacciNumber(n - 1);
    }

}
