package ASD_QueueIvan;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class QueuePriority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueuee q = new PriorityQueuee();

        int iterasi = Integer.valueOf(scanner.nextLine());
        int count = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < count; i++) {
            String nama = scanner.nextLine();
            String kasta = scanner.nextLine();


            if(kasta.equals("Ratu") || kasta.equals("ratu")) {
                q.enqueue(nama, 1);
            } else if (kasta.equals("Pejantan") || kasta.equals("pejantan")) {
                q.enqueue(nama, 2);
            } else if (kasta.equals("Pekerja") || kasta.equals("pekerja")) {
                q.enqueue(nama, 3);
            } else if (kasta.equals("Preman") || kasta.equals("preman")){
                q.enqueue(nama, 4);
            }
        }

        String selesaiBAB = "";


        for (int i = 0; i < iterasi-1; i++) {
            String temp = q.dequeue();
            selesaiBAB += temp + " ";
        }

        System.out.println("Semut yang telah selesai BAB: ");
        System.out.println(selesaiBAB);
        System.out.println("");

        String temp = q.dequeue();

        System.out.println("Semut yang sedang BAB: ");
        System.out.println(temp);
        System.out.println("");

        System.out.println("Semut yang kebelet BAB: ");
        q.show();

    }
}
class Nodes {
    String data;
    int PRN;
    Nodes next;
}

class PriorityQueuee {
    Nodes head, front, rear;
    int size = 0;


    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return this.size;
    }


    public void enqueue(String name, int prio) {
        Nodes n = head;
        Nodes node = new Nodes();
        node.data = name;
        node.PRN = prio;
        if (isEmpty()) {
            head = front = rear =  node;
            size++;
            return;
        }
        if (head.PRN > prio) {
            node.next = head;
            head = node;

        } else {
            while (n.next != null && n.next.PRN <= prio) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
        size++;
    }

    public String dequeue() {
        if(isEmpty()) {
            return "";
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
            return "Kosong";
        }
        return this.front.data;
    }

    public String getRear() {
        if(isEmpty()) {
            return "";
        }
        return this.rear.data;
    }

    public void show() {
        if (isEmpty()) {
            return;
        }
        Nodes n = head;
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public String peek() {
        return front.data;
    }
}
