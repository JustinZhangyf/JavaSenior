package com.atguigu.test;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2021-01-1/2/2021-9:20 PM
 */

import org.junit.Test;

/**
 * 1.模拟一个trim方法，去除字符串两端的空格。
 * <p>
 * 2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
 * <p>
 * 3.获取一个字符串在另一个字符串中出现的次数。
 * 比如：获取“ab”在 “cdabkkcadkabkebfkabkskab”中出现的次数
 * <p>
 * 4.获取两个字符串中最大相同子串。比如：
 * str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"//10
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 * <p>
 * 5.对字符串中字符进行自然顺序排序。"abcwerthelloyuiodef"
 * 提示：
 * 1）字符串变成字符数组。
 * 2）对数组排序，选择，冒泡，Arrays.sort(str.toCharArray());
 * 3）将排序后的数组变成字符串。
 */
public class StringExer {

    //1.模拟一个trim方法，去除字符串两端的空格。
    @Test
    public void trimTest() {
        String str = "   1 23sdf   ";
        System.out.println(trimTest(str));
    }

    public String trimTest(String str) {
        if (str != " ") {
            int start = 0;
            int end = str.length() - 1;

            while (start < end && str.charAt(start) == ' ') {
                start++;
            }
            while (start < end && str.charAt(end) == ' ') {
                end--;
            }
            if (str.charAt(start) == ' ') {
                return " ";
            }
            return str.substring(start, end + 1);
        }
        return null;
    }

    //2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
    @Test
    public void reverseTest() {
        String str = "abcdef";
        System.out.println(reverse(str, 1, 4).toString());
    }


    public String reverse(String str, int beginIndex, int endIndex) {
        if (str != " ") {

            char[] chars = str.toCharArray();
            if (beginIndex >= endIndex || beginIndex < 0 || endIndex > str.length()) {
                return str;
            }
            for (int i = beginIndex, j = endIndex; i < j; i++, j--) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            return new String(chars);
        }
        return null;
    }

    //3.获取一个字符串在另一个字符串中出现的次数。
    //比如：获取“ab”在 “cdabkkcadkabkebfkabkskab”中出现的次数
    @Test
    public void countTest(){

    }



    //4.获取两个字符串中最大相同子串。比如：
    //str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"//10
    //提示：将短的那个串进行长度依次递减的子串与较长的串比较。
    @Test
    public void test4(){

    }


    //5.对字符串中字符进行自然顺序排序。"abcwerthelloyuiodef"
    //   提示：
    //     1）字符串变成字符数组。
    //     2）对数组排序，选择，冒泡，Arrays.sort(str.toCharArray());
    //     3）将排序后的数组变成字符串。

}
