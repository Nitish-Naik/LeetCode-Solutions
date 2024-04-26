class Reverse_vowels_of_a_String_345
 {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] a = s.toCharArray();
        int i = 0; 
        int j = a.length - 1;
        while (i < j) {
            if (vowels.indexOf(a[i]) != -1 && vowels.indexOf(a[j]) != -1) {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            } else if (vowels.indexOf(a[i]) != -1) {
                j--;
            } else if (vowels.indexOf(a[j]) != -1) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return new String(a);
    }
}
