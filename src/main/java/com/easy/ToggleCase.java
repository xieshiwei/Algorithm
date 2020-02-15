package com.easy;

/**
 * @ClassName easy02
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 8/4/2019 12:13 AM
 **/
public class ToggleCase {

    /**
     * 问题：
     * 将一个字符由小写字母转换为大写字母
     * 你可以假设输入一定在小写字母 a ~ z 之间
     * <p>
     * 样例 1:
     * <p>
     * 输入: 'a'
     * 输出: 'A'
     * 样例 2:
     * <p>
     * 输入: 'b'
     * 输出: 'B'
     * <p>
     * 思路：
     * 1 判断传入字符串不允许为空
     * 2 字符串转换成char数组
     * 3 循环数组判断元素大小写
     * 4 小写ASCII-32（ASCII 97~122）
     * 5 大写ASCII+32（ASCII 65~90）
     * 6 将转换好的char数组作为参数创建个String对象输出
     *
     * 注意：
     * 如果要修改char数组的值，必须要用for循环，不能使用foreach
     * 在用foreach循环遍历一个集合时，不能改变集合中的元素
     *
     * @param word
     */
    public static String toggleCase(String words) {
        if (!"".equals(words)) {
            char[] chars = words.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] > 'a' - 1 && chars[i] < 'z' + 1) {
                    chars[i] -= 32;
                } else if (chars[i] > 'A' - 1 && chars[i] < 'Z' + 1) {
                    chars[i] += 32;
                }
            }
            return new String(chars);
        } else {
            return words;
        }
    }

    public static void main(String[] args) {
        System.out.println('a' + 0);
        System.out.println('z' + 0);
        System.out.println('A' + 0);
        System.out.println('Z' + 0);
        System.out.println(toggleCase("ABCDEFG,abcdefg"));
    }
}
