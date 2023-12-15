public class stringCompression
{
    public static void StringCompression(String s)
    {
        if(s.length() == 1)
        {
            System.out.println(s);
            return ;
        }
        String ans = "";
        for(int i=0; i<s.length(); i++)
        {
            Integer count = 1;
            int j=i;
            while(j < s.length()-1 && s.charAt(j) == s.charAt(j+1)) 
            {
                count++;  
                j++; 
                i++; 
            }
            if(count == 1)
            {
                ans += (s.charAt(i));
            }
            else
            {
                ans += (s.charAt(i) + count.toString());
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) 
    {
        // String s = "GEEKSFORGEEKS";
        String s[] = {"a","a","b","b","c","c","c"};
        String q = "";
        for(String i:s)
        {
            q += i;
        }
        // a3b2cd4
        StringCompression(q);
    }
}
