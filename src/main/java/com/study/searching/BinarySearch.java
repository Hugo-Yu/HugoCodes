package com.study.searching;
/**

 *二分法查找
 *@author HugoYu

 折半查找（二分查找）
折半查找，又称作二分查找。必须满足两个前提：

1.存储结构必须是顺序存储
2.关键码必须有序排列

假设数据按升序排列。从中间项与关键值（key）开始对比，若关键值（key）>中间值，则在右半区间继续查找，反之则左半区间继续查找。
 以此类推，直至找到匹配值，或者查找内无记录，查找失败。

时间复杂度：O(logn)，可从二叉树的性质4推得。
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,8,9,13,15,16,19};
        int n =arr.length;
        BinarySearch binary = new BinarySearch();
        System.out.println(binary.binarySerrch(arr,n,19));

    }

    public int binarySerrch(int []arr,int n,int key){
      int high = n;
      int low = 1;
      int midde;
      while(low<high){
          midde = (low+high)/2;
          if (key<arr[midde]){
              high = midde-1;
          }else if (key>arr[midde]){
              low = midde+1;
          }else {
              return midde;
          }
      }
      return 0;
    }

}
