package javaInfo.equalsAndHashCode;

import java.util.Hashtable;

public class HashCodeStrings {
    public static void main(String[] args) {
        String s1 = new String("Marina");
        String s2 = new String("Marina");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1==s2);

        Hashtable<Integer, Integer> dd;
    }
}
