package com.company;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a -b;
    }

    public long multiply(int a, int b) {
        return ((long) a * b);
    }

    public double division(int a, int b) {
        if (b != 0) {
            return ((double) a / b);
        }
        else {
            System.out.println("Нельзя делить на ноль");
            return 0;
        }
    }
}
