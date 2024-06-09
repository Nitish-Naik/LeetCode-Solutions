/*
 * 
 * 974. Subarray Sums Divisible by K
Medium
Topics
Companies
Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:

Input: nums = [5], k = 9
Output: 0

 */

import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisible_by_K {
    public static int subarraysDivByK(int[] nums, int k) {
        // Create a hashmap to store the frequencies of prefix sum remainders.
        Map<Integer, Integer> countMap = new HashMap<>();
        // Initialize with remainder 0 having frequency 1.
        countMap.put(0, 1);
      
        // 'answer' will keep the total count of subarrays divisible by k.
        int answer = 0;
        // 'sum' will store the cumulative sum.
        int sum = 0;
      
        // Loop through all numbers in the array.
        for (int num : nums) {
            // Update the cumulative sum and adjust it to always be positive and within the range of [0, k-1]
            sum = ((sum + num) % k + k) % k;
            // If this remainder has been seen before, add the number of times it has been seen to the answer.
            answer += countMap.getOrDefault(sum, 0);
            // Increase the frequency of this remainder by 1.
            countMap.merge(sum, 1, Integer::sum);
        }
      
        // Return the total count of subarrays that are divisible by 'k'.
        return answer;
    }
    public static void main(String[] args) {
        int a[] = {4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(a, 5));
    }
}
