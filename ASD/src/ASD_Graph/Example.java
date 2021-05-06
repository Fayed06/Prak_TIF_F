package ASD_Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Example {
    private class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node []node;
    private int JNode;

    public Example(int jml) {
        JNode = jml;
        node = new Node[JNode];
    }

    public void addAdj (int head, int adj) {
        Node n = new Node(adj,node[head]);
        node[head]=n;
    }

    public void print(String input) {
        System.out.println(input);
        for (int i = 0; i < JNode ; i++) {
            System.out.print("[" + i + "]");
            Node n = node[i];
            while (n!=null){
                System.out.print("=>"+n.getData());
                n = n.getNext();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Example g = new Example (5);
        g.addAdj(0,3);
        g.addAdj(0,1);
        g.addAdj(1,4);
        g.addAdj(1,2);
        g.addAdj(2,4);
        g.addAdj(2,1);
        g.addAdj(4,3);
        g.print("Hasil : ");
    }
}

