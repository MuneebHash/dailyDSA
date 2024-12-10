package Arrays.LeetCode;
import java.util.Arrays;

/* 
 * LeetCode Question #169
 * Difficulty : Easy.
*/

public class MajorityElement {
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

    public int majorityElement(int[] nums) {
        mergeSort(nums, 0, nums.length -1);
        return nums[nums.length / 2];
    }
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] nums ={2,2,1,1,1,2,2};
        System.out.println(obj.majorityElement(nums));
    }
}
