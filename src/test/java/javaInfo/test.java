package javaInfo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String temp = "";
        char[] chars = A.toCharArray();
        for (int x = chars.length-1; x >= 0 ; x--) {
            temp += chars[x];
        }

        if (A.equals(temp)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
