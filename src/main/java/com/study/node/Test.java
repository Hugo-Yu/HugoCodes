package com.study.node;

public class Test {
    public static void main(String[] args) {
        HeroNode h1 = new HeroNode(1,"A","a");
        HeroNode h2 = new HeroNode(2,"B","b");
        HeroNode h3 = new HeroNode(3,"C","c");

        SingLinkList singLinkList = new SingLinkList();
        singLinkList.add(h1);
        singLinkList.add(h2);
        singLinkList.add(h3);

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
