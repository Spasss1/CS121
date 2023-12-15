// BinarySearchTreeDemo.java

package binarySearchTreeActivity;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        Node<Character> tree = new Node<>();
        char[] charArray = {'D', 'B', 'F', 'A', 'C', 'E', 'G'};

        for (char ch : charArray) {
            tree.insert(ch);
        }

        System.out.println("Preorder Traversal:");
        tree.preorderTraversal();

        System.out.println("\nInorder Traversal:");
        tree.inorderTraversal();

        System.out.println("\nPostorder Traversal:");
        tree.postorderTraversal();
    }
}
