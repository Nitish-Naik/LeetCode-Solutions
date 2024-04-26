import java.util.*;
class subArraySum
{
    public static void main(String[] args) 
    {
        int a[] = {1, 0, 1, 0, 1};
        int n = a.length;
        Arrays.sort(a);
        int count = 0;
        for (int i=0; i <n; i++)
        {
            int sum = 0;
            for (int j=i; j<n; j++)
            {
                sum += a[j];
                if(sum == 2)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}