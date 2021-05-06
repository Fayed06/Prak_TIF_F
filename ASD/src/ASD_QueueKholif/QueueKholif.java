package ASD_QueueKholif;
import java.io.*;
import java.util.*;

public class QueueKholif {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int iterations = in.nextInt();
        int ants = in.nextInt();
        in.nextLine();
        QueueLinkedList queue = new QueueLinkedList();

        for (int i = 0; i < ants; i++) {
            String name = in.nextLine();
            String caste = in.nextLine();
            int castenum = 0;
            switch (caste) {
                case "ratu": castenum = 1;
                    break;
                case "pejantan": castenum = 2;
                    break;
                case "pekerja": castenum = 3;
                    break;
                case "preman": castenum = 4;
            }
            queue.enqueue(name, castenum);
        }

        Object[] antfix = new Object[ants];
        antfix = queue.process(antfix);

        System.out.println("Semut yang telah selesai BAB:");
        for (int i = 0; i < iterations-1; i++) {
            System.out.print(antfix[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Semut yang sedang BAB:");
        System.out.println(antfix[iterations-1]);
        System.out.println();

        System.out.println("Semut yang kebelet BAB:");
        for (int i = iterations; i < ants; i++) {
            System.out.print(antfix[i] + " ");
        }
    }
}

class Node {
    Node next;
    Node prev;
    Object data;
    int priority;

    public Node(){
    }

    public Node(Object data){
        this.data = data;
    }

    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(Object data, Node next, Node prev) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public Node(Object data, int priority){
        this.data = data;
        this.priority = priority;

    }
}

class QueueLinkedList {
    int size = 0;
    Node head = null;
    Node tail = null;
    Node front = null;
    Node rear = null;

    boolean isEmpty() {
        return rear == null;
    }

    int size() {
        return this.size;
    }


    public void enqueue(Object add, int priority) {
        Node input = new Node(add, priority);
        addLast(input);
        front = head;
        rear = tail;
    }

    public void addLast(Node input) {
        if (isEmpty()) {
            head = tail = input;
            size++;
            return;
        }
        input.prev = tail;
        tail.next = input;
        tail = input;
        size++;
    }

    public Object dequeue() {
        if (!isEmpty()) {
            front = head;
            Object temp = "Kosong";
            int flag = 0;
            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < size(); j++) {
                    if (front.priority == i) {
                        temp = front.data;
                        flag++;
                    }
                    if (flag!=0) {
                        break;
                    }
                    front = front.next;
                }
                front = head;
                if (flag!=0) {
                    break;
                }
            }
            removeFirst();
            front = head;
            return temp;
        } else {
            System.out.println("Queue Empty");
            return -1;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("not found");
        }
        if (head == tail) {
            head = tail = front = rear = null;
        }
        front = head;
        int flag = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < size(); j++) {
                if(front.priority == i) {
                    Node temp = front;
                    front.next.prev = null;
                    temp = temp.next;
                    front = temp;
                    temp = null;
                    size--;
                    flag++;
                }
                if (flag!=0) {
                    break;
                }
                front = front.next;
            }
            front = head;
            if (flag!=0) {
                break;
            }
        }
    }

    public Object peek() {
        return front.data;
    }

    public Object[] process(Object[] thing) {
        if (isEmpty()) {
            System.out.println("Data Kosong");
            return thing;
        }
        front = head;
        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < size(); j++) {
                if (front.priority == i) {
                    thing[count] = front.data;
                    count++;
                }
                front = front.next;
            }
            front = head;
        }
        return thing;
    }
}