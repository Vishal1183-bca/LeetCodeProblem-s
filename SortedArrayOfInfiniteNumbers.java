package Arrays.BinarySearch;
//Vishal Bhaliya
//02-01-2025
//// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class SortedArrayOfInfiniteNumbers
{
    public static void main(String[] args) {

            int[] arr = {3, 5, 7, 9, 10, 90,
                    100, 130, 140, 160, 170,200};
            int target = 200;
        System.out.println(ans(arr,target));
    }
    public static int ans(int[] arr,int target)
    {
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;
        while (target > arr[end])
        {
            int temp = end + 1; //this is my new Start
            //end = 1 + 1 temp = 2
            //double the box value
            //end = previous end + sizeOfBox * 2
            end = end + (end - start) * 2; //  1 + (1 - 0) * 2 = 1 + 1 * 2 = 4
            start = temp; // start = 2 and so once
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int[] arr,int target,int start,int end)
    {
        while (start <= end)
        {
            int mid = start + (end - start + 1) / 2;
            if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else if(arr[mid] > target)
            {
                end = mid - 1;
            }
            else
                return mid;
        }
        return -1;
    }
}
