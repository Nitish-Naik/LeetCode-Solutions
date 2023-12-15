public class Lexicographical 
{
    public static void lexicographical_Largest_String(String a[])
    {
        String largest = a[0];
        for(int i=1; i<a.length; i++)
        {
            if(a[i].compareToIgnoreCase(largest) == 0)
            {
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) 
    {
        String fruits[] = {"Apple", "apple", "mango", "grapes", 
        "pineapple", "Kiwi", "Blueberry", "Litchi"};
        lexicographical_Largest_String(fruits);
    }    
}
