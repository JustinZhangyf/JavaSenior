package com.atguigu.java;

/**
 * 使用enmu关键字定义枚举类
 * 说明：定义枚举类默认继承java.lang.Enum类
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);

        System.out.println(Season1.class.getSuperclass());
    }
}


//使用enum关键字定义枚举类
enum Season1{

    //1.提供当前枚举类的多个对象，多个对象之间用,隔开 末尾的对象;结束
    SPRING ("春天","春暖花开"),
    SUMMER ("夏天","夏日炎炎"),
    AUTUMN ("秋天","秋高气爽"),
    WINTER ("冬天","冰天雪地");
    //1.声明Season对象的属性，private final修饰
    private final String seasonName;
    private final String seasonDesc;
    //2.私有化构造器，并给对象属性赋值
    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //其他诉求：获取枚举类对象的属性

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @java.lang.Override
//    public java.lang.String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}