package Arrays.LeetCode;

/* 
 * LeetCode Question #1
 * Difficulty : Easy.
*/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i ++){
            for(int j = 0; j < nums.length; j++){
                if ((nums[i] + nums[j]) == target && i != j){
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] arr = {2,7,11,15};
        obj.twoSum(arr, 9);

    }
}
