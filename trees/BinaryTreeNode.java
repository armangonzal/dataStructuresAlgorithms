public class BinaryTreeNode<T>
{
    private T data;
    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;

    public BinaryTreeNode() {
        data = null;
    }

    public T getData() {
        return data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight(){
        return right;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLeft(BinaryTreeNode<T> node){
        this.left = node;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }
}