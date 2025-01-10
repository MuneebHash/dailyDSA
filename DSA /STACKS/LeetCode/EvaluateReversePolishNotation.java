package STACKS.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

/* 
 * LeetCode Question #150.
 * Difficulty : Medium.
*/

public class EvaluateReversePolishNotation {
    
    public int evalRPN(String[] tokens) {
        // Initialize a stack to store operands
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            // Check if the token is an operator
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Pop the top two operands from the stack
                int a = stack.pop();
                int b = stack.pop();

                int result = 0;

                // Perform the operation based on the operator
                switch (token) {
                    case "+":
                        result = b + a;
                        break;
                    case "-":
                        result = b - a;
                        break;
                    case "*":
                        result = b * a;
                        break;
                    case "/":
                        // Handle division, ensure truncation towards zero
                        result = b / a;
                        break;
                }
                // Push the result back onto the stack
                stack.push(result);
            } else {
                // Token is a number, parse and push onto the stack
                stack.push(Integer.parseInt(token));
            }
        }
        // The final result is the only element left in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotation erpn = new EvaluateReversePolishNotation();

        // Array of test cases with expected results
        String[][] testCases = {
            {"2", "1", "+", "3", "*"},              // (2 + 1) * 3 = 9
            {"4", "13", "5", "/", "+"},             // 4 + (13 / 5) = 6
            {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}, // Complex expression
            {"3", "-4", "+"},                       // 3 + (-4) = -1
            {"5"},                                  // Single number
            {"2", "3", "+", "5", "*", "7", "+"},    // (2 + 3) * 5 + 7 = 32
            {"4", "2", "/", "3", "-"}               // (4 / 2) - 3 = -1
        };

        // Expected results corresponding to the test cases
        int[] expectedResults = {9, 6, 22, -1, 5, 32, -1};

        // Testing each case
        for(int i = 0; i < testCases.length; i++){
            String[] test = testCases[i];
            int expected = expectedResults[i];
            int result = erpn.evalRPN(test);
            System.out.println("Test Case " + (i+1) + ": " + arrayToString(test) + " -> " + result + " (Expected: " + expected + ")");
        }
    }

    // Helper method to convert array to string for display
    private static String arrayToString(String[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<array.length; i++) {
            sb.append("\"").append(array[i]).append("\"");
            if(i < array.length -1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
