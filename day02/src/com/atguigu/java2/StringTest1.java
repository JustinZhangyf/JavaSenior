package com.atguigu.java2;

import org.junit.Test;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2021-01-1/2/2021-4:50 PM
 */
public class StringTest1 {
    @Test
    public void test1() {
        String str1 = "123";
        int num = Integer.parseInt(str1);
        System.out.println(num + 1);

        str1 = String.valueOf(num + 1);
        System.out.println(str1);
    }
}
