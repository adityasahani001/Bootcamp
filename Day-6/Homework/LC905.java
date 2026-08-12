//  905. Sort Array By Parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            
            if (nums[left] % 2 == 0) left++;
            if (nums[right] % 2 != 0) right--;
        }
        
        return nums;
    }
}

// Alternative One-Pass In-Place Approach

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[i];
                nums[i] = temp;
                evenIndex++;
            }
        }
        
        return nums;
    }
}
