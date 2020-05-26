package com.study.tree;

public class BinarySearchTreeDemo <AnyType extends Comparable<? super AnyType>>{

    private BinaryNode<AnyType> root;//定义根节点，父节点


    //二叉查找树，定义了头节点，
    class BinaryNode<AnyType>{
        AnyType  element;
        BinaryNode<AnyType> left;
        BinaryNode<AnyType> right;

        public BinaryNode(AnyType element) {
            this.element = element;
        }

        public BinaryNode(AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {
            element= theElement;
            left = lt;
            right = rt;
        }
    }
//

}




