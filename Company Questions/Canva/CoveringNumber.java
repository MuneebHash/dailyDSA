package Canva;

/**
 * Canva Interview Question: Covering Numbers
 *
 * A number is considered a covering number if it contains 
 * all digits from 1 to n at least once, where n is the count of 
 * unique non-zero digits in the number.
 *
 * Output Rules:
 * - If the number is a covering number, return the count of zeroes in it as a positive integer.
 * - If the number is NOT a covering number, return -1.
 *
 * Example Cases:
 * ✅ Input: 2143      → Output: 0  (Contains {1,2,3,4}, covering all required numbers)
 * ✅ Input: 103245    → Output: 1  (Contains {1,2,3,4,5}, covering all required numbers, 1 zero)
 * ❌ Input: 20010053  → Output: -1 (Missing `4` in {1,2,3,4,5})
 *
 * Approach:
 * 1. Extract digits and count zeroes.
 * 2. Determine `n` (unique non-zero digits).
 * 3. Check if all digits from `1` to `n` exist in the number.
 * 4. Return zero count if valid, else return `-1`.
 *
 * Time Complexity: O(log n)  (Iterate through digits)
 * Space Complexity: O(1)  (Fixed array for digit tracking)
 */

public class CoveringNumber {
    public int checkCovering(int number){

        int[] digits = new int[10];
        int count = 0;
        
        while (number != 0){
            int digit = number % 10;
            if(digit != 0){
                count ++;
            }
            digits[digit]++;
            number = number / 10;
        }
        for(int i = 1; i <= count; i++){
            if(digits[i] != 1){
                return -1;
            }
        }
        return digits[0];
    }

    public static void main(String[] args) {
        CoveringNumber cm = new CoveringNumber();
        // System.out.println(cm.checkCovering(1423));       // ✅ Output: 0
        // System.out.println(cm.checkCovering(12346500));   // ✅ Output: 2
        // System.out.println(cm.checkCovering(2001053));    // ✅ Output: -1
        System.out.println(cm.checkCovering(12345));    
    }
}
