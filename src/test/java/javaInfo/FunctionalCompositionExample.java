package javaInfo;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalCompositionExample {
    public static void main(String[] args) {
        Predicate<String> startsWithA = text -> text.startsWith("A");
        Predicate<String> endsWithX = text -> text.endsWith("x");

        Predicate<String> composed = startsWithA.and(endsWithX);

        String input = "A hardworking person must relax";
        boolean result = composed.test(input);
        System.out.println(result);

        //OR

        Predicate<String> composed2 = startsWithA.or(endsWithX);

        String input2 = "A hardworking person must relax sometimes";
        boolean result2 = composed.test(input);
        System.out.println(result);

        //CONSUMER
        Consumer<String> lowerPrint = text -> System.out.println(text.toLowerCase());
        Consumer<String> upperPrint = text -> System.out.println(text.toUpperCase());

        lowerPrint.andThen(upperPrint).accept("example");
    }
}
