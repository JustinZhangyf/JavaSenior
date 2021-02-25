package com.atguigu.Date;

import org.junit.Test;

import java.util.Date;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2/25/2021-3:14 PM
 */
public class JDK8DateTimeTest {

    @Test
    public void testDate(){
        //偏移量
        Date date1 = new Date(2020 - 1900,9 - 1,8);
        System.out.println(date1);//Tue Sep 08 00:00:00 GMT+08:00 2020
    }
}
