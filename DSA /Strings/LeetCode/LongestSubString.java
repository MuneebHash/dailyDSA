package Strings.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/* 
 * LeetCode Question #3
 * Difficulty : Medium.
*/

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        int maxlength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++){
            char currentChar = s.charAt(end);
            if(lastIndex[currentChar] >= start){
                start = lastIndex[currentChar] + 1;
            }
            lastIndex[currentChar] = end;
            maxlength = Math.max(maxlength, end - start + 1);

        }
        return maxlength;
    }
    public int lengthOfLongestSubstringUsingHashmap(String s) {
         HashMap<Character, Integer> map = new HashMap<>();
        int maxlength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++){
            char currentChar = s.charAt(end);
            if ( map.containsKey(currentChar)){
                if (map.get(currentChar) >= start){
                    start = map.get(currentChar) + 1;
                }
            }
            map.put(currentChar, end);
            maxlength = Math.max(maxlength, end - start + 1);
        }
        return maxlength;
    }
    public static void main(String[] args) {
        
    }
}
