package StarPatterns;
public class Patterns {

    public void p1(int n){
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void p2(int n){
        // *
        // **
        // ***
        // ****
        // *****
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
    public void p3(int n){
        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        for (int i = 1 ; i <= n ;i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public void p4(int x){
        // 1 
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5
        for (int i = 1 ; i <= x ;i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public void p5(int x){
        // *****
        // ****
        // ***
        // **
        // *
        for(int i = x; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void p6(int n){
        // 1 2 3 4 5 
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        for (int i = n ; i > 0 ;i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public void p7(int n){
        //      *    
        //     ***
        //    *****
        //   *******
        //  *********
        for (int i = 0; i < n; i++){
            for (int j = 0; j < (n - i - 1); j++){
                System.out.print(" ");
            }
            for (int j = 0; j < ((2*i) +1); j++){
                System.out.print("*");
            }
            for (int j = 0; j < (n - i - 1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    public void p8(int n){
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        for (int i = n -1; i >= 0; i--){
            for (int j = 0; j < (n - i - 1); j++){
                System.out.print(" ");
            }
            for (int j = 0; j < ((2*i) +1) ; j++){
                System.out.print("*");
            }
            for (int j = 0; j < (n - i - 1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void p9(int n){
        //      *    
        //     ***
        //    *****
        //   *******
        //  *********
         // *********
         //  *******
         //   *****
         //    ***
         //     *
         for (int i = 0; i < n; i++){
            for (int j = 0; j < (n - i - 1); j++){
                System.out.print(" ");
            }
            for (int j = 0; j < ((2*i) +1); j++){
                System.out.print("*");
            }
            for (int j = 0; j < (n - i - 1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n -1; i >= 0; i--){
            for (int j = 0; j < (n - i - 1); j++){
                System.out.print(" ");
            }
            for (int j = 0; j < ((2*i) +1) ; j++){
                System.out.print("*");
            }
            for (int j = 0; j < (n - i - 1); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void p10(int n){
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = n-1; i >= 0; i--){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i = 0; i < 2*n-1; i++){
            int stars = i+1;
            if (i >= n){
                stars = 2*n-i-1;
            }
            for (int j = 0; j < stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    public void p11(int n){
        // 1
        // 01
        // 101
        // 0101
        // 10101
        for(int i = 1; i <= n; i++){
            int start = 0;
            if(i % 2 != 0){
                start = 1;
            }
            for(int j = 1; j <= i; j++){
                System.out.print(start);
                start = (start == 0) ? 1 : 0;   
            }
            System.out.println();
        }
    }
    public void p12(int n){
        // 1        1
        // 12      21
        // 123    321
        // 1234  4321
        // 1234554321
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
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
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
        // A
        // AB
        // ABC
        // ABCD
        // ABCDE
        char startChar = 'A';
        for (int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((char) (startChar + j));
    
            }
            System.out.println();
        }
    }
    public void p15(int n){
        // ABCDE
        // ABCD
        // ABC
        // AB
        // A
        char startChar = 'A';
        for (int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print((char) (startChar + j));
            }
            System.out.println();
        }
    }
    public void p16(int n){
        // A
        // BB
        // CCC
        // DDDD
        // EEEEE
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
        //      A
        //     ABA
        //    ABCBA
        //   ABCDCBA
        char startChar = 'A';
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i ; j++){
                System.out.print((char) (startChar + j));
                //System.out.print((char)(startChar));
            }
            for(int j = i-1; j >= 0; j--){
                System.out.print((char)(startChar + j));
            }
          
            System.out.println();
        }
    }
    public void p18(int n){
        // H
        // GH
        // FGH
        // EFGH
        // DEFGH
        // CDEFGH
        // BCDEFGH
        // ABCDEFGH
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
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
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
        // *      *
        // **    **
        // ***  ***
        // ********
        // ***  ***
        // **    **
        // *      *
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
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (i == 0 || i == n - 1 || j == 0 || j == n -1 ){
                    System.out.print("*");
                } else System.out.print(" ");
                    
            }
            System.out.println();
        }

    }
    public void p22(int n){
        // 4444444
        // 4333334
        // 4322234
        // 4321234
        // 4322234
        // 4333334
        // 4444444
        for(int i = 0; i < (2*n) - 1; i++){
            for(int j = 0; j < (2*n) - 1; j++){
                int right = 2*n - 2 - j;
                int left = j;
                int top = i;
                int bottom = 2*n - 2 - i;

                int printVal = n - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(printVal);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Patterns obj = new Patterns();

        //obj.p1(5);
        //obj.p2(5);
        //obj.p3(5);
        //obj.p4(5);
        //obj.p5(5);
        //obj.p6(5);
        //obj.p7(5);
        //obj.p8(5);
        //obj.p9(5);
        //obj.p10(5);
        //obj.p11(5);
        //obj.p12(4);
        //obj.p13(4);
        //obj.p14(5);
        //obj.p15(5);
        //obj.p16(5);
        //obj.p17(5);
        //obj.p18(8);
        obj.p19(5);
        //obj.p20(5);
        //obj.p21(5);
        //obj.p22(4);
    }
}