import java.util.function.*;

public class Lambda {
    @FunctionalInterface
    public interface Math {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {

        //Lambda
        BinaryOperator<Integer> add = (a, b) -> a + b;
        BinaryOperator<Integer> subtract = (a, b) -> a - b;
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        BinaryOperator<Integer> divide = (a, b) -> a / b;

        System.out.println(add.apply(34,5));
        System.out.println(subtract.apply(56,8));
        System.out.println(multiply.apply(2,4));
        System.out.println(divide.apply(20,4));


        System.out.println("--------");

        //Functional Interfaces
        Math addition = (int a, int b) -> a + b;
        Math subtraction = (int a, int b) -> a - b;
        Math multiplication = (int a, int b) -> a * b;
        Math division = (int a, int b) -> a / b;

        System.out.println(addition.calculate(34, 5));
        System.out.println(subtraction.calculate(56,8));
        System.out.println(multiplication.calculate(2,4));
        System.out.println(division.calculate(20, 4));


        System.out.println("------");

        //Built-In
        Consumer<String> print = message -> System.out.println(message);
        print.accept("Hello World I am THE CONSUMER");

        Predicate<Integer> ifPositive = x -> subtraction.calculate(20, 18) >= x;
        if(ifPositive.test(0)) print.accept("The result is greater than the variable");
        else print.accept("The result is less than the variable");

        Function<Double, Double> divideByTwo = x -> x/2;
        System.out.println(divideByTwo.apply(7.0));

        Supplier<String> newText = () -> "I was supplied";
        print.accept(newText.get());


    }

}
