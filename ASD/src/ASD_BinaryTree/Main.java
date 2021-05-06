package ASD_BinaryTree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        Node node1 = new Node(5);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(1);
        Node node5 = new Node(7);
        Node node6 = new Node(8);

        tree.root = node1;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;

        System.out.println("Preorder Traversal");
        tree.preorderTraversal();

        System.out.println("\nInorder Traversal");
        tree.inorderTraversal();

        System.out.println("\nPostorder Traversal");
        tree.postorderTraversal();
    }
}
