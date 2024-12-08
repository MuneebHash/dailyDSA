package Arrays.LeetCode;
import java.util.Arrays;
// LeetCode Question No. 238;
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        ans[0] = 1;
        for(int i = 1; i < length; i++){ //Left
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int product = 1;
        for(int i = length - 2; i >= 0; i--){
            product = product * nums[i+1];
            ans[i] = ans[i]* product;
        }
        return ans;
    }

    public static void main(String[] args) {
        ProductofArrayExceptSelf obj = new ProductofArrayExceptSelf();
        int[] input = {1, 2, 3, 4,};
        System.out.println(Arrays.toString(obj. productExceptSelf(input)));
    }
}
