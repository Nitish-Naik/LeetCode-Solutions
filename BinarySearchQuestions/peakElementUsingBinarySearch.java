public class peakElementUsingBinarySearch 
{
    public static int peakElement(int a[])
    {
        int n = a.length;
        int left = 0;
        int right = n-1;
        while(left < right)
        {
            int mid = left + (right - left) / 2;
            if(a[mid] > a[mid+1])
            {
                right = mid;
            }
            else
            {
                left = mid+1;
            }
        }
        return a[left];
    }    
}
