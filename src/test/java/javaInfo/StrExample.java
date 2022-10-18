package javaInfo;

import java.util.ArrayList;

public class StrExample {
    public static void main(String[] args) {
        //create String
        String s1 = "Autumn";
        String s2 = new String("Autumn");

        char[] symbols = {'A', 'u', 't', 'u', 'm', 'n'};
        String s3 = new String(symbols);
        System.out.println("_________________________________________________________________");

        //mutable strings
        StringBuffer name = new StringBuffer("Marina");
        name.append( " FamilyName");
        System.out.println(name);

        System.out.println(name.insert(17, " hello")); //вставить на какой индекс и что
        System.out.println(name.replace(3,4, "y"));
        System.out.println(name.substring(3) + " ----- substring с какого индекса не вкл обрезать слово");

        String sentence = "On the moon";
        String[] words = sentence.split(" ");
        for (String s: words) {
            System.out.println(s);
        }

        //String class immutable, to concatenate we need to save result in a new string
        System.out.println("-----------------------------------------------");
        String name2 = "Marina";
        String fullName = name2.concat( " Familyname");
        System.out.println(name2);
        System.out.println(fullName);
        System.out.println(fullName.substring(2, 8)); //с какого вкл,  по какой не вкл обрезать слово

        String text = "On the far moon ";
        System.out.println(text.trim());
        System.out.println("--------------------------------------------------");

        String test = "Autumn";
        String testSmall = "autumn";
        StringBuffer buffer = new StringBuffer("Autumn");
        System.out.println(test.charAt(3));//get symbol with index 3
        System.out.println(testSmall.indexOf('t'));
        System.out.println(test.intern());



        String text1 = "Message";
        String text2 = text1 + ": ";
        // text2 is "Message: "
        String text3 = text1 + 12;
        System.out.println(text3);

StringBuffer b = new StringBuffer(text1);
        System.out.println(b.reverse());






    }
}
