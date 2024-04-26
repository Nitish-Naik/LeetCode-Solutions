import java.util.*;
public class addToArray {
    public ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;
        int i = num.length - 1;

        // Adding the numbers digit by digit
        while (i >= 0 || k > 0 || carry > 0) {
            int digit = carry;
            if (i >= 0) {
                digit += num[i];
                i--;
            }
            if (k > 0) {
                digit += k % 10;
                k /= 10;
            }
            ans.add(0, digit % 10);
            carry = digit / 10;
        }

        return ans;
    }
} 
