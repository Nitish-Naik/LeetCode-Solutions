class sortedArray
{
    static boolean arraySortedOrNot(int[] a, int n) 
    {
        // code here
        if(n == 1 || n == 0) return true;
        // if(n == 2)
        // {
        //     return true;
        // }
        if(a[n-1] < a[n-2])
        {
            return false;
        }
        return arraySortedOrNot(a, n-1);
    }

    public static void main(String[] args) 
    {
        // int arr[] = {10, 20, 30, 40, 50};
        int arr[] =  {90, 80, 100, 70, 40, 30};
        System.out.println(arraySortedOrNot(arr, arr.length-1));
    }
}