package Arrays.BinarySearch;

//Vishal Bhaliya
//02-01-2025
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/


import java.util.Arrays;

public class FirstAndLastPosition
{
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums,int target)
    {
        int[] ans = {-1,-1};
        int start = search(nums,target,true); //we want to find starting index
        int end = search(nums,target,false); // we does't want to find starting index
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] nums, int target, boolean findStartIndex)
    {
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if(nums[mid] < target)
            {
                start = mid + 1;

            }
            else if(nums[mid] > target)
            {
                end = mid -1;
            }
            else
            {
                //find our potential ans at mid bu we check starting and ending index from mid left and right side;
                ans = mid;
                if(findStartIndex)
                {
                    end = mid -1;
                }
                else
                    start = mid + 1;
            }
        }
        return  ans;
    }

}
