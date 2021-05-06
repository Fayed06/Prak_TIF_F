package ASD_AVLTree_Prak;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        AVL tree = new AVL();
        String in = read.nextLine();
        String [] arrIn = in.split(" ");
        int i = 0;
        while (i<arrIn.length){
            tree.root = tree.insert(tree.root,Integer.parseInt(arrIn[i]));
            i++;
        }
        tree.inOrder(tree.root);
    }
}

class Node {
    int data,height;
    Node nodeLeft, nodeRight;

    Node (int d){
        data = d;
        height =1;
    }
}

class AVL{
    Node root;

    int getHeight(Node N){
        if (N == null){
            return 0;
        }
        return N.height;
    }

    Node rotasiKanan(Node y) {
        Node x = y.nodeLeft;
        Node temp = x.nodeRight;

        x.nodeRight = y;
        y.nodeLeft = temp;

        y.height = Math.max(getHeight(y.nodeLeft), getHeight(y.nodeRight)) + 1;
        x.height = Math.max(getHeight(x.nodeLeft), getHeight(x.nodeRight)) + 1;

        return x;
    }

    Node rotasiKiri(Node x) {
        Node y = x.nodeRight;
        Node temp = y.nodeLeft;

        y.nodeLeft = x;
        x.nodeRight = temp;

        x.height = Math.max(getHeight(x.nodeLeft), getHeight(x.nodeRight)) + 1;
        y.height = Math.max(getHeight(y.nodeLeft), getHeight(y.nodeRight)) + 1;

        return y;
    }
    int getSeimbang(Node N) {
        if (N == null) {
            return 0;
        }
        return getHeight(N.nodeLeft) - getHeight(N.nodeRight);
    }
    Node seimbang(Node node, int data) {
        int seimbang = getSeimbang(node);

        if (seimbang > 1 && data < node.nodeLeft.data) {
            return rotasiKanan(node);
        }
        else if (seimbang < -1 && data > node.nodeRight.data) {
            return rotasiKiri(node);
        }
        else if (seimbang > 1 && data > node.nodeLeft.data) {
            node.nodeLeft = rotasiKiri(node.nodeLeft);
            return rotasiKanan(node);
        }
        else if (seimbang < -1 && data < node.nodeRight.data) {
            node.nodeRight = rotasiKanan(node.nodeRight);
            return rotasiKiri(node);
        }
        else {
            return node;
        }
    }

    Node insert(Node node, int data) {

        if (node == null) {
            return (new Node(data));
        }

        if (data < node.data) {
            node.nodeLeft = insert(node.nodeLeft, data);
        } else if (data > node.data) {
            node.nodeRight = insert(node.nodeRight, data);
        } else {
            return node;
        }

        node.height = 1 + Math.max(getHeight(node.nodeLeft), getHeight(node.nodeRight));

        Node hasil = seimbang(node, data);

        return hasil;
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.nodeLeft);
            System.out.print(node.data + " ");
            inOrder(node.nodeRight);
        }
    }
}
