public class recursion 
{
    static int binSearch(int a[], int si, int ei, int key)
    {
         int mid = si + (ei-si)/2;
         if(a[mid] == key)
         {
            return mid;
         }
         else if(a[mid] < key)
         {
            return binSearch(a, mid+1, ei, key);
         }
         else
         {
            return binSearch(a, si, mid-1, key);
         }
    }

    static int product_of_n_1(int n)
    {
        if(n == 1) return 1;
        return n * product_of_n_1(n-1);
    }
    static int fibonacci(int n)
    {
        if(n < 2) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int sum_digits(int n)
    {
        if(n == 0) return 0;
        
        return (n%10) + sum_digits(n / 10);
    }

    static int repeated_sum_digits(int n)
    {
        if (n < 10) return n;

        int sum = 0;
        while(n > 0) 
        {
            sum += n % 10;
            n /= 10;    
        }
        return (repeated_sum_digits(sum));
    }

    private static int sumOfDigits_recursive(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n%10 + sumOfDigits_recursive(n / 10);
  
    }

    static int sumOfDigits(int N) {
        int totalSum = 0;
        for (int i = 1; i <= N; i++) {
            totalSum += totalSumOfDigits(i);
        }
        return totalSum;
        
        
    }

    // Function to calculate the total sum of digits for all numbers from 1 to N
    static int totalSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) 
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        int a[] = {6,5,4,3,2,1};
        System.out.println(sumOfDigits(49));

    }   
}
