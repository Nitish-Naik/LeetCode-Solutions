public class removeDuplicates 
{
    static void remove(String s)
    {
        boolean a[] = new boolean[26];
        boolean b[] = new boolean[26];
        String ans = "";
        for(int i=0; i<s.length(); i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                if(a[(s.charAt(i) - 'a')] == false)
                {
                    ans += s.charAt(i);
                    a[(s.charAt(i) - 'a')] = true;
                }         
            }
            else
            {
                if(b[s.charAt(i) - 'A'] == false)
                {
                    ans += s.charAt(i);
                    b[(s.charAt(i) - 'A')] = true;
                }

            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) 
    {
        String s = "HappyNewYear";
        remove(s);
    }    
}
