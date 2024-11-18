public class Patterns {
    
    public void  p11(int n){
        for (int i = 0; i < n; i++){
            int start = 0;
            if (i % 2 == 0){
                start = 1;
            }
            for (int j = 0; j <= i; j++){
                System.out.print(start);
                start = (start == 0) ? 1 : 0;         
            }
            System.out.println();   
        }
    }

    public void p12(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for (int k = 1; k <=2*(n -i);k++){
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public void p13(int n){
        int start = 1;
        for (int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(start + " ");
                start ++;
            }
            System.out.println();
        }
    }

    public void p14(int n){
        char startChar = 'A';
        for (int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((char) (startChar + j));
    
            }
            System.out.println();
        }
    }
          
    public static void main(String[] args) {
        Patterns obj = new Patterns();

        //obj.p11(5);
        //obj.p12(4);
        obj.p14(5);


        
    }
}