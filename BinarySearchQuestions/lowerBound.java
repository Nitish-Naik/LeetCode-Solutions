public class lowerBound 
{
    public static int lowerbound(int a[], int x) 
    {
        int low = 0;
        int high = a.length-1;  
        int ans = a.length;  
        while (low <= high) 
        {
            int mid=(low + high)/2;
            if(a[mid] <= x)
            {
                ans = mid;
                low = mid+1;
            }    
            else
            {
                high = mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) 
    {
        int a[] = {-5, 3, 6, 12, 15};
                 //{0,  1, 2,  3,  4}
        System.out.println(lowerbound(a, 122));
    }
}
