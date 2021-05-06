
package asd_queue;

class Node {

    Object data;
    Node next;

    Node() {
    }

    Node(Object data) {
        this.data = data;
    }

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class QueueLinkedList {

    Node head, tail;
    int size = 0;

    QueueLinkedList() {
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
//            current.next = null;
            tail.next = current;
            tail = current;
        }
        size++;
    }

    void dequeue() { //removeFirst
        if (isEmpty()) {
            System.out.println("DATA TIDAK DITEMUKAN");
            return;
        }

        if (size == 1) {
            head = tail = null;
            size--;
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
        
        return head.data;
    }
    
    Object peekbyIndex(int idx) {
        Node temp = head;
        int index = 0;
        while (idx != index) {
            index++;
            temp = temp.next;
        }
        return temp.data;
    }

    int getIndex(Object search) {
        Node temp = head;
        int idx = 0;
        while (temp.data != search) {
            idx++;
            temp = temp.next;
        }

        return idx;
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
