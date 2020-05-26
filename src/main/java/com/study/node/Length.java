package com.study.node;

import static java.lang.System.*;

/*
显示链表中的有效节点的个数

 */
public class Length {
    HeroNode head;

    public int  getLength(HeroNode heroNode){
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
