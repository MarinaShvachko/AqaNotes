package javaInfo.myCollectionExample.queueExamples;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExamplePriorityQ {
    public static void main(String[] args) {
        Queue<String> names = new PriorityQueue<>();
        names.add("Marina");
        names.add("Adam");
        names.offer("Luka");

//        System.out.println(names.poll());
//        System.out.println(names.poll());

        System.out.println(names);
        names.offer("Katia");
        System.out.println(names);

        names.remove();
        System.out.println(names);

        names.poll();
        System.out.println(names);

        names.element();
        System.out.println(names);

        names.peek();
        System.out.println(names);

        names.add(null);
    }
}
