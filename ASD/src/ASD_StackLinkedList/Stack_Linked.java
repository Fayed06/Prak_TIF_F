package ASD_StackLinkedList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stack_Linked {
    public static void main(String[] args) throws IOException {
        StackBerbasisLinkedList stack = new StackBerbasisLinkedList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nama = reader.readLine().split(" ");
        String[] nim = reader.readLine().split(" ");

        //buat logika untuk push serta pop disini
        Mahasiswa[] mahasiswa = new Mahasiswa[nama.length];
        for (int i = 0; i < nama.length; i++) {
            mahasiswa[i] = new Mahasiswa(nama[i], nim[i]);
            stack.push(new Node(mahasiswa[i]));
        }

        int jumlahPop = Integer.parseInt(reader.readLine());

        for (int i = nama.length -1 ; i >= nama.length - jumlahPop; i--) {
            stack.pop();
            System.out.println("Mahasiswa dengan Nama " + mahasiswa[i].nama +
                    " dan NIM " + mahasiswa[i].nim +
                    " telah dikeluarkan dari stack");
        }
        System.out.println("Isi Stack :");
        stack.print();
    }
}

class StackBerbasisLinkedList {

    Node top,head,tail;
    int size=0;


    public boolean isEmpty() {
        return size == 0;
    }

    public void push(Node input) {
        //Lengkapi code ini
        if (isEmpty()) {
            head = input;
            tail = input;
            size++;
            return;
        }
        input.next = head;
        head = input;
        top = head;
        size++;
    }

    public Mahasiswa pop() {
        //Lengkapi code ini
        if (isEmpty()) {
            throw  new EmptyStackException();
        }

        Node temp = head;
        head = temp.next;
        temp.next = null;
        top = head;
        size--;
        return temp.data;
    }

    public void print() {
        //Lengkapi code ini
        if(isEmpty()){
            System.out.println("Stack Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.nama + " ");
            temp = temp.next;
        }
    }

}

class Node {

    //Lengkapi code ini
    Node next;
    Mahasiswa data;

    Node(Mahasiswa data) {
        this.data = data;
    }

}

class Mahasiswa {

    String nama;
    String nim;

    //Lengkapi code ini
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
}