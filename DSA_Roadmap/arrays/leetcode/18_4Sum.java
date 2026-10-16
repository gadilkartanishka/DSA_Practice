//Leetcode 18 4Sum
//HashSet Approach
//Time Complexity:O(n^3)
//space Complexity:O(n)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> seen = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long fourth = (long) target - nums[i] - nums[j] - nums[k];
                    if (seen.contains((int) fourth)) { 
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        Collections.sort(quad);
                        result.add(quad);
                    }
                    seen.add(nums[k]);
                }
            }
        }
        return new ArrayList<>(result);
    }
}
