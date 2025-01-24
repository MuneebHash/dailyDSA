package BasicMaths;

/*
 * LeetCode Question : 7
 * Difficulty: Medium.
 */

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        int y = x;
        while(y != 0){
            int digit = y % 10;
            rev = (rev*10) + digit;
            // Overflow/underflow checks
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow
            }
            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow
            }
            y = y / 10;
        }
        return rev;
    }    
    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        
        System.out.println(obj.reverse(-189));
    }
}
