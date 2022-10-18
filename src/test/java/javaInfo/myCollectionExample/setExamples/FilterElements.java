package javaInfo.myCollectionExample.setExamples;

import java.util.HashSet;
import java.util.Set;

public class FilterElements {
    public static void main(String[] args) {

        Set<String> result = new HashSet<>();
        Set<String> a = new HashSet<>(Set.of("Java", "SortedSet", "Map", "Collections", "Iterable", "Set", "NavigableSet"));
        Set<String> b = new HashSet<>(Set.of("Queue", "List", "Iterator", "Comparator", "Collections"));
        Set<String> c = new HashSet<>(Set.of("TreeSet", "HashSet", "LinkedHashSet", "Collections", "Iterable"));

        Set<String> tempA = a;

        a.retainAll(b);
        a.removeAll(c);

        c.removeAll(a);
        c.removeAll(b);

        for (String s : a) {
            result.add(s);
        }
        for (String s : c) {
            result.add(s);
        }
        System.out.println(result);
    }
}
