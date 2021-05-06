package ASD_DoubleLinkedList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Double_Linked_List {
    public static void main(String[] args) throws IOException {
        // Jangan Merubah Main Method
        CircularDoubleLinkedList cdll = new CircularDoubleLinkedList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int jumlah = Integer.parseInt(reader.readLine());
        String[] perintah = reader.readLine().split(" ");
        String[] data = reader.readLine().split(" ");
        int temp = 0;
        for (int i = 0; i < jumlah; i++) {
            if (perintah[i].equalsIgnoreCase("addFirst")) {
                cdll.addFirst(new Node(Integer.parseInt(data[temp])));
                temp++;

            } else if (perintah[i].equalsIgnoreCase("addLast")) {
                cdll.addLast(new Node(Integer.parseInt(data[temp])));
                temp++;
            }else if (perintah[i].equalsIgnoreCase("removeFirst")) {
                cdll.removeFirst();
            }else if (perintah[i].equalsIgnoreCase("removeLast")) {
                cdll.removeLast();
            }else if (perintah[i].equalsIgnoreCase("insertAfter")) {
                cdll.insertAfter(Integer.parseInt(data[temp+1]),new Node(Integer.parseInt(data[temp])));
                temp++;
                temp++;
            }else{
                cdll.insertBefore(Integer.parseInt(data[temp+1]),new Node(Integer.parseInt(data[temp])));
                temp++;
                temp++;
            }
        }
        cdll.print();
        System.out.println("");
        cdll.printReverse();
    }
}

class Node {

    public Node(int data) {
        this.data = data;
    }

    int data;
    Node next,prev;

}

class CircularDoubleLinkedList {

    Node head;
    Node tail;
    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(Node input) {
        if (isEmpty()) {
            //Isi Kode
            head = input;
            tail = input;
            head.next = head.prev = head;
        } else {
            //Isi Kode
            input.next = head;
            head.prev = input;
            head = input;
            head.prev = tail;
            tail.next = head;
        }
        size++;
    }

    public void addLast(Node input) {
        if (isEmpty()) {
            //Isi Kode
            head = input;
            tail = input;
            head.next = head.prev = head;
        } else {
            //Isi Kode
            input.prev = tail;
            tail.next = input;
            tail = input;
            tail.next = head;
            head.prev = input;
        }
        size++;
    }

    void insertAfter(int key,Node input){
        //Isi Kode
        Node tambah = head;
        int i = 0;
        while(i < size){
            if (isEmpty()) {
                return;
            }
            if (key == tail.data) {
                addLast(input);
                return;
            }
            if (tambah.data == key) {
                input.next = tambah.next;
                input.prev = tambah;
                tambah.next.prev = input;
                tambah.next = input;
                size++;
                return;
            }
            tambah = tambah.next;
            i++;
        }

    }


    void insertBefore(int key,Node input) {
        //Isi Kode
        Node tambah = head;
        int i = 0;
        while(i <size){
            if (isEmpty()) {
                return;
            }
            if (key == head.data) {
                addFirst(input);
                return;
            }
            if (tambah.next.data == key) {
                input.next = tambah.next;
                input.prev = tambah;
                tambah.next.prev = input;
                tambah.next = input;
                size++;
                return;
            }
            tambah = tambah.next;
            i++;
        }
    }


    void removeFirst(){
        //Isi Kode
        Node remove = head;
        if (!isEmpty()){
            if (head == tail){
                head = null;
                tail = null;
            }

            else {
                head.next.prev = null;
                head = remove.next;
                head.prev  = tail;
                tail.next = head;
            } size--;
        }
        else
            System.out.println("Data is empty!");
    }

    void removeLast(){
        //Isi Kode
        Node remove = tail;
        if (!isEmpty()){
            if (tail == head){
                head = null;
                tail = null;
            }
            else {
                tail.prev.next = null;
                tail=remove.prev;
                tail.next = head;
                head.prev = tail;
            } size--;
        }
        else System.out.println("Data is empty!");
    }

    public void print() {
        //Isi Kode
        if(isEmpty()){
            return;
        }
        Node print = head;
        do{
            System.out.print(print.data +" ");
            print = print.next;
        }while(print != head);
    }

    public void printReverse() {
        //Isi Kode
        Node print = tail;
        do{
            System.out.print(print.data +" ");
            print = print.prev;
        }while(print != tail);
        System.out.println();
    }
}
