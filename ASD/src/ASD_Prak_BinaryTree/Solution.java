package ASD_Prak_BinaryTree;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        Tree tree = new Tree();
        String kalimat = read.nextLine();
        Character[] kata = new Character[kalimat.length()];
        ArrayList<Character> arr = new ArrayList<>();

        for(int i =0; i< kalimat.length();i++) {
            if(arr.contains(kalimat.charAt(i))) {
                continue;
            }
            tree.sisipData(kalimat.charAt(i));
            arr.add(kalimat.charAt(i));
        }

        System.out.println("Preorder traversal");
        tree.preOrder(tree.root);
        System.out.println("");

        System.out.println("Inorder traversal");
        tree.inOrder(tree.root);
        System.out.println("");
        System.out.println("Postorder traversal");
        tree.postOrder(tree.root);

    }
}

class Node {
    int data;
    Node left;
    Node right;
    char kata;

    public Node(){

    }

    public Node(int data, char kata){
        this.data = data;
        this.kata = kata;
        left = right = null;
    }

}

class Tree {
    public Node root;

    public Tree(){
        root = null;
    }

    boolean rootEmpty() {
        return root == null;
    }

    public void sisipData(char kata){
        int angka = kata;
        Node node = new Node(angka, kata);

        if(rootEmpty()) {
            root = node;
        } else {
            Node n = root;
            Node parent;
            while(true) {
                parent = n;
                if(angka < n.data) {
                    n = n.left;
                    if(n == null) {
                        parent.left = node;
                        return;
                    }
                } else {
                    n = n.right;
                    if(n==null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }

    void preOrder(Node node) {
        if (node==null){
            return;
        }
        System.out.print(node.kata+" ");
        preOrder(node.left);
        preOrder(node.right);
    }


    void inOrder(Node node) {
        if (node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.kata+" ");
        inOrder(node.right);
    }

     void postOrder(Node node) {
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.kata+" ");
    }
}