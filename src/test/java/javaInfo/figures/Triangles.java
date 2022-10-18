package javaInfo.figures;

public class Triangles {
    public static void main(String[] args) {
        for (int y = 1; y <= 5; y++) {
            for (int x = 0; x < y; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------");

        for (int y = 1; y <= 5; y++) {
            for (int x = 5; x >= y; x--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_____________________________________________");

        for (int y = 1; y <= 5; y++) {
            for (int x = 5; x > y; x--) {
                System.out.print(" ");
            }
            for (int c = 0; c < y; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_____________________________________________");


        for (int y = 1; y <= 5; y++) {
            for (int c = 1; c < y; c++) {
                System.out.print(" ");
            }
            for (int x = 5; x >= y; x--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_____________________________________________");

        for (int y = 1; y <= 5; y++) {
            for (int x = 5; x > y; x--) {
                System.out.print(" ");
            }
            for (int c = 0; c < y; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("______________________________________________________");

        for (int y = 1; y <= 5; y++) {
            for (int c = 1; c < y; c++) {
                System.out.print(" ");
            }
            for (int x = 5; x >= y; x--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
