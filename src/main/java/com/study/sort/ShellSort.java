package com.study.sort;
/*
希尔排序：也是一种插入排序
    1，把记录按下标的一定增量分组（例如有n个数，先分成n/2组，对每组进行排序。
    2，然后分成n/2/2组，进行排序，
    3，直到n/2/2...=1，
    
    
例如：将{8,9,1,7,2,3,5,4,6,0}进行分组。

 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int arr[]) {
        for (int gap = arr.length/2; gap > 0; gap /= 2) {
           for (int i = gap;i<arr.length;i++){
               int j = i;
               int temp = arr[j];
               for (j=i;j>=gap&&temp<arr[j-gap];j -=gap){
                   arr[j] = arr[j-gap];
               }
               arr[j] = gap;
           }
        }


       /* int temp = 0;
        int count= 0;

        //第一轮排序，分成五组(0,5),(1,6),(2,7),(3,8),(4,9).
        for (int i = 5; i < arr.length ; i++) {
            for (int j = i-5; j >=0 ; j++) {
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }

        //第二轮分成2组，（0,2,4,6,8），（1,3,5,7,9）。
        for (int i = 2; i < arr.length ; i++) {
            for (int j = i-2; j >=0 ; j -= 2) {

            }

        }
    }*/
    }
}
