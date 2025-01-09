package Strings.LeetCode;

public class LongestPrefixInAString {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        int index = 0;
        boolean found = true;
        while (index < strs[0].length()){
            char prefix = strs[0].charAt(index);
            for(int i = 1; i< strs.length; i++){
                if (prefix != strs[i].charAt(index)){
                    found = false;
                    break;
                }
            }
            if (!found){
                if (index >=0 ){
                    return strs[0].substring(0, index);
                } else {
                    return "";
                }
            } else {
                index++;
            }
        }
        return strs[0].substring(0, index+1);
    }

    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};

        LongestPrefixInAString obj = new LongestPrefixInAString();

        System.out.println(obj.longestCommonPrefix(strs));;
    }
}
