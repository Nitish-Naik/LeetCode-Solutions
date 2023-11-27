public class minimun_rotated_sorted_array 
{
    public static int minimum(int a[])
    {
        int si=0;
        int ei=a.length-1;
        int ans = Integer.MAX_VALUE;
        while (si<=ei)
        {
            int mid = si + (ei-si)/2;
            if(a[si] <= a[mid])
            {
                ans = Math.min(ans, a[si]);
                si = mid+1;
            }
            else
            {
                ans = Math.min(ans, a[mid]);
                ei = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int a[] = {4,5,6,7,0,1,2,3};
        System.out.println(minimum(a));
    }    
}
