package javaInfo.lambdasExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambda {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Blalala");
        words.add("Hello");
        words.add("Cucumber");
        words.add("k");

        //without lambda
//        words.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) {
//                    return 1;
//                } else if (o1.length() < o2.length()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });

        //with lambda
        words.sort((o1, o2) -> {
            if (o1.length() > o2.length()) return 1; //ascending order, keep on place
            else if (o1.length() < o2.length()) return -1;
            else return 0;
        });
        System.out.println(words);

        //---------------------------------------------------------------
        //can save lambda in variable
//        Comparator<String> comp = (o1, o2) -> {
//            if (o1.length() > o2.length()) return 1;
//            else if (o1.length() < o2.length()) return -1;
//            else return 0;
//        };
//        words.sort(comp);
//        System.out.println(words);

    }
}
