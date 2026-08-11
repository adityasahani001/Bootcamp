//  27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }
}



//Two-Pointer Optimization

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1]; // Swap with last element
                n--;                   // Reduce array size
            } else {
                i++;
            }
        }
        
        return n;
    }
}
