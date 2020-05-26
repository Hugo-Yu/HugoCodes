package com.study.search;
/*
线性查找法：
    就是顺序查找，如果找到了就提示找到了,并给出下标值

 */
public class SeqSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int x = seqSerach(arr, 1);

        if (x == -1){
            System.out.println("没找到");
        }else{
            System.out.println("找到了，下标为：" + x);
        }
    }

    public static int seqSerach(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

