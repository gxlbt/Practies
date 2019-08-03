package com.lbt.search;

import java.util.Scanner;

/*折半查找
* 已排序过的数据序列
* */
public class Demo02 {
    private static final int N = 15;
    //快速排序算法
    private static void quickSort(int[] arr,int left,int right){
        int f,t;
        int rtemp,ltemp;
        ltemp = left;
        rtemp = right;
        f = arr[(left+right)/2];
        while(ltemp < rtemp){
            while(arr[ltemp] < f){
                ++ltemp;
            }
            while (arr[rtemp] > f){
                --rtemp;
            }
            if (ltemp <= rtemp){
                t = arr[ltemp];
                arr[ltemp] = arr[rtemp];
                arr[rtemp] = t;
                --rtemp;
                ++ltemp;
            }
        }
        if (ltemp == rtemp){
            ltemp++;
        }
        if (left < rtemp){
            quickSort(arr,left,ltemp-1);//递归调用
        }
        if (ltemp < right) {
            quickSort(arr, rtemp + 1, right);
        }
    }

    //折半查找
    private static int searchFun(int[] a,int n,int x){
        int mid,low,high;
        low = 0;
        high = n-1;
        while(low <= high){
            mid = (low+high)/2;
            if (a[mid] == x){
                return mid;
            }else if (a[mid] > x){
                high = mid -1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int x,n,i;
        int[] array = new int[N];
        for (i=0;i<N;i++){
            array[i] = (int) (100+Math.random()*(100+1));
        }
        System.out.println("折半查找算法演示：");
        System.out.println("排序前数列顺序：");
        for (i=0;i<N;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        quickSort(array,0,N-1);
        System.out.print("排序后的数列：");
        for (int k:array) {
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.print("请输入要查找的数：");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        n = searchFun(array,N,x);
        if (n<0){
            System.out.println("没找到数据："+x);
        }else{
            System.out.println("数据："+x+"位于数组的第"+(n+1)+"个元素处");
        }
    }
}
