package com.smn.dsalgos.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SuppressWarnings("MagicNumber")
class FactorialRecursionTest {

    private final FactorialRecursion recursion = new FactorialRecursion();

    @Test
    void throwExceptionForNegativeIntegers() {
        assertThatThrownBy(() -> recursion.calculate(-1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void calculateFactorial5() {
        assertThat(recursion.calculate(5)).isEqualTo(120);
    }

    @Test
    void calculateFactorial10() {
        assertThat(recursion.calculate(10)).isEqualTo(3628800);
    }

}