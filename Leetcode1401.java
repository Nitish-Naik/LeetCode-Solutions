import java.util.*;

public class Leetcode1401 {
    public static int numSteps(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 1) {
            if (sb.charAt(sb.length() - 1) == '0') {

                sb.deleteCharAt(sb.length() - 1);
            } else {
                // If the binary number ends with '1', it's odd, so add 1
                int i = sb.length() - 1;
                while (i >= 0 && sb.charAt(i) == '1') {
                    sb.setCharAt(i, '0');
                    i--;
                }
                if (i >= 0) {
                    sb.setCharAt(i, '1');
                } else {
                    sb.insert(0, '1');
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numSteps("11000"));
    }
}
