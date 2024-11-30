package Recursion;

public class SumOfFactorial {
    public int sum(int n){
        if(n == 1){
            return 1;
        }
        return (n * sum(n-1));
    }
    public static void main(String[] args) {
        SumOfFactorial obj = new SumOfFactorial();
        System.out.println(obj.sum(10));
        
    }
}
