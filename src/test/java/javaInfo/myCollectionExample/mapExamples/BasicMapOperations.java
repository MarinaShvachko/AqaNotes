package javaInfo.myCollectionExample.mapExamples;

import java.util.*;

public class BasicMapOperations {
    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "Marina");
        employees.put(2, "Kostya");
        employees.put(3, "Andrey");
        employees.put(null, "kkk");

        //just print in a row
        System.out.println(employees);
        System.out.println();

        //iterate
        for (Map.Entry element : employees.entrySet()) {
            System.out.println(element.getKey() + " - this is key, " + element.getValue() + " - this is value");
        }
        System.out.println();

        //get value by a key
        System.out.println(employees.get(null)+ " - get value by Key");
        System.out.println();

        //linkedHashMap
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(null, 7);
        System.out.println(linkedHashMap + " this is linkedHashMap");

        //tree map
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "aka");
        treeMap.put(1, "hhh");
        treeMap.put(9, "ppp");
        treeMap.put(10, "hhh");

        System.out.println(treeMap + " example of tree map");

        //put keys from map to list
        List<Integer> listOfKeys = new ArrayList<>();
        for (Map.Entry integer : treeMap.entrySet()) {
            listOfKeys.add((Integer) integer.getKey());
        }
        System.out.println(listOfKeys + " - keys from treeMap");
    }
}
