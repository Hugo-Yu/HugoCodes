package com.study.sort;
/*
举例来说明冒泡算法：

将5个无序的数：3,9,-1,10,-2 使用冒泡算法排序近期排成一个从小到大的有序序列；
1>可以将BubbleSort的代码进行优化，由于他的代码第一次到第四次排序的代码都是相同的。可以加一个for循环将其抱起来
2>代码的优化：
因为在排序过程中，各元素不断接近自己的位置，如果一趟比较下来没有进行交换，说明序列有序。
因此要在排序过程中加一个标志flag判断元素是否进行了交换，从而减少不必要的比较。
例如:arr[] = {1,2,3,4,5}; 此时不需要排序，若不优化还需要排序四次；
 */


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort2 {
    public static void main(String[] args) {
        int arr[]=new int[80000];
        for (int i = 0; i < 80000 ; i++) {
            arr[i] =(int)( Math.random()*80000);
        }
        //System.out.println(Arrays.toString(arr));

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyy-mm-dd:mm ss");
        String date1Str = simpleDateFormat1.format(date1);
        System.out.println("排序前的时间;"+ date1Str);

        //测试冒泡算法
        bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));

        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyy-mm-dd:mm ss");
        String date2Str = simpleDateFormat2.format(date2);
        System.out.println("排序前的时间;"+ date2Str);


        /*
        int arr[] = {3, 9, 10, 11, 20};

        //输出一下当前的数组
        System.out.println("排序之前的数组");
        System.out.println(Arrays.toString(arr));

        int temp = 0;//定义一个临时变量
        boolean flag = false;//标志符判断是否进行了交换。

        //第j趟排序，将最大的数排在最后j位
        for (int j = 0; j < arr.length-1; j++) {
        for (int i = 0; i < arr.length - 1; i++) {
             flag = true;//如果进行了交换，flag=true；
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

            //输出第j+1趟结束后的数组
            //System.out.println("第"+(j+1)+"趟排序后的数组为：");
            //System.out.println(Arrays.toString(arr));
        if (flag =true){
            break;
        }else {
            flag = false;//如果进行了一次交换；flag=true；此时重新建flag置为false。
        }
        }*/
    }

    //将排序封装成一个方法；
    public static void bubbleSort(int [] arr){
        int temp = 0;//定义一个临时变量
        boolean flag = false;//标志符判断是否进行了交换。

        //第j趟排序，将最大的数排在最后j位
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                flag = true;//如果进行了交换，flag=true；
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            //输出第j+1趟结束后的数组
            //System.out.println("第"+(j+1)+"趟排序后的数组为：");
            //System.out.println(Arrays.toString(arr));
            if (!flag){
                break;
            }else {
                flag = false;//如果进行了一次交换；flag=true；此时重新建flag置为false。
            }
        }
    }
}
