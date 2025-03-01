import java.io.*; 
import java.util.*;

class Leetcode_2460 {
    public static int[] applyOperations(int[] nums) {
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        
        int[] result = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("/workspaces/LeetCode-Solutions/ArrayQuestions/input.txt"));
        PrintWriter op = new PrintWriter("/workspaces/LeetCode-Solutions/ArrayQuestions/output.txt");

        if (!ip.hasNextInt()) {
            System.out.println("Error: Input file is empty or invalid.");
            return;
        }

        int testCases = ip.nextInt();
        System.out.println("Test cases: " + testCases);

        for (int t = 1; t <= testCases; t++) {
            if (!ip.hasNextInt()) {
                System.out.println("Error: Missing test case length.");
                break;
            }
            int len = ip.nextInt();

            int[] a = new int[len];
            for (int i = 0; i < len; i++) {
                if (!ip.hasNextInt()) {
                    System.out.println("Error: Missing array elements.");
                    break;
                }
                a[i] = ip.nextInt();
            }

            int[] ans = applyOperations(a);
            op.println("Testcase " + t + ": " + Arrays.toString(ans));
        }

        ip.close();
        op.close();
        System.out.println("Processing complete. Check output.txt.");
    }
}
