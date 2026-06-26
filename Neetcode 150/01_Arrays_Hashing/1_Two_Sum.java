// // LeetCode 1 - Two Sum
// // Time Complexity: O(n^2)
// // Space Complexity: O(1)
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
    
// }
//OPTIMAL APPROACH
// Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference=target-nums[i];
            if(seen.containsKey(difference)){
                return new int[]{seen.get(difference),i};
            }
            seen.put(nums[i],i);
        }
        return new int[]{};
    }
}
