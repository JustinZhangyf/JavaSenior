package com.atguigu.java2;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2021-01-1/2/2021-4:34 PM
 */
public class StringTest {

    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't' };

    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);

        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }

}
