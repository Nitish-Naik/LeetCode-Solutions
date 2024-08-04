import java.util.ArrayList;
import java.util.Collections;

/**
 * Leetcode_1508
 */
public class Leetcode_1508 {
    public static int rangeSum(int[] a, int n, int left, int right) {
    ArrayList<Integer> subarraySums = new ArrayList<>();
        int MOD = 1000000007;

        // Generate all possible subarray sums
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                System.out.println(a[end] + " ");
                sum += a[end];
                subarraySums.add(sum);
            }
        }

        // Sort all subarray sums
        Collections.sort(subarraySums);

        // Calculate the sum of elements from the sorted subarray sums
        int result = 0;
        for (int i = left - 1; i < right; i++) {
            result = (result + subarraySums.get(i)) % MOD;
        }

        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};

        System.out.println(rangeSum(nums, nums.length, 1, 5));
    }
}