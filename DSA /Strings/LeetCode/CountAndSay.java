package Strings.LeetCode;

import java.util.ArrayList;

public class CountAndSay {
    public String countAndSayRecur(int n) {
        // Base case
        if (n == 1) {
            return "1";
        }
        // Recursive case
        String previous = countAndSayRecur(n - 1); // Get the sequence for n - 1
        ArrayList<ArrayList<Integer>> strArr = helper1(previous);
        return helper2(strArr); // Generate the sequence for n
    }
    public String countAndSay(int n) {
        int start = 1;
        String answer = "1";
        while (start < n){
            ArrayList<ArrayList<Integer>> strArr = helper1(answer);
            answer = helper2(strArr);
            start ++;
        }
        return answer;
    }
    public ArrayList<ArrayList<Integer>> helper1(String str){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int i = 1;
        int count = 1;
        char previous = str.charAt(0);
        while (i < str.length()){
            if (previous == str.charAt(i)){
                count ++;
            } else {
                ArrayList<Integer> array = new ArrayList<>();
                array.add(Character.getNumericValue(previous));
                array.add(count);
                result.add(array);
                previous = str.charAt(i);
                count = 1;
            }
            i++;
        }
        ArrayList<Integer> array = new ArrayList<>();
        array.add(Character.getNumericValue(previous));
        array.add(count);
        result.add(array);

        return result;
    }

    public String helper2(ArrayList<ArrayList<Integer>> result){
        String str = "";
        for (ArrayList<Integer> arr : result){
            str += arr.get(1);
            str += + arr.get(0);
        }
        return str;
    }

    public static void main(String[] args) {
        CountAndSay cAndSay = new CountAndSay();
        String result = cAndSay.countAndSayRecur(4);
        System.out.println(result);

        // for (ArrayList<Integer> arr : result){
        //     System.out.println(arr.toString());
        // }
    }
}
