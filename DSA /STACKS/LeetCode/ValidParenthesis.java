package STACKS.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

/* 
 * LeetCode Question #20.
 * Difficulty : Easy.
*/

public class ValidParenthesis {
    
    // Method to check if the parentheses in the string are valid
    public boolean isValid(String s) {
        int length = s.length();
        Deque<Character> stack = new ArrayDeque<>(length);

        for(int i = 0; i < length; i++){
            char current = s.charAt(i);
            // If it's an opening bracket, push onto stack
            if(current == '(' || current == '[' || current == '{'){
                stack.push(current);
            }
            else{
                // If stack is empty when expecting to pop, it's invalid
                if(stack.isEmpty()) return false;
                char last = stack.pop();
                // Check for matching pairs
                if((current == ')' && last != '(') || 
                   (current == ']' && last != '[') ||
                   (current == '}' && last != '{')){
                    return false;
                }
            }
        }
        // If stack is empty at the end, all brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();

        // Array of test cases
        String[] testCases = {
            "()",        // Valid
            "()[]{}",    // Valid
            "(]",        // Invalid
            "([)]",      // Invalid
            "{[]}",      // Valid
            "",          // Valid (empty string)
            "(((((",     // Invalid
            "{[()()]}",  // Valid
            "}{",        // Invalid
            "([{}])"     // Valid
        };

        // Testing each case
        for(String test : testCases){
            boolean result = vp.isValid(test);
            System.out.println("Input: \"" + test + "\" -> " + result);
        }
    }
}
