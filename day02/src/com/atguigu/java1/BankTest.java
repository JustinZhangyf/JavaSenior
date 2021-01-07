package com.atguigu.java1;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2020-12-12/26/2020-11:18 AM
 * 使用同步机制加单例模式懒汉式改写为线程安全
 */
public class BankTest {
}

class Bank {
    private Bank() {

    }

    private static Bank instance = null;

    public static Bank getInstance() {
        //效率稍差
//        synchronized (Bank.class) {
//            if (instance == null) {
//                instance = new Bank();
//            }
//            return instance;
//        }
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
