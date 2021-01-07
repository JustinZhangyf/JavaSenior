package com.atguigu.java;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2020-12-12/17/2020-5:02 PM
 * threadTest
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
