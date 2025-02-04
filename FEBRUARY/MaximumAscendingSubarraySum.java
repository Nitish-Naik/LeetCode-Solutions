class MaximumAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) 
    {
        int currSum = nums[0];
        int maxSum = 0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] > nums[i-1])
            {
                currSum += nums[i];
            }
            else
            {
                maxSum = Math.max(currSum, maxSum);
                currSum = nums[i];
            }
        }
        maxSum = Math.max(currSum, maxSum);
        return maxSum;
    }
}
