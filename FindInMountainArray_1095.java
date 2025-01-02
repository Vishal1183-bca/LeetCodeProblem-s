

//Vishal Bhaliya
//02-01-2025
//problem no.1095
//https://leetcode.com/problems/find-in-mountain-array/

interface MountainArray
{

    public default int get(int index) {
        return index;
    }
    public default int length() {

        return 0;
    }

}




public class FindInMountainArray_1095
{

    public int findInMountainArray(int target, MountainArray mountainArr)
    {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstHalf = orderAgnosticbs(mountainArr,target,0,peak);
        if(firstHalf != -1)
        {
            return firstHalf;
        }
        return orderAgnosticbs(mountainArr,target,peak + 1,mountainArr.length() -1);
    }
    public static int peakIndexInMountainArray(MountainArray mountainArr)
    {
        int start = 0;
        int end = mountainArr.length() - 1;
        while (start < end)
        {
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1))
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    public static int orderAgnosticbs(MountainArray mountainArray,int target,int start,int end)
    {
        boolean isAsc = mountainArray.get(start) < mountainArray.get(end);
        while(start <= end)
        {

            int mid = start + (end - start) / 2;
            if(mountainArray.get(mid) == target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(mountainArray.get(mid) < start)
                {
                    start = mid + 1;
                }
                else
                    end = mid - 1;
            }
            else
            {
                if(mountainArray.get(mid) > target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }

        }
        return -1;
    }
}
