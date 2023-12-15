package binarySearchTreeActivity;

// BinarySearchTree.java

public class Node<T extends Comparable<T>> {
    private Node<T> root;

    // Add necessary methods for insertion and traversals
    // ...

    public void preorderTraversal() {
        preorderTraversal(root);
    }

    private void preorderTraversal(Node<T> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorderTraversal(node.getLeft());
            preorderTraversal(node.getRight());
        }
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node<T> node) {
        if (node != null) {
            inorderTraversal(node.getLeft());
            System.out.print(node.getData() + " ");
            inorderTraversal(node.getRight());
        }
    }

    public void postorderTraversal() {
        postorderTraversal(root);
    }

    private void postorderTraversal(Node<T> node) {
        if (node != null) {
            postorderTraversal(node.getLeft());
            postorderTraversal(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }
}
