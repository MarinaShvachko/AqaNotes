package javaInfo.lambdasExample;

import java.util.*;

public class LambdaExamples {
    public static void main(String[] args) {

        //MAP EXAMPLE --------------------------------------------------------------------------------------------------
        int[] arr = new int[10];
        fillArr(arr);
        System.out.println(Arrays.toString(arr) + " изначальная array");

        arr = Arrays.stream(arr).map(r -> r * 2).toArray(); //for Array we should call through Arrays.stream
        System.out.println(Arrays.toString(arr) + " array после стрима, все умножено на 2");


        List<Integer> list = new LinkedList<>();
        fillArr(list);
        System.out.println(list + " просто лист");

        list = list.stream().map(number -> number + 10).toList();
        System.out.println(list + " лист после лямбды");
        //list.stream().map(number -> number * 3).forEach(System.out::print);

        //FILTER EXAMPLE -----------------------------------------------------------------------------------------------
        int[] arrayFilter = new int[10];
        List<Integer> listFilter = new ArrayList<>();

        fillArr(arrayFilter);
        fillArr(listFilter);

        arrayFilter = Arrays.stream(arrayFilter).filter(a -> a % 2 == 0).toArray();
        listFilter = listFilter.stream().filter(a -> a % 2 == 0).toList();

        //FOR EACH print result ----------------------------------------------------------------------------------------
        Arrays.stream(arrayFilter).forEach(System.out::println);
        System.out.println("  ------   ");
        listFilter.stream().forEach(System.out::println);

        //REDUCE - take elements and return one ------------------------------------------------------------------------
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillArr(list3);

        int sum1 = Arrays.stream(arr3).reduce((acc, a) -> acc + a).getAsInt();

        int sum2 = list3.stream().reduce(Integer::sum).get();

        //if acc should not be null
        int sum3 = Arrays.stream(arr3).reduce(100, Integer::sum);

        System.out.println("first summ = " + sum1 + ", second summ = " + sum3);

        //COMBINE METHODS ----------------------------------------------------------------------------------------------
        List<Integer> list4 = new ArrayList<>();
        fillArr(list4);

        //filter add values and multiply each on 2
        list4 = list4.stream().filter(a -> a% 2 != 0).map(a -> a * 2).toList();
        System.out.println(list4);

        //FILTER AND CONVERT INT TO STRING
        List<Integer> list5 = new ArrayList<>();
        fillArr(list5);

        List<String> intToString = list5
                .stream()
                .filter(n -> n != 2)
                .map(Objects::toString)
                .toList();

        System.out.println(intToString + " converted int");


    }


    public static void fillArr(List list) {
        for (int x = 0; x < 10; x++) {
            list.add(x);
        }
    }

    public static void fillArr(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            arr[x] = x;
        }
    }
}
