public class binaryStrings 
{
    static void BinaryStrings(int n, int lastPlace, String str)
    {
        // base work
        if(n == 0)
        {
            System.out.println(str);
            return;
        }
            BinaryStrings(n-1, 0, str+"0");
            if(lastPlace == 0)
            {

                BinaryStrings(n-1, 1, str+"1");
            }
    }
    public static void main(String[] args) 
    {
        String s  = "10101010";
        BinaryStrings(3, 0, "");
        
    }
}