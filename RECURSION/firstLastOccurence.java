public class firstLastOccurence 
{
    public static int firstOccurence(int a[], int i, int key)
    {
        if(i == a.length)
        {
            return -1;
        }
        if(a[i] == key)
        {
            return i;
        }
        return firstOccurence(a, i+1, key);
        
    }
    
    public static int lastOccurence(int a[], int i, int key)
    {
        if(i == -1)
        {
            return -1;
        }
        if(a[i] == key)
        {
            return i;
        }
        return lastOccurence(a, i-1, key);
        
    }

    // Method -2
    public static int lastOccurence_2(int a[], int i, int key)
    {
        if(i == a.length) return -1;
        int isFound = lastOccurence_2(a, i+1, key);
        if(isFound == -1 && a[i] == key)
        {
            return i;
        }
        return isFound;

    }
    public static void main(String[] args) 
	{
	    int a[] = {8,3,6,9,5,10,2,5,3};
		System.out.println(firstOccurence(a, 0, 5));
		System.out.println(lastOccurence(a, a.length-1, 5));
        System.out.println(lastOccurence_2(a, 0, 5));
	}
}
