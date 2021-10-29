package com.sun.leetcode;

import java.util.Arrays;

/**
 * author sungw
 *
 * @description 动态规划问题
 * @date 2021/6/11
 *
 * 零钱兑换 II
 *
 * 给你一个整数数组 coins 表示不同面额的硬币，另给一个整数 amount 表示总金额。
 *
 * 请你计算并返回可以凑成总金额的硬币组合数。如果任何硬币组合都无法凑出总金额，返回 0 。
 *
 * 假设每一种面额的硬币有无限个。
 *
 * 题目数据保证结果符合 32 位带符号整数。
 *
 */
public class M18 {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins ={1,2,5};
        change(amount,coins);
    }

    static int[] db ;
    public static int change(int amount, int[] coins) {

        //定义字典数组
          db = new int[amount+1];
        int result = dy(amount,coins);

        return result;
    }

    public static int dy(int amount, int[] coins){
        if(amount == 0){
            return 1;
        }
        if(amount < 0){
            return -1;
        }
        if(db[amount] !=0){
            return db[amount];
        }
        int res = 0;
        for(int a : coins){
            int sub = dy(amount-a,coins);
            if(sub==-1)
                continue;
            res +=sub;
        }
        db[amount] = res;
        return db[amount];

    }
}
