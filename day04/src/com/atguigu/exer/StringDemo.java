package com.atguigu.exer;


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
public class StringDemo {
    // 2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”


    //方法1
    public String reverse(String str, int startIndex, int endIndex) {
        if (str != null) {
            char[] arr = str.toCharArray();
            for (int i = startIndex, j = endIndex; i < j; i++, j--) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    //方法2
    public String reverse2(String str, int startIndex, int endIndex) {
        if (str != null) {

            String reverStr = str.substring(0, startIndex);

            for (int i = endIndex; i >= startIndex; i--) {
                reverStr += str.charAt(i);
            }

            reverStr += str.substring(endIndex + 1);
            return reverStr;
        }
        return null;
    }
    //方法三
    public String reverse3(String str, int startIndex, int endIndex) {
        if (str != null) {
            //第一部分
            StringBuilder builderStr = new StringBuilder(str.length());
            builderStr.append(str.substring(0, startIndex));
            //第二部分
            for (int i = endIndex; i >= startIndex; i--) {
                builderStr.append(str.charAt(i));
            }
            //第三部分
            builderStr.append(str.substring(endIndex + 1));
            return builderStr.toString();
        }
        return null;
    }


    @Test
    public void testReverse() {
        String str = "ab123456qwd";
        System.out.println(str);
        String reverseStr = reverse3(str, 2, 6);
        System.out.println(reverseStr);
    }

}
