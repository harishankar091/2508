package Multithreading;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable is running");
    }
}

public class Runable{
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        MyThread t1 = new MyThread();
        t1.start();
    }
}