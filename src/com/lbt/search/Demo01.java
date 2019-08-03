package com.lbt.search;

import java.util.Scanner;

/*顺序查找
* 将数组中各元素依次与待查找的目标数进行比较
* */
public class Demo01 {
    private static final int N = 15;
    private static int searchFun(int[] a,int n,int x){
        int i,f = -1;
        for (i = 0; i<n ; i++) {
            if (x == a[i]){
                f = i;
                break;
            }
        }
        return f;
    }

    public static void main(String[] args) {
        int x,n,i;
        int[] array = new int[N];
        for (i=0;i<N;i++){
            array[i] = (int) (100+Math.random()*(100+1));
        }
        System.out.println("顺序查找算法演示：");
        System.out.println("数列顺序：");
        for (i=0;i<N;i++){
            System.out.print(" "+array[i]);
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
