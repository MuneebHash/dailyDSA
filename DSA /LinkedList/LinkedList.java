package LinkedList;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node next;
    
    Node(int data){  /* Constructor of the Node Class */
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    static Node head; /* Instance Variable */
        
        public void addNode(int newData){
            if (head == null){
                head = new Node(newData);
            } else {
                Node curNode = head;
                while (curNode.next != null) {
                   curNode = curNode.next;
                }
                curNode.next = new Node(newData);
            }
        }
        public Node reverseList(Node head){
    
           Node prev = null;
           Node current = head;
           Node nextNode = null;
    
           while(current.next != null){
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
           }
           head = prev;
           return head;
        }
    
    
        public static void main(String[] args) {
            LinkedList obj = new LinkedList();
    
            /* Populating the LinkedList */
            for (int i = 0; i <= 50; i+=10){
                obj.addNode(i);
            }
    
            System.out.println();
        
        

    }
}


