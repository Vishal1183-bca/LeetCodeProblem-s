//Vishal Bhaliya 
//01-01-2025
//https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth1672 
{
    public static int maximumWealth(int[][] accounts) 
    {
        int result = Integer.MIN_VALUE;
        for(int[] nums : accounts)
        {
            int sum = 0;
            for(int ans : nums)
            {
                sum += ans;
            }
            if(sum > result)
            {
                result = sum;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},{3,2,1}
        };
        int[][] arr2 = {
            {2,8,7},{7,1,3},{1,9,5}
        };
        int ans = maximumWealth(arr);
        int ans2 = maximumWealth(arr2);

        System.out.println(ans);
        System.out.println(ans2);
    }
    
}
