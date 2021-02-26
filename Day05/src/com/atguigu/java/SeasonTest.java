package com.atguigu.java;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2/26/2021-3:06 PM
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        System.out.println(autumn);

        System.out.println("*************");
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }
        System.out.println("******************");

        //valueOf(String objName) 返回枚举类中对象名是objName的对象
        //如果没有objName的枚举类对象，则抛异常：IllegalArgumentException
        Season1 autumn1 = Season1.valueOf("AUTUMN");
        System.out.println(autumn1);
    }
}

class Season{
    //1.声明Season对象的属性，private final修饰
    private final String seasonName;
    private final String seasonDesc;
    //2.私有化构造器，并给对象属性赋值
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3.提供当前枚举类的多个对象，public static final修饰
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","冰天雪地");
    //其他诉求：获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}