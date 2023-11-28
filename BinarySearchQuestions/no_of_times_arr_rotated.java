public class no_of_times_arr_rotated 
{
    public static void main(String[] args) 
    {
        //        [0,1,2,3,4,5,6,7]
        // int a[] = {4,5,6,7,0,1,2,3};
        int a[] = {1,2,3,4,5};
        // int a[] = {3,4,5,1,2};
        int low=0, high = a.length - 1;
        int ans = Integer.MAX_VALUE;
        int idx = 0;
        if(a[low] <= a[high])
        {
            System.out.println(low);
            return;
        }
        while (low <= high) 
        {
            int mid = low + (high-low)/2;
            if(a[low] <= a[mid])
            {
                if(a[low] < ans)
                {
                    ans = a[low];
                    idx = low;
                }
                low = mid+1;
            }    
            else
            {
                if(a[mid] <= a[high])
                {
                    ans = a[mid];
                    idx = mid;
                }
                high = mid-1;
            }
        }
        System.out.println(idx);
    }    
}
