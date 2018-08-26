package com.akadatsky;

public class Calculator {

    public static Calculator getInstance() {
        return new Calculator();
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }

}
