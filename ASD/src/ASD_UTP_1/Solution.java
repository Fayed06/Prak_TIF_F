package ASD_UTP_1;
import java.util.Stack;
import java.util.EmptyStackException;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Deque d = new Deque();

        int jml = read.nextInt();

        for(int i = 0; i<jml;i++) {
            String pilih = read.next();
            int nomor= 0;
            Node node;
            switch (pilih){
                case "addFront":
                    nomor = read.nextInt();
                    node = new Node(nomor);
                    d.addFront(node);
                    break;
                case"addBack":
                    nomor = read.nextInt();
                    node = new Node(nomor);
                    d.addBack(node);
                    break;
                case"removeFront":
                    d.removeFront();
                    break;
                case"removeBack":
                    d.removeBack();
                    break;
                case"front":
                    System.out.println(d.front());
                    break;
                case"back":
                    System.out.println(d.back());
                    break;
                case"print":
                    d.print();
                    break;
                default:
                    System.out.println("Input Salah");
                    break;
            }
        }
    }
}

class Node {

    public Node(int data) {
        this.data = data;
    }

    int data;
    Node next, prev;

}

class Deque {

    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addFront(Node node) {
        if (isEmpty()) {
            head = tail = node;
            head.next = head.prev = head;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            node.prev = tail;
            tail.next = head;
        }
        size++;
    }

    public void addBack(Node node) {
        if (isEmpty()) {
            head = tail = node;
            head.next = head.prev = head;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
            tail.next = head;
            head.prev = tail;
        }
        size++;
    }


    void removeFront() {
        if(isEmpty()) {
            return;
        }
        if (head.next == head) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
        size--;
    }
    void removeBack() {
        if(isEmpty()) {
            head = null;
            tail = null;
            size--;
        } else {
            Node n = tail;
            tail.prev.next = null;
            tail = n.prev;
            tail.next = head;
            head.prev = tail;
        }
        size--;
    }

    int front() {
        return head.data;
    }

    int back() {
        return tail.data;
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Data is empty!");
            return;
        }
        Node n = head;
        do {
            System.out.print(n.data + " ");
            n = n.next;
        } while (n != head);
    }

}