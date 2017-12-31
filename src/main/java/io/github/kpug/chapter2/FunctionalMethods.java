package io.github.kpug.chapter2;

import java.util.List;

/**
 * @author: Lawrence
 * @since: 2017. 12. 3.
 * @note:
 */
public class FunctionalMethods {
    public int percent1 = 5;
    private int percent2 = 9;
    public final int percent3 = 13;

    // Pure function
    public int add(int a, int b) {
        return a + b;
    }

    // Not
    public void setPercent2(int value) {
        percent2 = value;
    }

    // Pure function
    public int mult(int a, Integer b) {
        a = 5;
        b = 2;
        return a * b;
    }

    // Not - because if b is zero, it throw a exception.
    public int div(int a, int b) {
        return a / b;
    }

    // Not - because percent1 is public.
    public int applyTax1(int a) {
        return a / 100 * (100 + percent1);
    }

    // Not
    public int applyTax2(int a) {
        return a / 100 * (100 + percent2);
    }

    // Pure function
    public int applyTax3(int a) {
        return a / 100 * (100 + percent3);
    }

    // Not - because of inside mutation is visible from outside
    public List<Integer> append(int i, List<Integer> list){
        list.add(i);
        return list;
    }
}
