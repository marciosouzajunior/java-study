import java.util.Random;
import java.util.function.*;

public class BuiltInFunctionalInterfaces {

    public static void main(String[] args) {

        // Function: Take a param and return a value
        Function<Integer, Integer> square = value -> value * value;
        System.out.println("Square of 2 is " + square.apply(2));

        // Predicate: Take a param and return true or false
        Predicate<Integer> evenTest = value -> (value % 2) == 0 ? true : false;
        System.out.println("Is 2 even? " + evenTest.test(2));
        System.out.println("Is 3 even? " + evenTest.test(3));

        // UnaryOperator: Take a param (do change) and return same
        UnaryOperator<String> unary = param -> param + " World!";
        System.out.println(unary.apply("Hello"));

        // BinaryOperator: Take 2 params and return one value
        BinaryOperator<String> binary = (value1, value2) -> value1 + " " + value2;
        System.out.println(binary.apply("Hello", "World!"));

        // Supplier: Generate a value of some type
        Supplier<Character> randomChar = () -> {
            Random r = new Random();
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            return alphabet.charAt(r.nextInt(26));
        };
        System.out.println("Random char: " + randomChar.get());

        // Consumer: Just consume a value without return
        Consumer<String> print = value -> System.out.println(value);
        print.accept("Hello World!");

    }

}
