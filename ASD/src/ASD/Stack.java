/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASD;

/**
 *
 * @author ASUS
 */
public class Stack {
    Node head;
    
    class Node {
        Node next;
        String data;
    }
    
    public void push(String value) {
        Node node = new Node();
        node.data = value;
        
        if(head == null) {
            this.head = node;
        } else {
            Node n = search();
            n.next = node;
        }
    }
    
    public String peek() {
        return search().data;
    }
    
    public String pop() {
        Node n = head;        
        String tampung;
        
        if(head.next == null) {
            tampung = head.data;
            head = null;
            return tampung;
        } else {
            while(n.next.next != null) {
                n = n.next;
            }
            tampung = n.next.data;
            n.next = null;
            return tampung;
        }    
    }
    
    public void print() {
        Node n = head;
        
        while(n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }
    
    Node search() {
        Node n = head;
        
        while(n.next != null) {
            n = n.next;
        }        
        return n; 
    }
}
