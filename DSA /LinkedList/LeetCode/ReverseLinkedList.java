package LinkedList.LeetCode;
/* 
 * LeetCode Question #206
 * Difficulty : Easy.
*/

/* Definition for singly-linked list*/
class Node {
    int val;
    Node next;

    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}
/* Main Class */
public class ReverseLinkedList {

     public Node reverseList(Node head) {
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
        
    }
}