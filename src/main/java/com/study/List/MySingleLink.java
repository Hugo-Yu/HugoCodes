package com.study.List;

public class MySingleLink {

    private Node first;//定义一个头节点


    //添加头节点
    public void addFirstNode(int data){
        //新建一个节点
        Node newFirst = new Node(data);
        //将新节点的下一个节点指向旧的节点
        newFirst.next = first;
        //将新的节点设置为头节点
        first = newFirst;

    }

    //判断链表是否为空
    public boolean isEmpty(){
        return first.next == null;
    }

    //链表的长度
    public int size(int n){
        Node temp = first;
        if (first.next == null){
            return 0;
        }
        while(temp.next!=null){
            n++;
            temp= temp.next;
        }
        return n;
    }

    //查询某个特定值的节点
    public Node findValue(int data){
        Node temp = first;
        while (temp != null){
            if(temp.next == null){
                System.out.println("该节点不存在！" );
                return null;
            }
            if (temp.data == data){
               break;
            }

            temp = temp.next;
            }
        return temp;
        }

        //单链表的插入，插入到链表的最后
    public void add(int data){
        Node temp = first;//头节点不能动，增加一个辅助节点用来遍历链表
        Node newNode = new Node(data);//需要插入的节点
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //插入节点到制定的位置；按大小排序的；
    public void addRight(int data){      //插入一个节点到链表中之中，无返回值用void关键字
        Node newNode = new Node(data);//要插入的节点
        Node previous = null;//插入节点未知的前一个节点
        Node temp = first;//头节点不能动，增加一个辅助节点用来遍历链表

        while(temp.next != null && data < temp.data){
            previous = temp;
            temp = temp.next;
            if (temp.next == null){
                break;
            }
        }
        newNode.next = temp;
        previous.next = newNode;

    }

    //删除链表中的摸个节点
    //public Node deteleNode(int data){

   // }






    //删除头节点
    //public boolean delFirst(){



    //获取链表中 第i个元素的值，
    public void getElement(int i){

    }
}
//定义一个节点
class Node {
    public int data;//节点存存放的数据
    public Node next;//next 指向下一个节点

    public Node(int data) {
        this.data = data;
    }

}
