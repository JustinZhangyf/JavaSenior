package com.atguigu.exer;

import org.junit.Test;

/**
 * @author Justin.Zhang
 * @Description
 * @date Created in 2021-01-1/9/2021-2:30 PM
 */

public class StringDemo2 {
    /**
     * 4.获取两个字符串中最大相同子串。比如：
     * str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"//10
     * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
     */
    //前提：只有一个最大相同子串
    public String getMaxSameString(String str1, String str2) {
        if (str1 != null && str2 != null) {

            String maxStr = str1.length() >= str2.length() ? str1 : str2;
            String minStr = str1.length() < str2.length() ? str1 : str2;
            int length = minStr.length();

            for (int i = 0; i < length; i++) {
                for (int x = 0, y = length - i; y <= length; x++, y++) {
                    String substr = minStr.substring(x, y);//左闭右开区间，只能取到y-1
                    if (maxStr.contains(substr)) {
                        return substr;
                    }
                }
            }
        }
        return null;
    }
    // 如果存在多个长度相同的最大相同子串
    // 此时先返回String[]，后面可以用集合中的ArrayList替换，较方便
    public String[] getMaxSameString1(String str1, String str2) {
        if (str1 != null && str2 != null) {
            StringBuffer sBuffer = new StringBuffer();
            String maxString = (str1.length() > str2.length()) ? str1 : str2;
            String minString = (str1.length() > str2.length()) ? str2 : str1;

            int len = minString.length();
            for (int i = 0; i < len; i++) {
                for (int x = 0, y = len - i; y <= len; x++, y++) {
                    String subString = minString.substring(x, y);
                    if (maxString.contains(subString)) {
                        sBuffer.append(subString + ",");
                    }
                }
//                System.out.println(sBuffer);
                //当前如果已经找到最大的了，则不需要继续寻找
                if (sBuffer.length() != 0) {
                    break;
                }
            }
            String[] split = sBuffer.toString().replaceAll(",$", "").split("\\,");
            return split;
        }

        return null;
    }

    @Test
    public void getMaxStringTest() {
        String str1 = "abcwerthello1yuiodef";
        String str2 = "cvhello1bnm";

        String maxSameString = getMaxSameString(str1, str2);
        System.out.println(maxSameString);
    }
}
