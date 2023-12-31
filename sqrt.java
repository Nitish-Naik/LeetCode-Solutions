public class sqrt 
{
    public static void main(String[] args) 
    {
        int n = 27;
        int low = 1;
        int high = n;
        int ans = 0;
        while (low<=high) 
        {
            int mid = (low+high)/2;
            if((mid * mid) <= n)
            {
                ans = mid;
                low = mid +1;
            }    
            else
            {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }    
}
