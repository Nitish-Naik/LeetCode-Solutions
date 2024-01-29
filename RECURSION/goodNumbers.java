/**
 * goodNumbers
 */
public class goodNumbers 
{
    static void printGoodNumbers(String s)
    {
        String prime = "2357";
        String even = "0468";

        for(int i=0; i<s.length(); i++)
        {
            if(i % 2 == 0)
            {
                
            }
            if(prime.indexOf(s.charAt(i)) != -1)
            {

            }
        }
    }
    public static void main(String[] args) 
    {
        String s = "4562";
        printGoodNumbers(s);
    }
    
}