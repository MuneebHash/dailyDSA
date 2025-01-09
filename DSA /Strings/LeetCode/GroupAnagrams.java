package Strings.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {


    static void mergeSort(char[] strs, int low, int high){
        if(low < high){
            int mid = low + (high - low)/2;

            mergeSort(strs, low, mid);
            mergeSort(strs, mid + 1, high);

            merge(strs, low, mid, high);
        }
    }
    static void merge(char[] str, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;

        char[] l = Arrays.copyOfRange(str, low, mid +1);
        char[] r = Arrays.copyOfRange(str, mid +1, high +1);

        int i = 0;
        int j = 0;
        int k = low;

        while(i < n1 && j < n2){
            if (l[i] < r[j]){
                str[k++] = l[i++];
            } else{
                str[k++] = r[j++];
            }
        }
        while(i < n1){
            str[k++] = l[i++];
        }
        while(j < n2){
            str[k++] = r[j++];
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>(); // key = sorted string, value = List of original string , not using array bec at the start we dont know the size of array
        for(int i = 0; i < strs.length; i++){
            char[] singleString = strs[i].toCharArray();
            mergeSort(singleString, 0, strs[i].length() -1 );
            String key = new String(singleString);
            if (map.containsKey(key)){
                List<String> value = map.get(key);
                value.add(strs[i]);
                map.put(key, value);
            } else{
                List<String> value = new ArrayList<>();
                value.add(strs[i]);
                map.put(key, value);
            }
        }
        List<List<String>> finalList = new ArrayList<>();
        for (String key: map.keySet()){
            finalList.add(map.get(key));
        }
        return finalList;
        
    }
    public static void main(String[] args) {
        
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> finalList = GroupAnagrams.groupAnagrams(strs);
        for (List<String> lst: finalList){
            System.out.println(lst);
        }

    }
}
