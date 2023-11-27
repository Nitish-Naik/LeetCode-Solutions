public class binarySearch 
{
    public static int BinarySearch(int a[], int key)
    {
        int low=0; 
        int high=a.length-1;
        int ans = a.length;
        while (low <= high) 
        {
            int mid=low + (high-low)/2;
            if(a[mid] >= key)
            {
                ans =  mid;
                high = mid-1;
            } 
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }    
}
