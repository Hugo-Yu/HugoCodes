package com.study.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int arr[] = {17, 3, 25, 14, 20, 9};
        System.out.println("排序前的数组：");
        System.out.println(Arrays.toString(arr));

        insertSort(arr);
        System.out.println("排序后的数组：");
        System.out.println(Arrays.toString(arr));
    }


    public static void insertSort(int arr[]) {//static关键字，静态方法：
        /*
        int insertVal = arr[1];//待插入的数
        int insertIndex =1-1;//带插入数前一个数的下标，用来与带插入数比较大小，确定位置
        //说明:
        //1,首先选第二个数3与第一个数17比较，确定前两个数的排序3,17
        //2,选第三个数insertIndex与前两个数比较，先于insertIndex-1（第二个数）比较，若大于第二个数，跳出循环
        //若小于第二个数，再与第一个数比较，若小于，insertIndex-1-1=-1，跳出循环；若大于跳出循环。
        while (insertIndex >= 0 && insertVal<arr[insertIndex]){//下标一定不小于零，且当
            arr[insertIndex+1] = arr[insertIndex];//当满足循环时，将带插入数前一个元素后移
            insertIndex--;//小标移到前两个元素
        }
        arr[insertIndex+1] = insertVal;
    */
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int insertIndex =i-1;
            while(insertIndex>=0 && insertVal < arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }

            if (insertIndex+1 !=i){
            arr[insertIndex+1] = insertVal;
            }
            System.out.println("第"+ i+ "次排序后的数组：");
            System.out.println(Arrays.toString(arr));
        }
    }
}