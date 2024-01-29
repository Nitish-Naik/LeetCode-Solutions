/**
 * firstDigitOfProductArray
 */
public class firstDigitOfProductArray 
{
    static int firstDigit(int a[], int n) 
    { 
        if(n <= 1 && a[n-1] < 9) return a[n-1];
        double logSum = 0;

        // Calculate the sum of logarithms of array elements
        for(int i = 0; i < n; i++) {
            logSum += Math.log10(a[i]);
        }

        // Calculate the fractional part and find the first digit
        double fractionalPart = logSum - Math.floor(logSum);
        int firstDigit = (int) Math.pow(10, fractionalPart);

        return firstDigit;
    }
    public static void main(String[] args) 
    {
        int a [] = {6,7,9};
        System.out.println(firstDigit(a, a.length));
    }
}