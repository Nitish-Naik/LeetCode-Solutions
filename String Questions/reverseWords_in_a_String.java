public class reverseWords_in_a_String 
{
    public static String reversed(String s)
    {
        s = s.trim();
        String temp[] = s.split("\\.");
        String ans = "";
        for(int i=temp.length-1; i>=0; i--)
        {
            if(i == 0)
            {
                ans += temp[i];
            }
            else
            {
                ans += (temp[i] + ".");
            }
        }

        return ans;
    }    
    public static void main(String[] args) 
    {
        String s = "i.like.this.program.very.much";
        System.out.println(reversed(s));
        
    }
}
