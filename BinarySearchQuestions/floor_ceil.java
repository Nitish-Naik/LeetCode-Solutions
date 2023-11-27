public class floor_ceil 
{
    public static int findFloor(int a[], int x)
    {
        int n = a.length;
        int si=0, ei=n-1, ans = n;
        while(si<=ei) 
        {
            int mid = si+(ei-si)/2;
            if(a[mid] <= x)
            {
                ans = a[mid];
                si=mid+1;
            }    
            else
            {
                ei = mid-1;
            }
        }
        return ans;
    }
    public static int findCeil(int a[], int x)
    {
        int n = a.length;
        int si=0, ei=n-1, ans = n;
        while(si<=ei) 
        {
            int mid = si+(ei-si)/2;
            if(a[mid] >= x)
            {
                ans = a[mid];
                ei=mid-1;
            }    
            else
            {
                si = mid+1;
            }
        }
        return ans;
    }
    
}
