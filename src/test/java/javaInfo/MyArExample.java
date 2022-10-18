package javaInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyArExample {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[4] = 4;
        int[] numbers = new int[]{88, 11, 25, 66, 33, 33, 9};
        int[] numbersWithInitialization = {2, 6, 1, 9, 7, 3};

        for (int x = 0; x < num.length; x++) {
            System.out.print(num[x] + " ");
        }

        //copy from what, from what index, to where, to where index, number of copied elements
        System.arraycopy(numbers, 1, num, 2, 2); //11,25 will be copied
        System.out.print("\nArray after copy: ");
        for (int x = 0; x < num.length; x++) {
            System.out.print(num[x] + " ");
        }

        //Multidimensional Arrays
        int [][] multyArr = new int[2][5]; //creates a two-dimensional array definition with "2" rows and "5" columns

        //ragged arrays
        int[][] raggedArr = new int[3][]; // creates a two-dimensional "ragged" array with 3 rows
        raggedArr[0] = new int[3];        // initializes the first row with 3 columns
        raggedArr[1] = new int[2];        // initializes the second row with 2 columns
        raggedArr[2] = new int[1];        // initializes the third row with 1 columns

        //List to array
        List<String> languages = new ArrayList<>();
        languages.add("French");
        languages.add("Russia");
        languages.add("English");

        String[] arrayLangeages = new String[languages.size()];
        languages.toArray(arrayLangeages);
        System.out.print("\nList to array: ");
        for (String language : arrayLangeages) {
            System.out.print(language + ", ");
        }

        //array to list
        System.out.print("\nэто array to list: ");
        List<String> arrayToList = new ArrayList<>(Arrays.asList(arrayLangeages));
        for (String language : arrayToList) {
            System.out.print(language + " ");
        }


    }
}
