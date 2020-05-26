package com.study.searching;
/*
顺序查找算法的实现：


 */

public class SequentialSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,4,3,2};
        int index = searching(arr,4);
        if (index == 0){
            System.out.println("不存在");
        }else{
            System.out.println("找到了小标为"+ index);
        }



    }
    public static int searching(int []arr ,int key ){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return 0;
    }
}

