package praktikumqueue;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int banyakBAB= read.nextInt();
        int banyaksemut = read.nextInt();
        for (int i = 0; i < banyaksemut ; i++) {
            String nama = read.nextLine();
            String kasta = read.nextLine();
            switch (kasta){
                case "ratu":
                    break;
                case "pejantan":

                    break;
                case "pekerja":

                    break;
                case "preman":
                    break;
            }
        }
    }
}

class Node {
    String data;
    int PRN;
    Node next;
}

class PriorityQueuee {
    Node head, front, rear;
    int size = 0;


    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return this.size;
    }


    public void enqueue(String name, int prio) {
        Node n = head;
        Node node = new Node();
        node.data = name;
        node.PRN = prio;
        if (isEmpty()) {
            head = front = rear =  node;
            size++;
            return;
        }
        if (head.PRN > prio) {
            node.next = head;

        } else {
            while (n.next != null && n.next.PRN < prio) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
        size++;
    }

    public String dequeue() {
        if(isEmpty()) {
            String output = "DATA TIDAK DITEMUKAN";
            return output ;
        }
        String temp = head.data;
        if (size == 1) {
            head = null;
        } else if(size > 1) {
            head = head.next;
            front = head;
        }
        size--;
        return temp;
    }

    public String getFront() {
        if(isEmpty()) {
            String output = "DATA TIDAK DITEMUKAN";
            return output ;
        }
        return this.front.data;
    }

    public String getRear() {
        if(isEmpty()) {
            String output = "DATA TIDAK DITEMUKAN";
            return output ;
        }
        return this.rear.data;
    }
    public String peek() {
        return front.data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("DATA TIDAK DITEMUKAN");
            return;
        }
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

}
