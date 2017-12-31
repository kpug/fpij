package io.github.kpug.chapter2;

import java.util.function.Function;

/**
 * @author: Lawrence
 * @since: 2017. 12. 3.
 * @note:
 */
public class ChapterTwoMain {

    public void main() {
        CustomFunction triple = new CustomFunction() {
            @Override
            public int apply(int args) {
                return args * 3;
            }
        };

        CustomFunction square = new CustomFunction() {
            @Override
            public int apply(int args) {
                return args * args;
            }
        };

        System.out.println(compose(triple, square).apply(3));

    }

    public static CustomFunction compose(final CustomFunction f1, final CustomFunction f2) {
        return new CustomFunction() {

            @Override
            public int apply(int args) {
                return f1.apply(f2.apply(args));
            }
        };
    }


    public static Function<Integer, Integer> compose(final Function<Integer, Integer> f1, final Function<Integer, Integer> f2) {
        return new Function<Integer, Integer>(){
            @Override
            public Integer apply(Integer o) {
                return f1.apply(f2.apply(o));
            }
        };
    }

    public static Function<Integer, Integer> compose2(final Function<Integer, Integer> f1, final Function<Integer, Integer> f2) {
        return x -> f1.apply(f2.apply(x));
    }
}
