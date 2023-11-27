public class upperBound 
{
    public static int upperbound(int a[], int x)
    {
        int low = 0;
        int high = a.length-1;
        int ans = a.length;
        while (low <= high) 
        {
            int mid = low + (high-low)/2;
            if(a[mid] <= x)
            {
                ans = mid;
                high= mid-1;
            }    
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }

    
}
