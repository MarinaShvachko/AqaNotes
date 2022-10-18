package javaInfo.myCollectionExample.queueExamples;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayDeque;
import java.util.Deque;

//Array Double Ended Queue
public class ExampleArrayDequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.offer(1);
        numbers.offer(2);
        System.out.println(numbers.peek() + " peek() takes the first element from the start");
        System.out.println(numbers.getFirst() + " getFirst() the first element from the start");

        //with push using like stack FILA
        numbers.push(4);//add elements to the start of array
        numbers.push(3);



        System.out.println(numbers);
    }
}
