package com.company.util;

public class Checker {
    public boolean isEven(int number) {
        if (number % 2 != 0) {
            return false;
        }
        return true;
    }

    public boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }
}
