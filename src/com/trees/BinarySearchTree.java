package com.trees;
import java.util.*;

public class BinarySearchTree<T extends Comparable<T>>{
    private BinaryTreeNode<T> root;

    public BinarySearchTree(BinaryTreeNode<T> root){
        this.root = root;
    }

    public BinaryTreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode<T> root) {
        this.root = root;
    }

    public void preOrderRec(BinaryTreeNode root){
        System.out.printf("%s%n",root.getData().toString());
        if(root.getLeft() != null) preOrderRec(root.getLeft());
        if(root.getRight() != null) preOrderRec(root.getRight());
    }

    public void preOrder() {
        Deque<BinaryTreeNode> stack = new ArrayDeque<BinaryTreeNode>();
        BinaryTreeNode<T> rNode = this.getRoot();
        while(rNode != null){
            while(rNode != null){
                System.out.printf("%s%n", rNode.getData().toString());
                stack.push(rNode);
                rNode = rNode.getLeft();
            }
            if(stack.isEmpty()) break;
            rNode = stack.pop();
            rNode = rNode.getRight();
        }
    }

}

