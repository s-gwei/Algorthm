package com.sun.sort;
/**
 * 选择排序(Selection-sort)
 * 是一种简单直观的排序算法。它的工作原理：
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕。
 *
 *初始状态：无序区为R[1..n]，有序区为空；第i趟排序(i=1,2,3…n-1)开始时，
 * 当前有序区和无序区分别为R[1..i-1]和R(i..n）。该趟排序从当前无序区中-
 * 选出关键字最小的记录 R[k]，将它与无序区的第1个记录R交换，使R[1..i]和R[i+1..n)
 * 分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；n-1趟结束，数组有序化了。
 *
 * 时间复杂度 o(n^2)
 *空间复杂度0(1)
 * 循环次数：（n^2-n）/2
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {3,5,1,2,3,1};
//        selectionSort(a);
//        selectionSort1(a);
//        selectionSort2(a);
//        selectionSort3(a);
        selectionSort4(a);
    }

    private static void selectionSort(int[] a) {
      int minIndex;
      for(int i=0;i<a.length-1;i++){
          minIndex = i;
          for(int j=i;j<a.length;j++){
              if(a[j]<a[minIndex]){
                  minIndex = j;
              }
          }
          int temp =  a[i] ;
          a[i] = a[minIndex];
          a[minIndex] = temp;
      }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static  void selectionSort1(int[] arr){
        //选择排序，依次比较当前值，是否大于数组中每个数值，如果大于，标记较大的下标，
        for(int i = 0 ; i < arr.length-1 ; i++){
            int maxIndex = i;
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[maxIndex]>arr[j]){
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i]  = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static  void selectionSort2(int[] arr){
        //选择排序，依次比较当前值，是否大于数组中每个数值，如果大于，标记较大的下标，
        int[] a = {3,5,1,2,3,1};
        for(int i = 0 ;i <arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static  void selectionSort3(int[] arr){
        //选择排序，依次比较当前值，是否大于数组中每个数值，如果大于，标记较大的下标，
       for(int i=0;i<arr.length-1;i++){
           int minIndex = i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[minIndex] > arr[j]){
                   minIndex = j;
               }
           }
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
       }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static  void selectionSort4(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
