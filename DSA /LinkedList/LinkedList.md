# Linked Lists in Data Structures

## Characteristics of Linked Lists
1. **Dynamic Size**: The list can grow or shrink during runtime.  
2. **Non-Contiguous Storage**: Nodes are scattered in memory; each holds a reference to the next (and possibly previous) node.  
3. **Pointer/Reference-Based**: Each node has data and one (or two) references—depending on whether it is singly or doubly linked.  
4. **Flexible Insertion/Deletion**: Insert or remove at the head/tail in constant time (`O(1)`) if you have a direct reference.  
5. **Multiple Variants**: Singly, Doubly, and Circular Linked Lists are widely used.

---

## How Linked Lists Work
- **Nodes**: Each node stores data and a reference to the next node (and sometimes the previous node).  
- **Head Pointer**: A reference to the first node (and optionally a tail pointer for faster tail access).  
- **Traversal**: To find a particular node, you typically start at the head and follow references until you reach the node or `null`.

---

## Where/When Linked Lists Are Used
- **Frequent Insertions/Deletions**: Especially when these operations occur at known positions (e.g., head or tail).  
- **Unknown or Changing Size**: Useful when the data set grows/shrinks significantly, avoiding the overhead of array resizing.  
- **Implementing Stacks/Queues**: Linked lists form the backbone of many queue and stack implementations.

---

## Complexities of Linked List Operations

| Operation    | Time Complexity | Explanation                                                       |
|--------------|-----------------|-------------------------------------------------------------------|
| **Access**   | `O(n)`          | Must traverse from head to reach a specific node (no direct index).|
| **Insertion**| `O(1)` *        | Inserting at head/tail, given a direct reference.                  |
| **Deletion** | `O(1)` *        | Deleting head node or a node for which you have a direct reference.|
| **Search**   | `O(n)`          | Requires traversing from the head to find a particular node.       |

> **Note**: Inserting or deleting in the middle without a direct reference requires traversal first, making it `O(n)` overall.

---

## Comparison of Linked Lists vs Arrays

| Feature                | Linked Lists                       | Arrays                           |
|------------------------|------------------------------------|-----------------------------------|
| **Memory Allocation**  | Non-contiguous                     | Contiguous                        |
| **Access Time**        | `O(n)` (Sequential)                | `O(1)` (Index-based)              |
| **Insertion/Deletion** | `O(1)` (If position is known)      | `O(n)` (Requires shifting)        |
| **Dynamic Resizing**   | Supported (grow/shrink at runtime) | Not supported (fixed size)        |
| **Memory Usage**       | Higher (extra pointers)            | More efficient (no extra pointers)|

---

## Representation in Java (Custom Implementation)

### Singly Linked List (Basic Structure)
```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Insert at the head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete from the head
    public void deleteHead() {
        if (head != null) {
            head = head.next;
        }
    }

    // Traverse / Print
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}




# Java LinkedList Guide
## Declaration
```java
import java.util.LinkedList;

// Create a LinkedList of Integers
LinkedList<Integer> list = new LinkedList<>();
```

## Common Operations

### Add Elements
```java
list.add(10);        // Adds at the end
list.addFirst(5);    // Adds at the head
list.addLast(15);    // Adds at the tail
list.add(1, 7);      // Inserts at index 1
```

### Remove Elements
```java
list.remove();       // Removes the first element (head)
list.removeFirst();  // Also removes the first element
list.removeLast();   // Removes the last element
list.remove(1);      // Removes element at index 1
```

### Access Elements
```java
Integer first = list.getFirst();   // Get the first element
Integer last  = list.getLast();    // Get the last element
Integer val   = list.get(2);       // Get element at index 2
```

## Other Utilities
- `list.peek()`: Retrieves but does not remove the head (returns `null` if empty).
- `list.size()`: Returns the number of elements.
- `list.contains(value)`: Checks if a value exists in the list (O(n) time).

## Key Notes

- **Implementation**: `LinkedList` in Java is essentially a Doubly Linked List.
- **Performance**: Efficient at adding/removing from ends; random access by index is O(n).

## Additional Interview Tips

- **Variants**: Know the differences among Singly, Doubly, and Circular Linked Lists, especially their pointer structure.
- **Edge Cases**: Handle empty lists (when `head == null`) and single-element lists properly.
- **Complexities**: Remember insertion/deletion in the middle is O(n) unless you already have a direct reference.
- **Use Cases**: Implementing stacks, queues, and caches (e.g., an LRU Cache with a doubly linked list + hashing).
- **Drawbacks**: No random access and extra overhead for pointers compared to arrays.
