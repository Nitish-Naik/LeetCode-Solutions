package JUNE_2024;
import java.util.*;
public class MinimumIncrement_to_Make_Array_Unique {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);  // Sort the array
        int moves = 0;  // Initialize the count of moves
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {  // If the current number is not greater than the previous
                int increment = nums[i - 1] - nums[i] + 1;  // Calculate how much we need to increment the current number
                nums[i] += increment;  // Increment the current number
                moves += increment;  // Add the increment to the total moves
            }
        }
        
        return moves;  // Return the total number of moves
    }

    public static void main(String[] args) {
        MinimumIncrement_to_Make_Array_Unique solution = new MinimumIncrement_to_Make_Array_Unique();
        int[] nums = {3, 2, 1, 2, 1, 7};
        System.out.println(solution.minIncrementForUnique(nums));  // Output: 6
    }
}
