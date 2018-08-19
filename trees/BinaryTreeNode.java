public class BinaryTreeNode<T>
{
    private T data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

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
}