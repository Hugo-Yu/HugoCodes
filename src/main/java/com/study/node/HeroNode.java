package com.study.node;
/*
自定义链表设计
带头结点
 */


public class HeroNode {
        HeroNode head;
        HeroNode next;//节点的引用，指向下一个节点
        int no;//节点的对象，即内容
        String name;
        String nickname;

        public HeroNode(int no, String name, String nickname) {
            this.no = no;
            this.name = name;
            this.nickname = nickname;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", nickname='" + nickname + '\'' +
                    '}';
        }
    }


