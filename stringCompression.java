public class stringCompression 
{
    public int compress(char[] chars) 
    {
        StringBuilder comp = new StringBuilder();
        int j = 0;
        while (j < chars.length) 
        {
            char currentChar = chars[j];
            int occ = 1;
            int i = j + 1; 
            while (i < chars.length && chars[i] == currentChar) 
            {
                occ++;
                i++;
            }
            comp.append(currentChar);
                if (occ != 1) {
                    comp.append(occ);
                }
            j = i; 
        }
            char[] compressedChars = comp.toString().toCharArray();
            System.arraycopy(compressedChars, 0, chars, 0, compressedChars.length);
            return compressedChars.length;
    }
}
    
