package com.sun.sort;

/**
 * 快速排序
 * 快速排序的基本思想：通过一趟排序将待排记录分隔成独立的两部分，
 * 其中一部分记录的关键字均比另一部分的关键字小，
 * 则可分别对这两部分记录继续进行排序，以达到整个序列有序。
 *
 * 快速排序使用分治法来把一个串（list）分为两个子串（sub-lists）。具体算法描述如下：
 * 通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
 *  然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 *  快速排序 的平均时间复杂度为O(NlogN),是冒泡排序的一种改进版。

 *
 *
 * 1)  设置两个变量i、j，排序开始的时候：i=0，j=n-1；
 * 2）第一个数组值作为比较值，首先保存到temp中，即temp=A[0]；
 * 3）然后j-- ,向前搜索,找到小于temp后,因为s[i]的值保存在temp中,所以直接赋值,s[i]=s[j]
 * 4）然后i++,向后搜索,找到大于temp后,因为s[j]的值保存在第2步的s[i]中,所以直接赋值,s[j]=s[i],然后j--,避免死循环
 * 5）重复第3、4步，直到i=j,最后将temp值返回s[i]中
 * 6)  然后采用“二分”的思想,以i为分界线,拆分成两个数组 s[0,i-1]、s[i+1,n-1]又开始排序
 *
 *
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,3,2};
//        quickSort(arr,0,arr.length-1);
//        quickSort1(arr,0,arr.length-1);
        quickSort2(arr,0,arr.length-1);
        System.out.println();

    }
/**

 *
 *  j从右开始，如果arr[j]<temp,就将arr[j]赋值给a[i],满足条件则j--
 *  i从左开始，如果arr[i]>temp，将arr[i]赋值给arr[j],同时将j--,满足条件，则i++
 *  两步走完，将arr[i]=temp;
 *  如果此时i<j,则重复以上步骤，
 *  第一次循环后，temp左边都小于等于temp，右边都大于等于temp
 *
 */


    public static void quickSort(int[] arr , int begin, int end){
        if(begin > end)
            return;
        int temp = arr[begin];
        int i = begin;
        int j = end;
        while(i<j){
            while(j>i&&arr[j]>=temp){
                j--;  //(3)j--,找小值
            }
            arr[i]= arr[j];             //保存小值,到s[i]上
            while(i<j&&arr[i]<=temp) {
                i++; //(4)i++,找大值
            }
            arr[j]=arr[i];//保存大值 到s[j]上
            j--;
        }
        arr[i]=temp;
        quickSort(arr, 0, i-1);
        quickSort(arr, i+1, end);

    }


    public static void quickSort1(int[] arr , int begin, int end){
        if(begin > end)
            return;
        int i = begin;
        int j = end;
        int temp = arr[begin];
        while(j>i){
            while(j>i&&arr[j]>=temp){
                j--;
            }
            arr[i]=arr[j];
            while(i<j&&arr[i]<=temp){
                i++;
            }
            arr[j--]=arr[i];
        }
        arr[i] = temp;
        quickSort1(arr,0,i-1);
        quickSort1(arr,i+1,end);
    }


    /**
     * 快速排序，
     * 1，获取数组begin元素，将数组分割成两个，左边元素都小于begin，右边元素都大于等于begin
     * 2，再将两个数组重复第一步操作
     *
     */

    public  static  void quickSort2(int[] arr , int begin, int end){
        if(begin>end){
            return;
        }
        int i = begin;
        int j = end;
        int temp = arr[begin];
        while(j>i){
            //找小值,保存小值,到s[i]上
            while(j>i && arr[j]>=temp){
                j--;
            }
            //找大值，保存
            arr[i]=arr[j];
            while(i<j&&arr[i]<=temp){
                i++;
            }
            arr[j--]=arr[i];
        }
        arr[i] = temp;
        quickSort2( arr,begin,i-1);
        quickSort2(arr,i+1,end);
    }
}
