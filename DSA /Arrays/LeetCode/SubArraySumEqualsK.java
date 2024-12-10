package Arrays.LeetCode;

/* 
 * LeetCode Question #560
 * Difficulty : Medium.
*/

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                for(int q = i; q < j; q++){
                    sum =+ nums[q];
                    if(sum == k){
                        counter ++;
                    }
                }
            }
        }
        return counter;
        
    }
    public static void main(String[] args) {
        SubArraySumEqualsK obj = new SubArraySumEqualsK();
        int[] input = {1, 2, 3};
        int key = 3;
        System.out.println(obj.subarraySum(input, key));
    }
}


// RETURN TO THIS QUESTION!