package com.atguigu.java;

/**
 * @author Justin.Zhang
 * @Description 创建三个卖票窗口卖票，总票数为100张，使用实现runnable接口方式实现
 * @date Created in 2020-12-12/25/2020-4:53 PM
 * ThreadSync
 */
class Window1 implements Runnable {
    private int ticket = 100;
    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window1 window = new Window1();
        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
