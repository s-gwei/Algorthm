package com.sun.sort;

/**
 * 插入排序（
 * Insertion-Sort）的算法描述是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从
 * 后向前扫描，找到相应位置并插入。
 * <p>
 * <p>
 * <p>
 * 从第一个元素开始，该元素可以认为已经被排序；
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 将新元素插入到该位置后；
 * 重复步骤2~5。
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {3, 5, 1, 2, 3, 1};
//        insertionSort(a);
//        insertionSort1(a);
//        insertionSort2(a);
        insertionSort3(a);
    }

    /**
     * @param a 插入排序：从第二个元素开始排序，如果第一个比第二个大，换位置，
     *          依次，第三个比第二个大，换位置，
     */
    public static void insertionSort(int[] a) {
         int preIndex,current;
         for(int i=1;i<a.length;i++){
             preIndex = i-1;
             current  = a[i];
             while(preIndex>=0 && a[preIndex]>current){
                 a[preIndex+1] = a[preIndex];
                 preIndex--;
             }
             a[preIndex+1] = current;
         }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void insertionSort1(int[] a) {
     int pre,current;
     for(int i=0;i<a.length;i++){
         pre = i+1;
         current = a[i];
         while(pre>=0 && current<a[pre]){
             a[pre+1] = a[pre];
             pre--;
         }
         a[pre+1] = current;
     }


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    public static void insertionSort2(int[] a) {

        int preIndex, current;
        for(int i=1;i<a.length;i++){
            preIndex = i-1;
            current = a[i];
            while(preIndex >=0 && a[preIndex] > current){
                a[preIndex+1] = a[preIndex];
                preIndex--;
            }
            a[preIndex+1] = current;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //插入排序：默认第一个已经排序，从第二个元素开始，当第二个元素大于第一个，
    public static void insertionSort3(int[] arr){
        int pre,current;
        for(int i=1;i<arr.length;i++){
            pre = i-1;
            current = arr[i];
            while(pre>=0 && current<arr[pre]){
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre+1] = current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
