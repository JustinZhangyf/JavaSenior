package com.atguigu.Date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeFormatTest {


    @Test
    public void TestSimpleDateFormat() throws ParseException {
        //实例化
        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);

        String str = "2020/2/20 下午11:14";
        Date date1 = sdf.parse(str);
        System.out.println(date1);


//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MMMM.dd GGG hh:mm aaa");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = dateFormat.format(new Date());
        System.out.println(format1);

        String str2 = "2020-02-20 11:25:45";
        Date date2 = dateFormat.parse(str2);
        System.out.println(date2);
    }


    @Test
    public void TestDateTransfer() throws ParseException {
        String str = "2020-09-08";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(str);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(sqlDate);
    }


    /**
     * Calendar 日历类，抽象类
     */
    @Test
    public void testCalendar(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());  //GregorianCalendar

        //常用方法
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));


        calendar.set(Calendar.DAY_OF_MONTH,20);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

    }
}
