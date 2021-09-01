package com.fu.mathutil;

public class MathUtil {

    public static long getFactorial(int n) {
        long factorial = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("!!!Invalid argument!!! n must be between 0 and 20");
        } else if (n == 0 || n == 1) {
            return factorial;
        } else {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
}
