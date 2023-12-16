public class lowerCase_in_a_string 
{
    public static void lowerCase(String a)
    {
        a= a.toLowerCase();
        int count = 0;
        for(int i=0; i<a.length(); i++)
        {
            char ch = a.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) 
    {
        String a = "abcdefghijklmnopqrstuvwxyz";
        lowerCase(a);
    }    
}
