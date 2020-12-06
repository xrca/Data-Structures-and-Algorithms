package com.xrca.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xrca
 * @description 数组 ---> ArrayList
 * @date 2020/11/6 22:31
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        // 创建数组
        int[] intArr = new int[3];
        int[] intArr2 = new int[]{4, 6, 3, 8, 9};

        // 访问,下标从0开始
        System.out.println(intArr2[2]);

        //更新
        intArr2[0] = 10;

        // 集合，底层实现为数组
        List<Integer> intList = new ArrayList<>(3);

        // 插入
        intList.set(2, 10);

        // 删除
        intList.remove(1);
    }
}
