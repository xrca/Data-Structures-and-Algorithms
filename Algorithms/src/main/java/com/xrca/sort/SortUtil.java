package com.xrca.sort;

import java.util.Arrays;
import java.util.Random;

public class SortUtil {
    /**
     * 获取int类型的随机数组
     * @return
     */
    public static int[] getRandomArray() {
        int[] array = new int[1000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2000);
        }
        return array;
    }

    /**
     * 检查排序是否正确
     * @param srcArray 原数组
     * @param mySortedArr 自己排序后的数组
     * @return
     */
    public static boolean checkSort(int[] srcArray, int[] mySortedArr) {
        Arrays.sort(srcArray);
        for (int i = 0; i < srcArray.length; i++) {
            if (srcArray[i] != mySortedArr[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 打印数组
     * @param arrayy
     */
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    /**
     * 交换数组的元素位置
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void insert(int[] array, int srcPos, int targetPos) {
        int temp = array[srcPos];
        for (int i = srcPos; i > targetPos; i--) {
            array[i] = array[i - 1];
        }
        array[targetPos] = temp;
    }
    
}