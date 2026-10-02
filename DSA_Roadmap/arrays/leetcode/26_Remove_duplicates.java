//Time Complexity : O(N)
//Space Complexity : O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int ptr = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[ptr] = nums[i];
                ptr++; 
            }
        }

        return ptr;

    }
}