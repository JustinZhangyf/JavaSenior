package com.atguigu.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 1/10/2021-12:43 PM
 */
public class DateTimeTest {
    @Test
    public void testSimpleDateFormat() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();


        //格式化  日期---->字符串
        Date date = new Date();
        System.out.println(date);

        String formatDate = sdf.format(date);

        System.out.println(formatDate);


        //解析  格式化逆过程  字符串--->日期
        String str = "1/10/20, 12:50 PM";
        Date date1 = sdf.parse(str);

        System.out.println(date1);


        //***********按照指定的方式格式化&解析：调用带参构造器************

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);

        String str2 = "2020-11-11 11:11:11";
        Date date2 = sdf1.parse(str2);
        System.out.println(date2);

    }

    @Test
    /*
     把”2020-09-08“类型 转化为java.sql.data类型
     */
    public void testExerSimpleDateFormat() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String str = "2020-09-08";
        System.out.println(str.getClass());
        Date utilDate = dateFormat.parse(str);
        System.out.println(utilDate);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println(sqlDate);
        System.out.println(sqlDate.getClass());
    }


    /*
    "三天打鱼两天晒网，1990-01-01开始，  xxxx-xx-xx 打鱼？晒网？
     */
    @Test
    public void testExerSimpleDateFormate2() throws ParseException {
        String startDate = "1990-01-01";
        String endDate = "2020-01-05";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        long intervalTime = dateFormat.parse(endDate).getTime() - dateFormat.parse(startDate).getTime();
        int day = (int) (intervalTime / (1000 * 60 * 60 * 24) + 1);

        int result = day % 5;
        switch(result){
            case 1:
            case 2:
            case 3:
                System.out.println("打鱼");
                break;
            case 0:
            case 4:
                System.out.println("晒网");
                break;
        }

    }


    @Test
    public void testCalendar(){
        Calendar calendar = Calendar.getInstance();

        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        calendar.set(Calendar.DAY_OF_MONTH,22);
//        calendar.set(Calendar.MONTH,2);
        days = calendar.get((Calendar.DAY_OF_MONTH));
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        calendar.add(Calendar.DAY_OF_MONTH,3);
        days = calendar.get((Calendar.DAY_OF_MONTH));
        System.out.println(days);

        Date date = calendar.getTime();
        System.out.println(date);

        calendar.setTime(new Date());

        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }


}
