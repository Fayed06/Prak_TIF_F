package ASD_SingleLinkedList;

import java.util.Scanner;

public class Node {

    Node head;
    Node next;
    int data;

    public void addFirst(int name) {
        Node n = new Node();
        n.data = name;
        n.next = null;

        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            head = n;
            head.next = temp;
        }
    }

    public void addLast(int name) {
        Node node = new Node();
        node.data = name;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void print() {
        Node node = head;
        if(head == null) {
            System.out.println("Data Kosong");
        } else {
            while (node.next != null) {
                System.out.print(node.data);
                System.out.print(" ");
                node = node.next;
            }
            System.out.print(node.data);
        }

    }

    public void insertBefore(int baru, int before) {
        Node node = new Node();
        node.data = baru;
        node.next = null;

        int i = 0;

        Node last = new Node();
        Node n = head;
        while (n.next != null) {
            if(i==0) {
                if (n.data == before) {
                    addFirst(baru);
                }
            }
            if (n.next.data == before) {

                last = n.next;
                n.next = node;
                n.next.next = last;
            }
            n = n.next;
            i++;
        }
    }

    public void insertAfter(int baru, int after) {
        Node node = new Node();
        node.data = baru;
        node.next = null;

        Node last = new Node();
        Node n = head;
        while (n.next != null) {
            if (n.data == after) {
                last = n.next;
                n.next = node;
                n.next.next = last;
            }
            n = n.next;
        }
    }

    public void removeFirst() {
        head = head.next;

    }

    public void removeLast() {
        Node n = head;
        while (n.next.next != null) {
            n = n.next;
        }
        n.next = null;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node node = new Node();

        int input = Integer.valueOf(scanner.nextLine());


        String perintah = scanner.nextLine();


        String inputData = scanner.nextLine();


        String[] peri = perintah.split(" ");
        String[] data = inputData.split(" ");

        int i = 0;

        for (int x = 0; x < input; x++) {
            if (peri[x].equals("addFirst")) {
                node.addFirst(Integer.valueOf(data[i]));
            } else if (peri[x].equals("addLast")) {
                node.addLast(Integer.valueOf(data[i]));
            } else if (peri[x].equals("removeFirst")) {
                node.removeFirst();
                i--;
            } else if (peri[x].equals("removeLast")) {
                node.removeLast();
            } else if (peri[x].equals("insertAfter")) {
                node.insertAfter(Integer.valueOf(data[i]), Integer.valueOf(data[i + 1]));
                i++;

            } else if (peri[x].equals("insertBefore")) {
                node.insertBefore(Integer.valueOf(data[i]), Integer.valueOf(data[i + 1]));
                i++;

            } else if (peri[x].equals("addfirst")) {
                node.addFirst(Integer.valueOf(data[i]));
            }
            i++;
        }

        node.print();

    }
}

