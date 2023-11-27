public class search_single_element 
{
    public static int search_single_element_sorted_array(int a[])
    {
        int n= a.length;
        int si=0;
        int ei=n-1;
        int element = Integer.MIN_VALUE;
        while(si <= ei)
        {
            int mid = si + (ei - si)/2;
            if(a[mid] != a[mid+1] && a[mid] != a[mid-1])
            {
                element = a[mid];
                // si = 
                return element;
            }
            // else
        }
        return element;
    }
        
}
