package Arrays.BinarySearch;

//Vishal Bhaliya
//02-01-2025
// https://leetcode.com/problems/peak-index-in-a-mountain-array/  - 852
// https://leetcode.com/problems/find-peak-element/ - 162
public class FindPeakElement
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start < end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
            {
                end = mid;
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }
}
