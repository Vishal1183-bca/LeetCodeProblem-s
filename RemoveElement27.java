//Vishal Bhaliya
//31-12-2024

public class RemoveElement27 
{
    public int removeElement(int[] nums, int val) 
    {
        int j = 0;
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] != nums[val])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    
}