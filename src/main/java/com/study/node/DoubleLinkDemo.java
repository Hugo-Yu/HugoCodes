package com.study.node;

import javax.print.DocFlavor;

public class DoubleLinkDemo {

    public static void main(String[] args) {
        HeroNode2 hero1 = new HeroNode2(1,"A","A");
        HeroNode2 hero2 = new HeroNode2(2,"B","B");
        HeroNode2 hero3 = new HeroNode2(3,"C","C");

        DoublelinkList list = new DoublelinkList();
        list.add(hero1);
        list.add(hero2);
        list.add(hero3);
    }
    
}


    //创建一个双链表的类
     class DoublelinkList{

        //初始化一个头节点
        HeroNode2 head = new HeroNode2(0,"","");
        //返回头节点
        public HeroNode2 getHead(){
            return head;
        }

        //遍历双链表
        public void list(){
            if(head.next==null){
                System.out.println("链表为空");
                return;
            }
            //因为头节点不能动，需要一个复辅助节点
            HeroNode2 temp = head.next;
            while (true){
                if(temp == null){
                    break;
                }
                System.out.println(temp);

                temp = temp.next;
            }
            }

            //添加一个节点到双链表的最后
        public void add(HeroNode2 heroNode2) {
            //head 不能动，
            HeroNode2 temp = head;

            //遍历链表找到最后
            while (true){
                if(temp.next == null){
                    break;
                }
                temp = temp.next;
            }
            //退出while循环式，到达链表的最后
            temp.next = heroNode2;
            heroNode2.pre = temp;
        }

        //删除一个节点,双链表可以直接删除
        public void del(int no){
            //判断当前链表是否为空
            if(head.next ==null){
                System.out.println("链表为空");
                return;
            }
            HeroNode2 temp = head;
            boolean flag = false;
            //已经到达最后
            while (true){
                if (temp == null){
                    break;
                }
                if(temp.no == no){
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            //判断flag
            if (flag){
                temp.pre.next = temp.next;
                if (temp.next!=null){temp.next.pre = temp.pre;}

          }

        }

        }


    //定义一个双链表
    class HeroNode2{
        int no;
        String name;
        String  nickname;

        HeroNode2 next;
        HeroNode2 pre;

        public HeroNode2(int no, String name, String nickname) {
            this.no = no;
            this.name = name;
            this.nickname = nickname;
        }

        @Override
        public String toString() {
            return "HeroNode2{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", nickname='" + nickname + '\'' +
                    '}';
        }
    }

