class Solution {
    public String customSortString(String order, String s) {
        StringBuilder rearranged = new StringBuilder();
        
        // Count characters in s
        int[] charCount = new int[26]; // Assuming only lowercase English alphabets
        
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        // Append characters according to order
        for (char c : order.toCharArray()) {
            while (charCount[c - 'a'] > 0) {
                rearranged.append(c);
                charCount[c - 'a']--;
            }
        }
        
        // Append remaining characters not in order
        for (char c = 'a'; c <= 'z'; c++) {
            while (charCount[c - 'a'] > 0) {
                rearranged.append(c);
                charCount[c - 'a']--;
            }
        }
        
        return rearranged.toString();
    }
}
