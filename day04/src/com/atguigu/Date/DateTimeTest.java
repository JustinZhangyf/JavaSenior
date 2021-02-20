package com.atguigu.Date;

import org.junit.Test;

import java.util.Date;

public class DateTimeTest {

    //1. System类中的currentTimeMillis()
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    }


    @Test
    public void test2(){
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());

        Date date2 = new Date(16138309747L);
        System.out.println(date2.toString());
        System.out.println(date2.getTime());

        java.sql.Date date3 = new java.sql.Date(1423423423423L);
        System.out.println(date3);
        Date date4 = date3;
        java.sql.Date date5 = new java.sql.Date(date2.getTime());
        System.out.println(date5);

    }
}
