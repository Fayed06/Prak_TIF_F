package ASD_Prak_Tree2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Kartel {
    String nama;
    String id;

    public Kartel(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
}

class Node {
    Kartel data;
    Node kiri;
    Node kanan;

    public Node(Kartel data) {
        this.data = data;
    }

    public void insert(Kartel data) {
        // Tuliskan kodemu di sini
        Node node = new Node(data);
        if (data.nama.compareTo(this.data.nama) < 0) {
            if (this.kiri == null) {
                this.kiri = node;
            } else {
                this.kiri.insert(data);
            }
        } else  {
            if (this.kanan == null) {
                this.kanan = node;
            } else {
                this.kanan.insert(data);
            }

        }

    }

}

class BinaryTree {
    Node root;

    public void insertNode(Kartel data) {
        if (root == null) {
            root = new Node(data);
        } else {
            root.insert(data);
        }
    }

    public void preorder(Node node) {
        // Tuliskan kodemu di sini
        if (node==null){
            return;
        }
        System.out.print(node.data.nama+" "+node.data.id+"\n");
        preorder(node.kiri);
        preorder(node.kanan);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException{
        // Tuliskan kodemu di sini
        Scanner read = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        String nama = read.nextLine();
        String[] namaSplit = nama.split(" ");
        String id = read.nextLine();
        String[] idSplit = id.split(" ");
        for (int i = 0; i < namaSplit.length ; i++) {
            tree.insertNode(new Kartel(namaSplit[i], idSplit[i]));
        }
        tree.preorder(tree.root);
    }
}
