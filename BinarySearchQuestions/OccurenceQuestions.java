public class OccurenceQuestions 
{
    public static int findfirstOccurence(int a[], int target)
    { 
        int left = 0;
        int right = a.length-1;
        int result = -1;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(a[mid] == target)
            {
                result = mid;
                right = mid-1;
            }
            else if(a[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return result;
    }    
    public static int findLastOccurence(int a[], int target)
    {
        int result=-1;
        int left = 0;
        int right = a.length-1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(a[mid] == target)
            {
                result = mid;
                left = mid+1;
            }
            else if(a[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return result;
    }
    public static int[] firstAndLastPosition(int a[], int target)
    {
        int result[] = {-1, -1};
        result[0] = findfirstOccurence(a, target);
        if(result[0] != -1)
        {
            result[1] = findLastOccurence(a, target);
        }
        return result;
    }
    public static int count(int arr[], int n, int x) 
    {
        int[] ans = firstAndLastPosition(arr, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }
}
