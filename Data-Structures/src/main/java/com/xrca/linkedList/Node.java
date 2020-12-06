package com.xrca.linkedList;

import lombok.Data;

/**
 * @author xrca
 * @description 节点
 * @date 2020/11/6 22:31
 **/
@Data
public class Node {
    // 前节点,仅在双向链表中使用
    Node pre;

    // 数据
    int data;

    // 下一个节点
    Node next;
}
