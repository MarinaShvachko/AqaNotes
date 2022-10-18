package javaInfo.iterators_literators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int x = 1; x <= 10; x++) {
            numbers.add(x);
        }
        //Iterators for Collections don't guarantee iteration in any particular order
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            //iterator.forEachRemaining(System.out::println); just print
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers); //as a result here will be only odd numbers



    }
}
