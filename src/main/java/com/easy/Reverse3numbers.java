package com.easy;

/**
 * @ClassName easy01
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 8/3/2019 3:16 PM
 **/
public class Reverse3numbers {

    /**
     * 问题：
     * 反转一个只有3位数的整数。
     * 你可以假设输入一定是一个只有三位数的整数，这个整数大于等于100，小于1000。
     * 样例 1:
     * <p>
     * 输入: number = 123
     * 输出: 321
     * 样例 2:
     * <p>
     * 输入: number = 900
     * 输出: 9
     * <p>
     * 结题思路：
     * 1 判断参数大小（小于0，大于1000不做处理）
     * 2 取个十百三个位置上的数字
     *      通过取/100取百位上的数
     *      通过%100/10取十位上的数字(%100为了去掉百位数字，保留十位和个位)
     *      通过%10取个位上的数字
     * 3 百位!=0，输出，其他情况不输出
     * 4 十位!=0 or 百位!= and 个位！=0，输出（处理101的这种情况）
     * 5 个位!=0，输出，其他情况不输出
     *
     * @param num
     */
    private static void Reverse3numbers(int num) {

        if (num > 0 && num < 1000) {
            int firstResult = num / 100;
            int secondResult = num % 100 / 10;
            int lastResult = num % 10;

            System.out.println("输入的数字：" + num);
            System.out.println("第一个数字：" + firstResult);
            System.out.println("第二个数字：" + secondResult);
            System.out.println("第三个数字：" + lastResult);

            String result = "";
            if (lastResult != 0) {
                result += lastResult;
            }
            if (secondResult != 0 || lastResult != 0 && firstResult != 0) {
                result += secondResult;
            }
            if (firstResult != 0) {
                result += firstResult;
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Reverse3numbers(123);
    }
}
