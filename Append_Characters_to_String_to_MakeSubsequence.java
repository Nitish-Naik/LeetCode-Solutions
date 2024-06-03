public class Append_Characters_to_String_to_MakeSubsequence {
    public static int appendCharacters(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        // Pointer for string t
        int j = 0;

        // Iterate over string s
        for (int i = 0; i < m && j < n; i++) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
        }

        // If we have matched j characters of t in s, we need to append the rest
        return n - j;
    }

    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching", "coding")); // Output: 4
        System.out.println(appendCharacters("abcde", "a")); // Output: 0
        System.out.println(appendCharacters("z", "abcde")); // Output: 5
    }
}
