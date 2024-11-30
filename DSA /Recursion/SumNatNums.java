package Recursion;

public class SumNatNums {
    public int sum(int n){
        if (n <= 0){
            return 0;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        SumNatNums nums = new SumNatNums();
        System.out.println(nums.sum(5));
    }
    
}
