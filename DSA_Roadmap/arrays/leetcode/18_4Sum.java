//Leetcode 18 4Sum
//HashSet Approach
//Time Complexity:O(n^3)
//space Complexity:O(n)
// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         int n = nums.length;
//         Set<List<Integer>> result = new HashSet<>();
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 Set<Integer> seen = new HashSet<>();
//                 for (int k = j + 1; k < n; k++) {
//                     long fourth = (long) target - nums[i] - nums[j] - nums[k];
//                     if (seen.contains((int) fourth)) { 
//                         List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
//                         Collections.sort(quad);
//                         result.add(quad);
//                     }
//                     seen.add(nums[k]);
//                 }
//             }
//         }
//         return new ArrayList<>(result);
//     }
// }
//Optimal Approach
//Time Complexity : O(n^3)
//space Complexity : O(1)
import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
