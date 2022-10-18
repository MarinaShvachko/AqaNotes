package javaInfo.myCollectionExample.setExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(44);
        numbers.add(1);
        numbers.add(34);
        numbers.add(5);

//        for (Integer num : numbers) {
//            System.out.println(num);
//        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
