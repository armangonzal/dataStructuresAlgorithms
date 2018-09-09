package com.trees;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTreeNode<Integer> node0 = new BinaryTreeNode<>(23);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(41);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(65);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(33);

        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(node0);
        BinaryTreeNode<Integer> root = bst.getRoot();
        root.setLeft(node1);
        root.setRight(node2);
        root.getLeft().setLeft(node3);

        System.out.println("PreOrderRec");
        bst.preOrderRec(bst.getRoot());
        System.out.println("PreOrder");
        bst.preOrder();

        System.out.println("InOrderRec");
        bst.inOrderRec(bst.getRoot());
        System.out.println("InOrder");
        bst.inOrder(bst.getRoot());
    }
}
