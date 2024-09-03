public class Leetcode_1945 {
    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int n = ch - 'a' + 1;
            sb.append(n);
        }

        // Convert the StringBuilder to a String
        String s1 = sb.toString();

        // Step 2: Perform the transformation k times
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            sum += s1.charAt(i) - '0';  // Convert each character to an integer and sum
        }

        k--;
        while (k > 0) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
            k--;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getLucky("zbax", 2));
    }
}
