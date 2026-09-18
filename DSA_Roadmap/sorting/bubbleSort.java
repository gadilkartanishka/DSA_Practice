// Time complexity:
// Best: O(n)
// Average: O(n^2)
// Worst: O(n^2)

// Space complexity: O(1)
class Solution {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int didSwap = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                return nums;
            }
        }
        return nums;
    }
}