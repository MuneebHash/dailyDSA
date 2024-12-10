package Arrays.LeetCode;

/* 
 * LeetCode Question #485
 * Difficulty : Easy.
*/

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = count;
        for(int i = 0; i < nums.length; i++){
                if (nums[i] == 1){
                    count ++;
                } else if(nums[i] == 0){
                    count = 0;
                }
            if(count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int[] arr = {1,1,1,1,1,1,0,1,1,};
        int n =obj.findMaxConsecutiveOnes(arr);
        System.out.println(n);
    }
    
}
