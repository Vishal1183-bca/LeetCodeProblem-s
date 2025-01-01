//Vishal Bhaliya
//01-01-2025
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimetoBuyandSellStock_121 
{
    public static int maxProfit(int[] prices) 
    {
        int buyPrice = prices[0];
        int profit = 0;
        for(int ans : prices)
        {
            if(buyPrice > ans) // buyPrice = 7 and ans Value = 1,so 7 > 1
            {
                buyPrice = ans;  //so buyPrice value update with 1 becouse lovest price of array is 1
            }
            profit = Math.max(profit, ans - buyPrice); //ans value is 6 and subtract buyprice value, 6 - 1 = 5
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
    
}
