package Strings.LeetCode;

public class FirstOccurence {

    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            char first = needle.charAt(0);
            if (haystack.charAt(i) == first){
                int j = 1;
                while(j < needle.length() && haystack.charAt(i + j) == needle.charAt(j)){
                    j++;
                }
                if(j == needle.length()){
                    return i;
                }
            }  
        }
        return -1;
    }   

    public static void main(String[] args) {
        FirstOccurence obj = new FirstOccurence();

        String s = "a";
        String q = "a";

        System.out.println(obj.strStr(s, q));
    }
}
