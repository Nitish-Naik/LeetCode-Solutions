import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubsetsII {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates
        helper(nums, 0, result, new ArrayList<>());
        return result;
    }

    private static void helper(int[] nums, int ind, List<List<Integer>> result, List<Integer> current) {
        result.add(new ArrayList<>(current)); // Add the current subset to the result
        for (int i = ind; i < nums.length; i++) {
            // If the current element is the same as the previous one, skip it to avoid duplicates
            if (i > ind && nums[i] == nums[i - 1]) continue;
            current.add(nums[i]);
            helper(nums, i + 1, result, current);
            current.remove(current.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        
        List<List<Integer>> result = subsetsWithDup(nums);
        
        System.out.println("Unique subsets: " + result);
    }
}