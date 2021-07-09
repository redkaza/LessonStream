package calculator;

import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Calculator{

    public static Supplier<Calculator> instance = Calculator::new;

    public static BinaryOperator<Integer> plus = (x, y) -> x + y;
    public static BinaryOperator<Integer> minus = (x, y) -> x - y;
    public static BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public static BinaryOperator<Integer> devide = (x, y) -> {
        if(y==0) {return 99999;}
        else {return x / y;}
    };
    public static UnaryOperator<Integer> pow = x -> x * x;
    public static UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    public static Predicate<Integer> isPositive = x -> x > 0;
    public static Consumer<Integer> println = System.out::println;
}

