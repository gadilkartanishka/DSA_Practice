// LeetCode 121 - Buy and sell stocks
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int minBuyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>minBuyPrice){
                int profit=prices[i]-minBuyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                minBuyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}