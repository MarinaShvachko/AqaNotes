package javaInfo.myCollectionExample.setExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class BasicSetOperations {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        hashSet.add("Marina");
        hashSet.add("Toma");
        hashSet.add("luka");
        hashSet.add("Riu");
        hashSet.add(null);
        System.out.println(hashSet);
        System.out.println();

        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);

        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);

        Set<Integer> addAllFromOtherSet = new HashSet<>(linkedHashSet);
        addAllFromOtherSet.addAll(treeSet);
        System.out.println(addAllFromOtherSet);

        Set<Integer> removeElementsThatAreInOtherSet = new HashSet<>(linkedHashSet);
        removeElementsThatAreInOtherSet.removeAll(treeSet);
        System.out.println(removeElementsThatAreInOtherSet);

        Set<Integer> allThatAreInBoth = new HashSet<>(linkedHashSet);
        allThatAreInBoth.retainAll(treeSet);
        System.out.println(allThatAreInBoth);

    }
}
