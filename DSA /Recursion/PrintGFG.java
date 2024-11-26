package Recursion;

class PrintGFG {

    void printGfg(int N) {
        // code here
        if(N <= 0){
            return;
        }
        printGfg(N - 1);
        System.out.print("GFG ");
    }



    public static void main(String[] args) {
        PrintGFG obj = new PrintGFG();
        obj.printGfg(10);
    }
}