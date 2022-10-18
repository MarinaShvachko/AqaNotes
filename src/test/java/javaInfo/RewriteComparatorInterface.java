package javaInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RewriteComparatorInterface {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Tomsk");
        cities.add("Ekaterinburg");
        cities.add("Astrahan");
        cities.add("Le");

        //sort by natural order
        Collections.sort(cities);
        System.out.println(cities + " = sort by natural order");

        //but what if I want to use sort() method but sort how I want, for example by String length
        //there are 2 options 1) create class and implement Comparable interface 2) do it in method using lambdas

        //second method:
        Collections.sort(cities, (o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            } else if (o1.length() < o2.length()) {
                return -1;
            } else {
                return 0;
            }
        });
        //outcome of sort
        System.out.println(cities);

    }
}
