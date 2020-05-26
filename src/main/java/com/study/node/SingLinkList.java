package com.study.node;

public class SingLinkList {
    HeroNode head = new HeroNode(0,"","");

    public void add(HeroNode heroNode){
        HeroNode temp = head;

        //遍历链表，找到最后
        while(true){
            //找到最后，
            if (temp.next == null){
                break;
            }
            temp = temp.next;

        }
        //就将新的heroNode放在temp.next中
        temp.next = heroNode;
    }

    //删除节点
    public void del(HeroNode heroNode){
        HeroNode temp = head.next;

    }

    public int  getLength(HeroNode head){
        if(head.next == null){
            return 0;
        }
        int length = 0;
        HeroNode cur = head.next;
        while (cur!= null){
            length++;
            cur = cur.next;
        }
        return length;


    }

}
