package Strings.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char current_char = s.charAt(i);
            if (map.containsKey(current_char)){
                map.put(current_char, map.get(current_char)+1);
            } else{
                map.put(current_char, 1);
            }
        }
         for(int i = 0; i < t.length(); i++){
            char current_char = t.charAt(i);
            if (map.containsKey(current_char)){
                map.put(current_char, map.get(current_char)-1);
            } else {
                return false;
            }
        }
        for(char c : map.keySet()){
            if (map.get(c) != 0){
                return false;
            }
        }
        return true;
    }
    
    static void mergeSort(char[] s, int left, int right){
        if (left < right){
            int mid = (right + left) / 2;
            mergeSort(s, left, mid);
            mergeSort(s, mid + 1, right);
            merge(s, left, mid, right);
        }
    }
    static void merge(char[] arr, int left, int mid, int right){
        int n1 = (mid - left) + 1;
        int n2 = right - mid;

        char[] leftArr = Arrays.copyOfRange(arr, left, mid+1); 
        char[] rightArr = Arrays.copyOfRange(arr, mid+1, right + 1);

        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2){
            if (leftArr[i] > rightArr[j]){
                arr[k++] = rightArr[j++];
            } else {
                arr[k++] = leftArr[i++];
            }
        }
        while (i < n1){
            arr[k++] = leftArr[i++];
        }
        while (j < n2){
            arr[k++] = rightArr[j++];
        }
    }
    public static void main(String[] args) {
        //IsAnagram obj = new IsAnagram();

        String str = "nikhita";
        String str2 = "atinikh";

        char[] arr1 = str.toCharArray();
        char[] arr2 = str2.toCharArray();

        mergeSort(arr1, 0, arr1.length -1);
        mergeSort(arr2, 0,arr2.length -1);


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        if(Arrays.equals(arr1, arr2)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
