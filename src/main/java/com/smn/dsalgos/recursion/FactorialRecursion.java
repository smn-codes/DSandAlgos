package com.smn.dsalgos.recursion;

public class FactorialRecursion {

    public int calculate(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException(String.format("Value %d should not be negative. Must not.", n));
        }
        return findFactorial(n);
    }

    private int findFactorial(final int n) {
        if (n <= 0) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }

}
