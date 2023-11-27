public class peakElement 
{
    public static void findPeakElement(int a[])
    {
        int low = 0;
        int high = a.length-1;
        int peak = -1;
        while (low<=high) 
        {
            int mid=low + (high-low)/2;
            if(a[mid] > a[mid+1] && a[mid] > a[mid-1])
            {
                peak = mid;
            }    
            else
            {
                
            }
        }
    }    
}
