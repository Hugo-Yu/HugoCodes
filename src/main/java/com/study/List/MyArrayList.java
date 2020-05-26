package com.study.List;
/*
实现一个ArryList泛型数组类，
 */

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E> {
   //设置数组的容量为10
    private static final int CAPACITY = 10;

    private int theSize;
    private E [] theItems;

    public MyArrayList() {

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}

