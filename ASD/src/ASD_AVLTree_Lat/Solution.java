package ASD_AVLTree_Lat;

import java.util.*;

class Node {

    int data, tinggi;
    Node nodeKiri, nodeKanan;

    Node(int d) {
        data = d;
        tinggi = 1;
    }
}

class AVLTree {

    Node akar;
    int jumlahNode = 0;

    int getTinggi(Node N) {
        if (N == null) {
            return 0;
        }
        return N.tinggi;
    }
    // Fungsi untuk memutar node melalui y
    // Lihat diagram diatas

    Node putarKanan(Node y) {
        Node x = y.nodeKiri;
        Node T2 = x.nodeKanan;
        // Melakukan putaran
        x.nodeKanan = y;
        y.nodeKiri = T2;
        // Update tinggi
        y.tinggi = Math.max(getTinggi(y.nodeKiri), getTinggi(y.nodeKanan)) + 1;
        x.tinggi = Math.max(getTinggi(x.nodeKiri), getTinggi(x.nodeKanan)) + 1;
        // hasilkan pasangan node baru
        return x;
    }
    // Fungsi untuk memutar node melalui x
    // Lihat diagram diatas

    Node putarKiri(Node x) {
        Node y = x.nodeKanan;
        Node T2 = y.nodeKiri;
        // Melakukan putaran
        y.nodeKiri = x;
        x.nodeKanan = T2;
        // Update tinggi
        x.tinggi = Math.max(getTinggi(x.nodeKiri), getTinggi(x.nodeKanan)) + 1;
        y.tinggi = Math.max(getTinggi(y.nodeKiri), getTinggi(y.nodeKanan)) + 1;
        // hasilkan pasangan node baru
        return y;
    }
    // Dapatkan nilai seimbang dari node N

    int getBalance(Node N) {
        return (N != null) ? getTinggi(N.nodeKiri) - getTinggi(N.nodeKanan) : 0;
    }

    Node insert(Node node, int data) {
        /* 1. Penambahan Node pada BST biasa */
        if (node == null) {
            return (new Node(data));
        }

        if (data < node.data) {
            node.nodeKiri = insert(node.nodeKiri, data);
        } else if (data > node.data) {
            node.nodeKanan = insert(node.nodeKanan, data);
        } else // Duplicate datas not allowed
        {
            return node;
        }

        /* 2. Update tinggi pada ancestor node */
        node.tinggi = 1 + Math.max(getTinggi(node.nodeKiri), getTinggi(node.nodeKanan));
        /* 3. Melakukan keseimbangan pada melalui nilai
        ancestor untuk mengecek apakah node tidak
        seimbang*/
        Node result = balance(node, data);

        return result;
    }

    Node balance(Node node, int data) {
        int balance = getBalance(node);

        // Kondisi putar kanan
        if (balance > 1 && data < node.nodeKiri.data) {
            return putarKanan(node);
        }
        // Kondisi putar kiri
        else if (balance < -1 && data > node.nodeKanan.data) {
            return putarKiri(node);
        }
        // Kondisi putar kiri kanan
        else if (balance < -1 && data > node.nodeKanan.data) {
            return putarKiri(node);
        }
        // Kondisi putar kanan kiri
        else if (balance < -1 && data < node.nodeKanan.data) {
            node.nodeKanan = putarKanan(node.nodeKanan);
            return putarKiri(node);
        }
        // Kondisi tidak berubah sama sekali
        else {
            return node;
        }

    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.nodeKiri);
            System.out.print(node.data + " ");
            inorder(node.nodeKanan);
        }
    }

    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.nodeKiri);
            preorder(node.nodeKanan);
        }
    }

    void postorder(Node node) {
        if(node == null){
            return;}
        postorder(node.nodeKiri);
        postorder(node.nodeKanan);
        System.out.print(node.data + " ");
    }

}

public class Solution {

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Scanner zaki = new Scanner(System.in);

        int n = zaki.nextInt();
        int[] z = new int[n];
        int[] cab = new int[n];


        for(int i=0; i<cab.length;i++){
            cab[i] = zaki.nextInt();
            tree.akar = tree.insert(tree.akar, cab[i]);
        }

        zaki.nextLine();
        String perintah = zaki.nextLine();
        if(perintah.equals("preorder")){
            tree.preorder(tree.akar);
        }
        else if(perintah.equals("inorder")){
            tree.inorder(tree.akar);
        }
        else if(perintah.equals("postorder")){
            tree.postorder(tree.akar);
        }

    }
}




