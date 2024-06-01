class Score_of_a_String {
    public static int scoreOfString(String s) {
        int sum = 0;
        for(int i=0; i<s.length()-1; i++) {
            sum += Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
        }
        // sum += 
        return sum;
    }
    public static void main(String[] args) {
        String s = "zaz";
        System.out.println(scoreOfString(s));
    }
}


// Input: s = "hello"

// Output: 13

// Explanation:

// The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.