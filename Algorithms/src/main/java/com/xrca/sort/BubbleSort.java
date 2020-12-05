package com.xrca.sort;

/**
 * @author xrca
 * @description 冒泡排序
 * @date 2020-05-02 11:20
 **/
public class BubbleSort {
    public static void main(String[] args) {
        // 获取随机数组
        int[] arr = SortUtil.getRandomArray();
        int[] mySortedArr = new int[arr.length];
        // 拷贝数组
        System.arraycopy(arr, 0, mySortedArr, 0, arr.length);
        // 排序
        bestBubbleSort(mySortedArr);
        // 校验排序是否正确
        System.out.println(SortUtil.checkSort(arr, mySortedArr));
    }

    /**
     * 冒泡排序
     * @param array
     */
    public static void sort(int[] array) {
        // 每一次冒泡后，尾部的排序完成数量就会加1
        for (int i = 0; i < array.length - 1; i++) {
            // 只需循环到未排序(length - i)的尾部的前一个
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    SortUtil.swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * 冒泡排序(最优情况)
     * @param array
     */
    public static void bestBubbleSort(int[] array) {
        boolean swap;
        // 每一次冒泡后，尾部的排序完成数量就会加1
        for (int i = 0; i < array.length - 1; i++) {
            // 只需循环到未排序(length - i)的尾部的前一个
            swap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    SortUtil.swap(array, j, j + 1);
                    swap = true;
                }
            }
            // 若未进行swap，则表示已排好序，直接return
            if (!swap) {
                return;
            }
        }
    }
}