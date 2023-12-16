import java.util.*;
public class Anagram 
{
    public static boolean anagram(String s1, String s2)
    {
        int h1[] = new int[26];
        for(int i=0; i<s1.length(); i++)
        {
            h1[s1.charAt(i) - 'a']++;
        }
        System.out.println();
        // check the value at particular index
        for(int i=0; i<h1.length; i++)
        {
            System.out.print(h1[i] + " ");
        }
        System.out.println();
        for(int i=0; i<s2.length(); i++)
        {
            h1[s2.charAt(i)-'a']--;
        }
        for(int i=0; i<h1.length; i++)
        {
            if(h1[i] != 0)
            {
                return false;
            }
        }
        return true;
    }    
    public static void main(String[] args) 
    {
        String s1 = "fdsa";
        String s2 = "asdf";
        System.out.println(anagram(s1, s2));    
    }
}
