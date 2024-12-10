package Arrays.LeetCode;
import java.util.Arrays;

/* 
 * LeetCode Question #217
 * Difficulty : Easy.
*/

public class ContainsDuplicate {
    public void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int mid = (right - left)/2 + left;

            mergeSort(arr, left, mid); // First half of the array, the left half.
            mergeSort(arr, mid + 1, right); // Second half of the array, the right half.
            
            merge(arr, left, mid, right);
        }
    }
    
    public void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1; 
        int n2 = right - mid;

        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1); 
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right + 1);

        int i = 0; int j = 0; int k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            } else{
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    public boolean containsDuplicate(int[] nums) {
        mergeSort(nums, 0, nums.length -1);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }   

    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(obj.containsDuplicate(nums));
    }
}
