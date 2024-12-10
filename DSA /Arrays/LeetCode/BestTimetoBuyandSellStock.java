package Arrays.LeetCode;

/* 
 * LeetCode Question #121
 * Difficulty : Easy.
*/

public class BestTimetoBuyandSellStock{
    public int maxProfit(int[] prices) {
        int maxProfit = 0;  // To store the maximum profit found
        int minPrice = Integer.MAX_VALUE;  // To track the minimum price seen so far
        
        // Iterate through each price in the array
        for (int price : prices) {
            // Update the minimum price if we find a lower price
            if (price < minPrice) {
                minPrice = price;
            } else {
                // Calculate the potential profit by selling at the current price
                int currentProfit = price - minPrice;
                // Update the maximum profit if the current profit is higher
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        
        return maxProfit;  // Return the maximum profit found
    } 
    public static void main(String[] args) {
        BestTimetoBuyandSellStock bsObj = new BestTimetoBuyandSellStock();
        int[] array = {7,1,5,3,6,4};
        System.out.println(bsObj.maxProfit(array));
    }
}