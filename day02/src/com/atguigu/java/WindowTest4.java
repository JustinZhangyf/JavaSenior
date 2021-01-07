package com.atguigu.java;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2020-12-12/26/2020-10:54 AM
 * 同步方法解决继承thread安全问题
 */

public class WindowTest4 {
    public static void main(String[] args) {
        Windows4 w1 = new Windows4();
        Windows4 w2 = new Windows4();
        Windows4 w3 = new Windows4();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Windows4 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private static synchronized void show() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票，票号：" + ticket);
            ticket--;
        }
    }
}

