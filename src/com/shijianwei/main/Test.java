package com.shijianwei.main;

import com.shijianwei.main.learn.DesignPattern.FactoryPattern.CourseFactory;

import java.util.*;

/*
 * 想实现LRU，put和get都是o1
 *   可以使用多种数据结构叠加的方式
 *   各取优点
 *       puto1可以使用hashmap来实现，但是此时getLRU不是o1
 *       getlRUo1可以使用双向链表实现，记录每次的最近查询
 * */
class Test {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int count = 0 ;
    int res = 0 ;


    public int kthLargest(TreeNode root, int k) {
        count = k;
        InOrder(root);
        return res ;
    }


    public void InOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        InOrder(root.right);
        if (--count > 0){
            res = root.val;
        }
        InOrder(root.left);
    }





}
