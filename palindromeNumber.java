public class palindromeNumber
{
    public static boolean isPalindrome(int x) 
        {
            int temp = x;
            int rev = 0;
            while(x != 0)
            {
                int a = x%10;
                rev = (rev * 10) + a;
                x /= 10;
            }
    
            return (temp == rev);
        }

    static int recursive_func(int n, int rev)
        {
            if (n < 10) {
                return rev * 10 + n;
            }
            else {
                int last_digit = n % 10;
                rev = rev * 10 + last_digit;
                return recursive_func(n / 10, rev);
            }
        }
    public static void main(String[] args) 
    {
        System.out.println(recursive_func(121, 0));
    }
}