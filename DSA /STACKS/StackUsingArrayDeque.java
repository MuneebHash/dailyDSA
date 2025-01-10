package STACKS;

/* Implementation */

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}