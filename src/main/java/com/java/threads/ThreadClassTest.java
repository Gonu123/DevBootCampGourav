package com.java.threads;

public class ThreadClassTest extends Thread{

    public void run()
    {
        System.out.println("Inside ThreadClass Run()");
    }

    public static void main(String str[])
    {
        ThreadClassTest threadClassTest=new ThreadClassTest();
        threadClassTest.start();
    }
}
