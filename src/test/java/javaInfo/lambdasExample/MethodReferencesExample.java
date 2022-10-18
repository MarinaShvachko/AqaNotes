package javaInfo.lambdasExample;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencesExample {
    public static void main(String[] args) {
//        Function<String, Boolean> function = e -> Boolean.valueOf(e);
//        System.out.println(function.apply("TRUE"));
        //with method reference:
        Function<String, Boolean> function = Boolean::valueOf;
        System.out.println(function.apply("hey"));

//        Consumer<String> consumer = e -> System.out.println(e);
//        consumer.accept("OCPJP 8");
        Consumer<String> consumer = System.out::println;
        consumer.accept("Lala");

//        Integer integer = 5;
//        Supplier<String> supplier = () -> integer.toString();
//        System.out.println(supplier.get());
        Integer integer = 5;
        Supplier<String> supplier = integer::toString;
        System.out.println(supplier.get());

//        Function<String, String> function = s -> s.toLowerCase();
//        System.out.println(function.apply("OCPJP 8"));
        Function<String, String> func = String::toLowerCase;
        System.out.println(func.apply("KKKKK"));

//        Function<String, Integer> funct = (d) -> new Integer(d);
//        System.out.println(function.apply("4"));
        Function<String, Integer> funct = Integer::new;
        System.out.println(funct.apply("7"));
    }
}
