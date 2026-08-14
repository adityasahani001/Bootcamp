// 918. Maximum Sum Circular Subarray
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        
        int maxSum = nums[0];
        int currentMax = 0;
        
        int minSum = nums[0];
        int currentMin = 0;
        
        for (int num : nums) {
            totalSum += num;
            
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);
            
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
        }
        if (maxSum < 0) {
            return maxSum;
        }
        
        return Math.max(maxSum, totalSum - minSum);
    }
}
