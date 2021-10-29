package com.sun.sort;

/**
 * author sungw
 *
 * @description 二分查找
 * @date 2021/5/15
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,3,4,5,7,9,10,11};
        int target = 7;
        int a =  binarySearch(nums,target);
        System.out.println(a);
    }


    //二分查找
    public static int  binarySearch(int[] nums,int target){
        int left = 0;
        int right = nums.length;
        while(left<=right){
            int mid = (right+left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target>nums[mid]){
                left = mid+1;

            }
            if(target<nums[mid]){
                right = mid-1;
            }
        }
        return -1;
    }
}
