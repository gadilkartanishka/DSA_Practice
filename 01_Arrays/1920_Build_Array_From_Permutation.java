// LeetCode 1920 - Build Array from Permutation
// Approach: Use an extra array to store the answer
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}