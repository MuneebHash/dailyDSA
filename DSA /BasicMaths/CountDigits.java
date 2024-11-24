package BasicMaths;

public class CountDigits {
    
    public int evenlyDivides(int n){
        int count = 0;
        String numString = String.valueOf(n);
        int length = numString.length();

        for(int i = 0; i < length; i++){
            if (numString.charAt(i) != '0'){
                if (n % Character.getNumericValue(numString.charAt(i)) == 0){
                    count ++;
                }
            }
        }
        return count;
    }

    public int evenlyDivides2(int n){
        int count = 0;
        int y = n;
        while (y > 0) {
            int x = y % 10;
            if(x !=0 && n % x == 0 ){
                count ++;
            }
            y = y/10;
        }
        return count;
    }
    
    public static void main(String[] args) {
        
        CountDigits obj = new CountDigits();
        System.out.println(obj.evenlyDivides2(12));
    
    }
}
