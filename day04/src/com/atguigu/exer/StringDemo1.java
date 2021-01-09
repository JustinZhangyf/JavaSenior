package com.atguigu.exer;

import org.junit.Test;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2021-01-1/9/2021-1:00 PM
 */
/*
 * 3.获取一个字符串在另一个字符串中出现的次数。
 * 比如：获取“ab”在 “cdabkkcadkabkebfkabkskab”中出现的次数
 */
public class StringDemo1 {
    /**
     * @param mainStr
     * @param subStr
     * @return
     */


    //方法1
    public int getStrCount(String mainStr, String subStr) {

        int mainLength = mainStr.length();
        int subLength = subStr.length();

        int count = 0;
        int index;
        if (mainLength > subLength) {
            while ((index = (mainStr.indexOf(subStr))) != -1) {
                count++;
                mainStr = mainStr.substring(index + subLength);
            }

        }
        return count;
    }
    //方法2
    public int getStrCount2(String mainStr, String subStr) {

        int mainLength = mainStr.length();
        int subLength = subStr.length();

        int count = 0;
        int index = 0;
        if (mainLength > subLength) {
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                count++;
                index += subLength;
            }

        }
        return count;

    }


    @Test
    public void countTest() {
        String mainStr = "cdabkkcadkabkebfkabkskab";
        String subStr = "ab";

        int strCount = getStrCount2(mainStr, subStr);
        System.out.println(strCount);
    }


}
