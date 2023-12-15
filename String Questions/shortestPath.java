public class shortestPath 
{
    public static int shortPath(String s)
    {
        int x = 0;
        int y = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == 'E')
            {
                x++;
            }
            else if(s.charAt(i) == 'W')
            {
                x--;
            }
            else if(s.charAt(i) == 'N')
            {
                y++;
            }
            else
            {
                y--;
            }
        }
        return (int)Math.sqrt(x*x + y*y);
    }
    public static void main(String[] args) 
    {
        String s = "WNEENESENNN";
        // System.out.println(shortPath(s));
        // System.out.println(s.contains("S"));
        System.out.println(s.substring(0, s.length()));
    }    
}
