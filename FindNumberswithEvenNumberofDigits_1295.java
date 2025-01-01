//Vishal Bhaliya
//01-01-2025
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/


//this Problem Divide into 3 part
//1.count the digit
//2.check counted digit is even or not
//3.if digit is even than increment the counter and return it

public class FindNumberswithEvenNumberofDigits_1295 
{
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int ans : nums)
        {
            if(even(ans))
            {
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums)
    {
        int digitCount = digit(nums);
        return digitCount % 2 == 0;
    }
    static int digit(int nums)
    {
        if(nums == 0)
        {
            return 1;
        }
        if(nums < 0)
        {
            nums = nums * -1; //for negative number count
        }
        return (int)(Math.log10(nums)) + 1;

        // if(nums == 0)
        // {
        //     return 1;

        // }
        // if(nums < 0)
        // {
        //     nums = nums * -1;
        // }
        // int count = 0;
        // while(nums > 0)
        // {
        //     count++;
        //     nums = nums/10;
        // }
        // return count;
        


    }
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        //System.out.println(digit(12131415));
        System.out.println(findNumbers(nums));
    }

}
