public class search_in_rotated_sorted_array 
{
    public static int search_rotated_sorted_array(int a[], int target)
    {
        int n = a.length;
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(a[mid] == target)
            {
                return mid;
            }
            else if(a[low] <= a[mid]) // Fix: use a[low] instead of mid
            {
                if(a[low] <= target && target <= a[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if(a[mid] <= target && target <= a[high])
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1; // Fix: moved this line inside the else block
                }
            }
        }
        return -1;
    }

    
    public static boolean search(int a[], int key)
    {
        int si=0, ei=a.length-1; 
        while (si <= ei) 
        {
            int mid=(si+ei)/2;
            if(a[mid] == key)
            {
                return true;
            }    
            if(a[si] == a[mid] && a[mid] == a[ei])
            {
                si = si+1;
                ei = ei-1;
                continue;
            }
            else if(a[si] <= a[mid])
            {
                if(a[si] <= key && key <= a[mid])
                {
                    ei = mid-1;
                }
                else
                {
                    si = mid+1;
                }
            }
            else
            {
                if(a[mid] <= a[ei])
                {
                    if(a[ei] >= key && key >= a[mid])
                    {
                        si = mid+1;
                    }
                    else
                    {
                        ei = mid-1;
                    }
                }
            }
        }
        return false;
    }
}
