package Recursion;

class Print1toN {

    public void printNos(int n) {
        // Your code here
        if (n <=0){
            return;
        }
        printNos(n -1);
        System.out.print(n);
    }



    public static void main(String[] args) {
        Print1toN obj = new Print1toN();
        obj.printNos(10);
    }
}