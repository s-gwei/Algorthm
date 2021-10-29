package com.sun.sort;

/**
 * 冒泡排序
 * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，
 * 如果它们的顺序错误就把它们交换过来。走访数列的工作是重复地进行直到没有再需
 * 要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经
 * 由交换慢慢“浮”到数列的顶端。
 * <p>
 * <p>
 * 算法描述
 * <p>
 * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 * 针对所有的元素重复以上的步骤，除了最后一个；
 * 重复步骤1~3，直到排序完成。
 * <p>
 * 时间复杂度 平均 o(n^2) 最坏o(n^2)  最好 o(n)
 * 空间复杂度 o(1)
 * 循环次数（n^2-n）/2
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 9, 2, 14, 23, 46, 4};
//        bubbleSort(a);
//        bubbleSort1(a);
//        bubbleSort2(a);
//        bubbleSort3(a);
        bubbleSort4(a);
    }

    private static void bubbleSort(int[] a) {
        //循环遍历数组，但是j要和j+1比较
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void bubbleSort1(int[] a) {
        //循环遍历数组，但是j要和j+1比较
       for(int i=0;i<a.length-1;i++){
           for(int j=0;j<a.length-i-1;j++){
               if(a[j]>a[j+1]){
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] =temp;
               }
           }
       }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static  void bubbleSort2(int[] arr) {
        /*
        冒泡排序，从小到大，比较当前一个与后一个大小，大，调换位置
        找到排序后的元素是放在前面还是后面，下次循环不在遍历这部分元素
         */
        for(int i = 0 ; i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static  void bubbleSort3(int[] arr) {
        /*
        冒泡排序，从小到大，比较当前一个与后一个大小，大，调换位置
        找到排序后的元素是放在前面还是后面，下次循环不在遍历这部分元素
         */
       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }

       }
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }

    public static void bubbleSort4(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
