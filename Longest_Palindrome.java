import java.util.*;
class Longest_Palindrome {
    public static int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Create a hash map to store character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int maxLength = 0;
        int oddCount = 0; // To handle cases with a single middle character

        // Iterate through character frequencies and build the palindrome length
        for (int count : charCount.values()) {
            maxLength += count / 2 * 2; // Add even occurrences (both halves)
            if (count % 2 == 1) {
                oddCount = Math.max(oddCount, count); // Track the largest odd occurrence
            }
        }

        // If there's an odd character, include it as the middle element
        return maxLength + (oddCount > 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
