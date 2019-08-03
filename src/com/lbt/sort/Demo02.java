package com.lbt.sort;
/*冒泡排序*/
public class Demo02 {

    private static final int SIZE = 10;
    private static void bubbleSort(int[] a){
        int temp;
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j <a.length-i ; j++) {
                if (a[j] > a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print("第"+i+"步排序的结果：");
            for (int k = 0;k<a.length;k++) {
                System.out.print(" " + a[k]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] array = new int[SIZE];
        int i;
        for (i=0;i<SIZE;i++){
            array[i] = (int) (100+Math.random()*(100+1));
        }
        System.out.println("排序前的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        bubbleSort(array);
        System.out.println("排序后的数组为：");
        for (i=0;i<SIZE;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
