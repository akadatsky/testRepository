package com.akadatsky;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init() {
        calculator = new Calculator();
    }

    @AfterEach
    void doSomething() {
        // clean
    }

    @Test
    void getInstance() {
        Assertions.assertNotNull(Calculator.getInstance());
//        Assertions.assertNull(Calculator.getInstance());
    }

    @Test
    void div() {
        assertThat(calculator.div(8, 2), is(4));
        assertThat(calculator.div(100, 50), is(2));
        assertThat(calculator.div(5, 2), is(2));
    }

    @Test
    void whenParamIsZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.div(5, 0);
        });
    }

}