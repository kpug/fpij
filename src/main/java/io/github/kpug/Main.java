package io.github.kpug;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;


/**
 * @author: Lawrence
 * @since: 2017. 12. 2.
 * @note:
 */
public class Main {

    public static void main(String... args) {
        Function<Integer, Function<Integer, Integer>> f = x -> y -> x + y;

        Function<Integer, Integer> triple = x -> x * 3;
        Function<Integer, Integer> square = x -> x * x;

        Function<Function<Integer, Integer>,
                Function<Function<Integer, Integer>, Function<Integer, Integer>>>
                compose = x -> y -> z -> x.apply(y.apply(z));

        Function<Integer, Integer> composedFunc = compose.apply(square).apply(triple);

        System.out.println("composedFunc.apply(3) = " + composedFunc.apply(2));
    }

    static <T, U, V> Function<Function<U, V>,
                              Function<Function<T, U>, Function<T, V>>> higherCompose() {
        return x -> y -> z -> x.apply(y.apply(z));
    }


    public void aMethod(){
        Double taxRate = 0.09;
        Function<Double, Double> addTax = price -> price + price * taxRate;
    }
}
