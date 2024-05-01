public class Reverse_Prefix_of_Word 
{
    public String reversePrefix(String word, char ch) 
    {
        int idx = -1;
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i) == ch)
            {
                idx = i;
                break;
            }
        }

        return reverse(word, idx);
    }


    public static String reverse(String word, int end)
    {
        if(end == -1)
        {
            return word;
        }
        int start = end+1;
        StringBuilder sb = new StringBuilder("");
        while(end >= 0)
        {
            sb.append(word.charAt(end));
            end--;
        }

        sb.append(word.substring(start, word.length()));
        return sb.toString();
    }
    
}
