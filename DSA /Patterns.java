public class Patterns {
    
    public void  p11(int n){
        for (int i = 0; i < n; i++){
            int start = 0;
            if (i % 2 == 0){
                start = 1;
            }
            for (int j = 0; j < i; j++){
                System.out.print(start);
                start = (start == 0) ? 1 : 0;         
            }
            System.out.println();   
        }
    }
    public static void main(String[] args) {
        Patterns obj = new Patterns();


        obj.p11(5);

        
        
    }
}