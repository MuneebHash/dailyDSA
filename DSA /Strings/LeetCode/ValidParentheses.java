package Strings.LeetCode;

public class ValidParentheses {

    public boolean isValid(String s) {
        String openBrackets = "";
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                openBrackets += c; // Add opening brackets
            } else {
                if (openBrackets.isEmpty()) return false; // No matching open bracket
                char last = openBrackets.charAt(openBrackets.length() - 1);
                if ((c == ')' && last != '(') || 
                    (c == '}' && last != '{') || 
                    (c == ']' && last != '[')) {
                    return false; // Mismatched closing bracket
                }
                openBrackets = openBrackets.substring(0, openBrackets.length() - 1); // Remove last bracket
            }
        }
        return openBrackets.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        //String s = "([)]";
        String q = "()[]{}";

        System.out.println(obj.isValid(q));
    }
}
