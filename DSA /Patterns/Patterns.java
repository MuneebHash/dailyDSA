package Patterns;
public class Patterns {
    
    public void p11(int n){
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
    public void p15(int n){
        char startChar = 'A';
        for (int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print((char) (startChar + j));
    
            }
            System.out.println();
        }
    }
    public void p16(int n){
        char startChar = 'A';
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print((char) (startChar));
            }
            System.out.println();
            startChar ++;
        }
    }
    public void p17(int n){
        char startChar = 'A';
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i ; j++){
                System.out.print((char) (startChar + j));
                //System.out.print((char)(startChar));
            }
            for(int j = i; j > 0; j--){
                System.out.print((char)(startChar + j));
            }
            System.out.println();
        }
    }
    public void p18(int n){
    
        char startChar = (char)(n + 64);
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print((char) (startChar + j));
            }
            System.out.println();
            startChar --;
        }
    }
    public void p19(int n){
        for (int i = n; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= (2*(n-i)); j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < (2*(n-i-1)); j++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
    public void p20(int n){
        for(int i = 0; i < n; i ++){
            for(int j = 0; j <= i; j ++){
                System.out.print("*");
            }
            for (int j = 0; j < (2 * (n - i - 1)); j ++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--){
            for(int j = 0; j <= i; j ++){
                System.out.print("*");
            }
            for (int j = 0; j < (2 * (n - i - 1)); j ++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void p21(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (i == 0 || i == n - 1 || j == 0 || j == n -1 ){
                    System.out.print("*");
                } else System.out.print(" ");
                    
            }
            System.out.println();
        }

    }
    


    public static void main(String[] args) {
        Patterns obj = new Patterns();

        //obj.p11(5);
        //obj.p12(4);
        //obj.p13(4);
        //obj.p14(5);
        //obj.p15(5);
        //obj.p16(5);
        //obj.p17(5);
        //obj.p18(8);
        //obj.p19(5);
        //obj.p20(5);
        obj.p21(5);
    }
}