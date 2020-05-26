package com.study.sort;
/*
选择排序：
1，基本思想
    1>第一次从arr[0]-arr[n-1]中选取最小的数与arr[0]交换；
    2>第一次从arr[1]-arr[n-1]中选取最小的数与arr[1]交换；
    3>第一次从arr[2]-arr[n-1]中选取最小的数与arr[2]交换；
                       .
                       .
    n-1>第一次从arr[n-2]-arr[n-1]中选取最小的数与arr[n-2]交换；

    总共交换了n-1次。
 */

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int arr[] = {101, 34, 119, 1, -1, 90, 23};


        for (int i = 0; i <arr.length; i++) {
            int index = i;
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
                }
            if (index!=i) {
                arr[index] = arr[i];
                arr[i] = min;
            }
            System.out.println("第" + i + "轮交换后");
            System.out.println(Arrays.toString(arr));
        }
    }
    }

