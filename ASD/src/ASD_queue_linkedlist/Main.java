package ASD_queue_linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList queue = new LinkedList();

        queue.enqueue("F");
        queue.enqueue("I");
        queue.enqueue("L");
        queue.print();
        queue.dequeue();
        queue.print();

    }
}

class Node {

    Object data;
    Node next;

    Node(Object data) {
        this.data = data;
    }

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {

    Node head, tail;
    int size = 0;

    LinkedList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void enqueue(Object obj) {
        Node current = new Node(obj);
        if (this.isEmpty()) {
            head = tail = current;
        } else {
            tail.next = current;
            tail = current;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("DATA TIDAK DITEMUKAN");
            return;
        }

        Node temp = head;
        head = temp.next;
        temp.next = null;
        size--;
    }

    Object getFront() {
        return head.data;
    }

    Object getFrontAndDequeue() {
        if (isEmpty()) {
            System.out.println("DATA TIDAK DITEMUKAN");
            return null;
        }

        Node temp = head;
        head = temp.next;
        temp.next = null;
        size--;
        return head;
    }

    public void print() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println("");
    }

}

