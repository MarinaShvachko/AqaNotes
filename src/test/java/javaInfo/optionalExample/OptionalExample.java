package javaInfo.optionalExample;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class OptionalExample {
    public static void main(String[] args) {
        String name="java";
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt); //if instead of "java" will be null, we will have Optional.empty

        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(4);
//        numbers.add(3);
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        if(min.isPresent()){
            System.out.println(min.get());
        }

        //The second way is the orElse() method. It allows you to define an alternative value that will be returned if the Optional doesn’t have any value:
        Optional<Integer> min2 = numbers.stream().min(Integer::compare);
        System.out.println(min2.orElse(-1)); //if there is no min then -1 will be returned

       // Another way is the orElseGet() method. It allows you to define a function that will return a default value:
        Optional<Integer> min3 = numbers.stream().min(Integer::compare);
        Random random = new Random();
        System.out.println(min.orElseGet(() -> random.nextInt(100)));

       //Another method, orElseThrow(), allows you to throw an exception if the Optional does not contain a value:
        //System.out.println(min.orElseThrow(IllegalStateException::new));

        //The ifPresent() method defines actions on the value in Optional, if the value is present:
        Optional<Integer> min4 = numbers.stream().min(Integer::compare);
        min.ifPresent(v -> System.out.println(v));


        Optional<Integer> min5 = numbers.stream().min(Integer::compare);
        min5.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("Value not found")
        );

    }
}
