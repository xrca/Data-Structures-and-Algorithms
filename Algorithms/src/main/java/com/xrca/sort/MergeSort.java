package com.xrca.sort;

/**
 * @author xrca
 * @description 归并排序
 * @date 2020-05-02 14:54
 **/
public class MergeSort {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    public static long f(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n + f(n);
    }
}