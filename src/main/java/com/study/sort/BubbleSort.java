package com.study.sort;
/*
举例来说明冒泡算法：

将5个无序的数：3,9,-1,10,-2 使用冒泡算法排序近期排成一个从小到大的有序序列；


 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,9,-1,10,-2};

        //输出一下当前的数组
        System.out.println("排序之前的数组");
        System.out.println(Arrays.toString(arr));

        int temp = 0;//定义一个临时变量

        //第一趟排序，将最大的数排在最后一位
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }


        //输出第一趟结束后的数组
        System.out.println("第一趟排序后的数组为：");
        System.out.println(Arrays.toString(arr));

        //第二趟排序，将第二大的数排在倒数第二位
        for (int i = 0; i <arr.length-2 ; i++) {
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        //输出第二趟结束后的数组
        System.out.println("第二趟排序后的数组为：");
        System.out.println(Arrays.toString(arr));

        //第三趟排序，将第三大的数排在倒数第三位
        for (int i = 0; i <arr.length-3 ; i++) {
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        //输出第一趟结束后的数组
        System.out.println("第三趟排序后的数组为：");
        System.out.println(Arrays.toString(arr));

        //第四趟排序，将第四大的数排在倒数第四位
        for (int i = 0; i <arr.length-4 ; i++) {
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        //输出第四趟结束后的数组
        System.out.println("第四趟排序后的数组为：");
        System.out.println(Arrays.toString(arr));


    }
}
