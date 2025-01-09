package Strings.LeetCode;

/* 
 * LeetCode Question #5
 * Difficulty : Medium.
*/

public class LongestPalindromicSubstring {

    static int resultLength = 0;
    static int resultStart = 0;
    static int strLen = 0;

    static String longestPalindrome(String s){
        // Check for edge cases.
        strLen = s.length();
        if(strLen < 2){
            return s;
        }
        for(int start = 0; start < strLen; start++){
            checkPalindrome(s, start, start);
            checkPalindrome(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }
    static void checkPalindrome(String s, int begin, int end){
        while (begin >= 0 && end < strLen && (s.charAt(begin) == s.charAt(end))) {
            begin --;
            end ++;
        }
        if(resultLength < end - begin -1){
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }
      
    public static void main(String[] args) {
        String str = "babad";
        System.out.println(LongestPalindromicSubstring.longestPalindrome(str));

    }
    
}
