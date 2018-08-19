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
        preOrderRec(root.getLeft());
        preOrderRec(root.getRight());
    }
}