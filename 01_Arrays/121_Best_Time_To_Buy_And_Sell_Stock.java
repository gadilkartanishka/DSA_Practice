import java.util.Scanner;
/*
Problem: Best Time to Buy and Sell Stock
Platform: LeetCode
Difficulty: Easy
Topic: Arrays

Approach:
1. Traverse the array once while keeping track of the minimum stock price seen so far.
2. For each day, check if selling on that day would give a profit:
       profit = current price - minimum price so far.
3. Update the maximum profit if the current profit is greater.
4. If the current price is lower than the minimum price so far,
   update the minimum buying price.

Time Complexity: O(n)      // single traversal of the array
Space Complexity: O(1)     // no extra data structures used
*/
public class BuySellStocks {
    public static int maxProfit(int[] prices) {
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
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of prices: ");
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter price of stock "+(i+1)+": ");
            prices[i] = sc.nextInt();
        }
        System.out.println("Maximum profit is "+maxProfit(prices));
    }
}

