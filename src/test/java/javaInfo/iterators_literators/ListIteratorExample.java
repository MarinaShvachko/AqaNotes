package javaInfo.iterators_literators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int x = 1; x <= 10; x++) {
            numbers.add(x);
        }

        // by numbers.size() we set up a starting position from the start 10, 9, 8, 7 ...
        ListIterator<Integer> listIterator = numbers.listIterator(numbers.size());
        while (listIterator.hasPrevious()) {
           // System.out.println(listIterator.previous());
            if (4 == listIterator.previous()) {
                listIterator.set(99999999);
            }
        }

        System.out.println(numbers);
    }
}
