# Stacks in Java

## Characteristics of Stacks
1. **LIFO (Last-In, First-Out)**: The most recently added element is the first to be removed.
2. **Dynamic Size**: Can grow or shrink as elements are added or removed.
3. **Single Access Point**: Operations are performed only at the top of the stack.
4. **Pointer-Based (for Linked Implementations)**: Each element points to the one below it (in linked implementations).
5. **Versatile Usage**: Fundamental in various algorithms and system operations.

---

## How Stacks Work
- **Elements**: Stored in a linear order where insertion and removal follow LIFO.
- **Top Pointer**: Keeps track of the most recently added element.
- **Primary Operations**:
  - **Push**: Add an element to the top of the stack.
  - **Pop**: Remove and return the top element.
  - **Peek/Top**: Retrieve the top element without removing it.
- **Underlying Structure**: Can be implemented using arrays, linked lists, or dynamic data structures like `ArrayList`.

---

## Where/When Stacks Are Used
- **Function Call Management**: Tracking active subroutines in programming languages (call stack).
- **Expression Evaluation**: Parsing expressions (infix to postfix) and evaluating Reverse Polish Notation (RPN).
- **Undo Mechanisms**: Implementing undo features in applications.
- **Syntax Parsing**: Compilers use stacks for syntax checking and parsing.
- **Backtracking Algorithms**: Solving puzzles, mazes, and other backtracking problems.

---

## Complexities of Stack Operations

| Operation | Time Complexity | Explanation                                              |
|-----------|-----------------|----------------------------------------------------------|
| **Push**  | `O(1)`           | Constant time to add an element to the top.              |
| **Pop**   | `O(1)`           | Constant time to remove the top element.                 |
| **Peek**  | `O(1)`           | Constant time to access the top element without removal. |
| **IsEmpty**| `O(1)`          | Constant time to check if the stack is empty.            |
| **Size**  | `O(1)`           | Constant time to retrieve the number of elements.        |

---

## Comparison of Stacks vs Queues

| Feature                | Stacks (LIFO)                        | Queues (FIFO)                       |
|------------------------|--------------------------------------|-------------------------------------|
| **Order of Access**    | Last-In, First-Out                   | First-In, First-Out                 |
| **Primary Operations** | Push, Pop, Peek                      | Enqueue, Dequeue, Front             |
| **Use Cases**          | Function calls, expression parsing   | Task scheduling, buffering          |
| **Underlying Structures** | Arrays, Linked Lists, Deques      | Arrays, Linked Lists, Deques        |
| **Typical Applications** | Undo mechanisms, backtracking      | BFS algorithms, print queue         |

---

# Stacks in Java

## Comparison of Stacks vs Arrays

| Feature                  | Stacks                                   | Arrays                                         |
|--------------------------|------------------------------------------|-----------------------------------------------|
| **Order of Access**      | LIFO                                     | Random access via indices                     |
| **Primary Operations**   | Push, Pop, Peek                          | Access, Insert, Delete at any index            |
| **Underlying Structures**| Linked Lists, Dynamic Arrays, Deques     | Contiguous memory blocks                      |
| **Dynamic Size**         | Yes (if implemented with dynamic structures) | Fixed size (unless using dynamic arrays like `ArrayList`) |
| **Use Cases**            | Function calls, expression evaluation    | General-purpose storage, random access needed |
| **Memory Usage**         | Extra space for pointers (in linked implementations) | Efficient memory usage with contiguous storage |


## FAQ Interview Questions

### 1. What is a stack and how does it work?

**Answer**: A stack is a linear data structure that follows the Last-In, First-Out (LIFO) principle. Elements are added (pushed) to the top of the stack and removed (popped) from the top. It supports operations like push, pop, and peek, allowing access only to the most recently added element.

### 2. How can you implement a stack in Java?

**Answer**: A stack in Java can be implemented using:

- **Built-in `Stack` Class**: Though it's synchronized and considered legacy.
- **`Deque` Interface**: Using classes like `ArrayDeque` or `LinkedList` which provide better performance and are preferred over `Stack`.
- **Custom Implementation**: Using linked lists or dynamic arrays to create a stack from scratch.

### 3. What are the common applications of stacks?

**Answer**: Common applications include:

- Managing function calls (call stack).
- Evaluating expressions and parsing syntax (e.g., Reverse Polish Notation).
- Implementing undo mechanisms in applications.
- Depth-First Search (DFS) in graph algorithms.
- Balancing symbols in code (e.g., parentheses matching).

### 4. What is the difference between a stack and a queue?

**Answer**:

- **Stack** follows LIFO (Last-In, First-Out) where the last element added is the first to be removed.
- **Queue** follows FIFO (First-In, First-Out) where the first element added is the first to be removed.
- **Usage Scenarios**: Stacks are used in scenarios requiring reversal of order, while queues are used in scheduling and buffering tasks.

### 5. How does a stack help in expression evaluation?

**Answer**: In expression evaluation, especially for infix to postfix conversion or evaluating Reverse Polish Notation (RPN), stacks are used to temporarily hold operators and manage the order of operations. They help ensure that operators are applied in the correct precedence and associativity.

### 6. What are the time complexities of stack operations?

**Answer**: All primary stack operations have a time complexity of `O(1)`:

- **Push**: Adding an element to the top.
- **Pop**: Removing the top element.
- **Peek**: Accessing the top element without removal.
- **IsEmpty** and **Size**: Checking if the stack is empty and retrieving the number of elements.

### 7. Why is `Deque` preferred over `Stack` in Java?

**Answer**: The `Deque` interface, implemented by classes like `ArrayDeque` and `LinkedList`, offers more complete and consistent APIs for stack operations. It is not synchronized, providing better performance in single-threaded contexts. Additionally, `Stack` is considered a legacy class and is less versatile compared to `Deque`.

### 8. Can you implement a stack using an array? What are the limitations?

**Answer**: Yes, a stack can be implemented using an array by maintaining an index for the top element. Limitations include:

- **Fixed Size**: The stack has a predetermined capacity, making it less flexible.
- **Resizing Overhead**: To handle dynamic sizes, the array may need to be resized, which involves creating a new array and copying elements, leading to increased time complexity.

Using dynamic structures like `ArrayDeque` or `LinkedList` can overcome these limitations by providing dynamic resizing and efficient memory usage.




---

## Infix, Postfix, and Prefix Notations

| Notation   | Operator Position | Example     | Parentheses Needed |
|------------|-------------------|-------------|--------------------|
| **Infix**  | Between operands  | `A + B`     | Yes                |
| **Postfix**| After operands    | `A B +`     | No                 |
| **Prefix** | Before operands   | `+ A B`     | No                 |

---

### Infix Notation
**Definition**: Infix notation is the most common arithmetic and logical formula notation, where operators are written **between** their operands.

**Example**: A + B


### Postfix Notation (Reverse Polish Notation)
**Definition**: Postfix notation places operators **after** their operands. It eliminates the need for parentheses to define operation precedence.

**Example**: A B +


### Prefix Notation (Polish Notation)
**Definition**: Prefix notation places operators **before** their operands. Like postfix, it does not require parentheses to enforce precedence.

**Example**: + A B

### Operations

Deque<Integer> Stack/Queue[] = new ArrayDeque<>();

# Stack Operations: (lIFO)
- **push(E e)** – Pushes an element to the top of the stack.
- **pop()** – Pops the top element from the stack.
- **peekFirst()** – Views the top element without removing it (peek the stack).
- **removeLast()** – Removes and returns the rear element of the queue.
- **pollLast()** – Removes and returns the rear element, or returns null if the queue is empty.

# Queue Operations:
- 
## Front Operations:
- **addLast(E e)** – Adds an element to the rear of the queue.
- **removeFirst()** – Removes and returns the front element of the queue.
- **peekFirst()** – Views the front element without removing it.
- **pollFirst()** – Removes and returns the front element, or returns null if the queue is empty.

## Rear Operations:
- **addFirst(E e)** – Adds an element to the front of the queue.
- **removeLast()** – Removes and returns the rear element of the queue.
- **peekLast()** – Views the rear element without removing it.
- **pollLast()** – Removes and returns the rear element, or returns null if the queue is empty.

# Common Operations (Used in Both Stack & Queue):
- **isEmpty()** – Checks if the deque is empty.
- **size()** – Returns the number of elements in the deque.
