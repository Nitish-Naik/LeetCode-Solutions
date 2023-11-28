public class Single_element_Sorted_array 
{
    public static void main(String[] args) 
    {
        int a[] = {1,1,2,2,3,3,4,5,5,6,6};
        int low = 0, high = a.length-1;

        // Handle the case when the array has only one element
        if(a.length == 1)
        {
            System.out.println(a[0]);
            return;
        }

        // Handle the case when the single element is at the first position
        if(a[low] != a[low+1])
        {
            System.out.println(a[low]);
            return;
        }

        // Handle the case when the single element is at the last position
        if(a[high] != a[high-1])
        {
            System.out.println(a[high]);
            return;
        }

        // Binary search to find the single element
        while(low <= high) 
        {
            int mid = low + (high - low) / 2;

            if(a[mid] != a[mid-1] && a[mid] != a[mid+1])
            {
                System.out.println(a[mid]);
                return;
            }   
            
            if((mid % 2 == 0 && a[mid] == a[mid+1]) || (mid % 2 == 1 && a[mid] == a[mid-1]))
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
    }    
}
