package javaInfo.lambdasExample;

import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdasWithMap {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put("978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");
        books.put("978-0321356680", "Effective Java: Second Edition");

        Optional<String> optional = books.entrySet().stream() //we obtain the entrySet from the Map
                .filter(e -> "Effective Java".equals(e.getValue())) //filter to find what we want
                .map(Map.Entry::getKey) //a map operation that will generate a new stream as output, which will contain only the keys for the entries that matched the title we were looking for.
                .findFirst(); //as we want only one result

        Assert.assertEquals(optional.get(), "978-0134685991");
        System.out.println(optional.get());

        //Retrieving Multiple Results
        List<String> results = books.entrySet().stream()
                .filter(e -> e.getValue().startsWith("Effective Java"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(results);
    }
}
