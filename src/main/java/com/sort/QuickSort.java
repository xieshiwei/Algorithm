package com.sort;

import java.util.Arrays;

/**
 * @ClassName QuickSort
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 8/27/2019 8:14 PM
 **/
public class QuickSort {


    /**
     * 快速排序,说白了就是给基准数据找其正确索引位置的过程.
     * 首先在数组中选择一个基准点
     * 然后分别从数组的两端扫描数组，设两个指示标志（low指向起始位置，high指向末尾)
     * 首先从后半部分开始，如果发现有元素比该基准点的值小，就交换low和high位置的值
     * 然后从前半部分开始扫秒，发现有元素大于基准点的值，就交换low和high位置的值
     * 如此往复循环，直到low>=high,然后把基准点的值放到high这个位置。
     * 一次排序就完成了。以后采用递归的方式分别对前半部分和后半部分排序
     * 当前半部分和后半部分均有序时该数组就自然有序了。
     * 平均情况：O(nlog2n)
     * 最坏情况：O（n^2)
     * 平均情况：O(nlog2n)
     * 空间复杂度：O(log2n)
     * 稳定性：不稳定
     * 复杂性：较复杂
     * <p>
     * <p>
     * <p>
     * <p>
     * getIndex:
     * 1.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
        System.out.println("排序之前的数组为...............");
        System.out.println(Arrays.toString(nums));
        System.out.println("排序之后的数组为...............");
        //使用选择排序算法进行排序：
        QuickSort sort = new QuickSort();
        sort.quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 快排
     * 容易写错的地方：
     * 1.先判断low小于high
     * 2.index-1不能写错index--
     *
     * @param arr
     * @param low
     * @param high
     */
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = getIndex(arr, low, high);
            //对左子序列进行排序
            quickSort(arr, low, index - 1);
            //对右子序列进行排序
            quickSort(arr, index + 1, high);
        }
    }

    /**
     * 获取基准数下标
     * 容易写错的地方：
     * 1.最大值循环的时候，循环完后要把high的值赋值给low的位置
     * 2.最小值循环的时候，循环完后要把low的值赋值给high的位置
     * 3.两个while中的大小判断不要写错
     * 4.从大到小扫描结束后要写arr[low]=arr[high]，容易些反
     *
     * @param nums
     * @param low
     * @param high
     * @return
     */
    private int getIndex(int[] nums, int low, int high) {
        //当前数组的第一个元素作为中轴（基准）
        int temp = nums[low];
        while (low < high) {
            //这里temp <= nums[high]中等号的情况相当于数组中出现了两个相等的数字，循环比较依然能够继续
            while (low < high && temp <= nums[high]) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && temp >= nums[low]) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }

}
