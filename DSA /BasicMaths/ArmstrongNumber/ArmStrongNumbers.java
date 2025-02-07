package BasicMaths.ArmstrongNumber;
/**
 * Problem: Armstrong Number
 * 
 * LeetCode # 1134
 * Difficulty: Easy.
 * 
 * An Armstrong number (or narcissistic number) for a given number of digits is a number such that the sum of its digits each raised to the power of the number of digits is equal to the number itself.
 *
 * For example:
 *
 * 153 is an Armstrong number because 
 * 1^3 + 5^3 + 3^3 = 153
 *
 * 9474 is an Armstrong number because 
 * 9^4 + 4^4 + 7^4 + 4^4 = 9474
 */


public class ArmStrongNumbers {

    public static boolean numCheck(int a){
            if (a < 0) return false;
    
            int n = a;
            int x = (int) Math.log10(n) + 1;
            int sum = 0;
    
            for(int i = 1; i <= x; i++){
                int remainder = n % 10;
                n /= 10;
                sum += (int)Math.pow(remainder, x);
            }
            return sum == a;
        } 
    
        
        public static void main(String[] args) {
            
            System.out.println(numCheck(154));
    }
    
}
