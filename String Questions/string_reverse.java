public class string_reverse 
{
    public static void main(String[] args) 
    {
        String ans = "";
        String s = "  this is an amazing program   ";   
        s = s.trim();
        String reverse[] = s.split("\\s");
        for(int i=reverse.length-1; i>= 0; i--)
        {
            System.out.print(reverse[i] + " ");
        }
        System.out.println();
        System.out.println(reverse.length);
    
    }
}