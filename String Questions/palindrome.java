import java.util.*;
public class palindrome
{
    public static boolean isPalindrome(String s)
    {
        int n = s.length()-1;
        for(int i=0; i<=n; i++)
        {
            if(s.charAt(i) != s.charAt(n))
            {
                return false;
            }
            n--;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }
}