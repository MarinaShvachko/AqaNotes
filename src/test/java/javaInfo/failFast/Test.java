package javaInfo.failFast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
    public static void main(String[] args) {
        failSafe();
        failFast();
    }

    public static void failFast() {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("cucumber");
        vegetables.add("onion");

        Iterator<String> iterator = vegetables.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            vegetables.add("potato"); //this brings java.util.ConcurrentModificationException
        }
    }

    public static void failSafe() {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("cucumber");
        vegetables.add("onion");

        CopyOnWriteArrayList<String> safeVegetables = new CopyOnWriteArrayList<>(vegetables);

        Iterator<String> iterator = safeVegetables.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals("onion")) {
                safeVegetables.add("tomato");
            }
        }
        System.out.println(safeVegetables);
    }
}
