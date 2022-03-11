package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int i = incrementByOne(1);
        System.out.println(i);

        Integer i2 = incrementByOneFunction.apply(1);
        System.out.println(i2);

        Integer multiply = multiplyBy10Function.apply(i2);
        System.out.println(multiply);

        Function<Integer, Integer> incrementOneAndMultiply =
                incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println(incrementOneAndMultiply.apply(4));

        System.out.println(incrementByOneAndMultiply(1, 25));
        System.out.println(incrementByOneAndMultiply.apply(1, 25));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply =
            (number, multiply) -> (number + 1) * multiply;

    static int incrementByOne(int i) {
        return i + 1;
    }

    static int incrementByOneAndMultiply(int i, int j) {
        return (i + 1) * j;
    }
}
