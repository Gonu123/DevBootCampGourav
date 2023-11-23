package com.java.threads;

public class ThreadTest implements Runnable {

    public static void main (String str[])
    {

        ThreadTest threadTest=new ThreadTest();
        Thread t1=new Thread(threadTest);
        t1.start();
    }

    @Override
    public void run() {

        System.out.println("Inside ThreadTest run()");
    }
}
