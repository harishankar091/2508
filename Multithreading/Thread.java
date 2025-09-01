package Multithreading;


class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    
}

public class Thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
         t1.start();
    }
}