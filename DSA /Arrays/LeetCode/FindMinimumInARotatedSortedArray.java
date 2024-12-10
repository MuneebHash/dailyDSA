package Arrays.LeetCode;

/* 
 * LeetCode Question #153
 * Difficulty : Medium.
*/

public class FindMinimumInARotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0; 
        int high = nums.length -1;

        while(low < high){
            int mid = (high + low)/2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        FindMinimumInARotatedSortedArray obj = new FindMinimumInARotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int n = obj.findMin(nums);
        System.out.println(n);
    }
    
}
