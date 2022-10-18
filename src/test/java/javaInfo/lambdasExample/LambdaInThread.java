package javaInfo.lambdasExample;

public class LambdaInThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("First Thread"));
        thread1.start();

        Thread thread2 = new Thread(() -> {
            for (int x = 0; x < 5; x++) {
                System.out.println("Second Thread");
            }
        });
        thread2.start();

        System.out.println("Main Thread");
    }
}
