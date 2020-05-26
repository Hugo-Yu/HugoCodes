package com.study.data01Link;

import java.util.Iterator;

public class MyLinkList<E> implements Iterable<E> {

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    ////嵌套Node类
    private static class Node<E>{
        public Node(E data, Node<E> prev, Node<E> next) {//有参构造方法
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        public E data;
        public Node<E> prev;
        public Node<E> next;
    }

    //add方法
    public void add(){

    }

    //clean方法
    public void clean(){

    }

    //
}

/*
  public int getDecimalValue(ListNode head) {
        if(head = null)
            return 0;

        Stack<Integer> stack = new Stack<>;
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }

        int mark = 1;
		int ans = 0;
		while (!stack.isEmpty()) {
			ans += stack.pop() * mark;
			mark <<= 1;
		}
		return ans;
    }
 */