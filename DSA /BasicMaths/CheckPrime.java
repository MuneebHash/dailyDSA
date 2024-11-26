package BasicMaths;

public class CheckPrime {
    public Boolean Prime(int n){
        int count = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                count++;
                if(n/i != i){
                    count ++;
                }
            }
        }
        if (count == 2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        CheckPrime p = new CheckPrime();
        System.out.println(p.Prime(7));
    }   
}
