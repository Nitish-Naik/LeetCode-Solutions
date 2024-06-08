import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 2)
            return false;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // for the case when sum%k == 0
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0)
                sum %= k;
            Integer prev = map.get(sum);
            if (prev != null) {
                if (i - prev > 1)
                    return true;
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {23,2,4,6,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }
}



/*
 * 523. Continuous Subarray Sum
Medium
Topics
Companies
Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

A good subarray is a subarray where:

its length is at least two, and
the sum of the elements of the subarray is a multiple of k.
Note that:

A subarray is a contiguous part of the array.
An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 

Example 1:

Input: nums = [23,2,4,6,7], k = 6
Output: true
Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
Example 2:

Input: nums = [23,2,6,4,7], k = 6
Output: true
Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
Example 3:

Input: nums = [23,2,6,4,7], k = 13
Output: false
 
 */