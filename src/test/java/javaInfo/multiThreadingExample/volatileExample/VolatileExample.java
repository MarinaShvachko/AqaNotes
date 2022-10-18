package javaInfo.multiThreadingExample.volatileExample;

import java.util.Scanner;

public class VolatileExample {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        //to read command from a keyboard
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.stopThread();

    }
}

class MyThread extends Thread {
    private volatile boolean running = true;
    int x = 0;

    @Override
    public void run() {
        while (running) {
            System.out.println(x++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread() {
        this.running = false;
    }
}