package com.atguigu.java2;

import org.junit.Test;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2021-01-1/2/2021-3:08 PM
 */
public class StringMethodTest {
    @Test
    public void test3(){
        String s1 = "北京尚硅谷教育北京";
        s1 = s1.replace('北','南');
        System.out.println(s1);
    }


    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = "adf";
        System.out.println(s3.compareTo(s4));


        String s5 = "尚硅谷教育";
        String s6 = s5.substring(3);
        String s7 = s5.substring(1,3);
        System.out.println(s6);
        System.out.println(s7);
    }


    @Test
    public void test() {
        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
//        s1 = "";
        System.out.println(s1.isEmpty());
        String s2 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        String s3 = s2.toUpperCase();
        System.out.println(s3);

        String s4 = "   Hel  lo Wor ld   ";
        String s5 = s4.trim();
        System.out.println("-----"+ s4 + "-----");
        System.out.println("-----"+ s5 + "-----");
    }
}

