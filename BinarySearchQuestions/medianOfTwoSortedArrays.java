public class medianOfTwoSortedArrays 
{
    public static double medianOfTwoSortedArrays(int a[], int b[])
    {
        int i=0;
        int j=0;
        int n=a.length; 
        int m = b.length;
        int k=0;
        double median = Double.MIN_VALUE;
        int temp[] = new int[n+m];
        while(i<n && j<m)
        {
            if(a[i] <= b[j])
            {
                temp[k++] = a[i++];
            }
            else
            {
                temp[k++] = b[j++];
            }
        }
        while(i<n) 
        {
            temp[k++] = a[i++];    
        }
        while(j<m) 
        {
            temp[k++] = b[j++];    
        }
        int left = 0, right = temp.length-1;
        while (left <= right) 
        {
            int mid=left + (right - left)/2;
        if(temp.length % 2 == 0)
        {
            median = (temp[mid] + temp[mid+1])/2;
            return median;
        }
            median = temp[mid];
        }
        return median;
    }    
}
