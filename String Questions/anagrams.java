import java.util.*;
public class anagrams 
{
    public static boolean anagrams(String s, String b)
    {
        if(s.length() != b.length())
        {
            return false;
        }
        int a[] = new int[26];
        int c[] = new int[26];
        return (a.length+c.length) == 52;
    }
    public static void main(String[] args) 
    {
        String s = "geeksforgeeks";
        String b = "forgeeksgeeks";
        System.out.println(anagrams(s, b));
  
    }    
}
