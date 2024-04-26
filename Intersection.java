
import java.util.*;
public class Intersection 
{
    public static void intersection(int[] a, int[] b) 
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        int k=0;
        // int ans[] = new int[a.length + b.length];
        ArrayList<Integer> ans = new ArrayList<>();
        while(i < a.length && j < b.length)
        {
            if(a[i] == b[j]) 
            {
                ans.add(a[i]);
                k++;
                i++;
                j++;
            }
            else if(a[i] > a[j])
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        System.out.println(ans.toArray());
    }
    public static void main(String[] args) 
    {
        int a[] = {1,2,2,1};
        int b[] = {2,2};
        Arrays.sort(a);
        // for(int c:a)
        // {
        //     System.out.println(c);
        // }
        intersection(a, b);
    }
}
