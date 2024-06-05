import java.util.ArrayList;
import java.util.List;

public class FindCommonLetters {
    public static List<String> commonChars(String[] words) {
        // Initialize a list to store the result
        List<String> result = new ArrayList<>();
        
        // If words array is empty, return the empty result
        if (words.length == 0) return result;

        // Initialize the character frequency array for the first word
        int[] minFreq = new int[26];
        for (char c : words[0].toCharArray()) {
            minFreq[c - 'a']++;
        }

        // Compare the frequency array with the rest of the words
        for (int i = 1; i < words.length; i++) {
            int[] charCount = new int[26];
            for (char c : words[i].toCharArray()) {
                charCount[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], charCount[j]);
            }
        }

        // Collect the common characters
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words1 = {"bella", "label", "roller"};
        String[] words2 = {"cool", "lock", "cook"};
        
        System.out.println(commonChars(words1)); 
        System.out.println(commonChars(words2));
    }
}


/*
Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 
 */