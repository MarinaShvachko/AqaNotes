package javaInfo.multiThreadingExample.createThreade;

public class SimpleExampleClassExtendsThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();

        //main thread
        for (int x = 0; x < 1000; x++) {
            System.out.println("This is from main thread");
        }
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int x = 0; x < 1000; x++) {
            System.out.println("This is from my thread");
        }
    }
}

//one more way to create a thread
//class MyThread extends Thread {
//    public void run() {
//        for (int x = 0; x < 1000; x++) {
//            System.out.println("This is from my thread");
//        }
//    }
//}
