package STACKS;

/* Implementation with Linked List */

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    public Node head;
    public void push(int value){
        if (head == null){
            head = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = this.head;
            head = newNode;
        }
    }
    public int pop(){
        if(!isEmpty()){
            int value = this.head.data;
            head = this.head.next;
            return value;
        }
        throw new java.util.NoSuchElementException("Stack is empty");
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
