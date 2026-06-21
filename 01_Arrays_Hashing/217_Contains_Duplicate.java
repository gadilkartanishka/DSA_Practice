// // LeetCode 217 - Contains Duplicate
// // Time Complexity: O(n)
// // Space Complexity: O(n)
// import java.util.*;
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]==nums[i-1]){
//                 return true;
//             }
//         }
//         return false;
//     }
    
// }

//OPTIMAL APPROACH
//Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.HashSet;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            if(seen.contains(num)){
                return true;
            }else{
                seen.add(num);
            }
        }
        return false;
    }
}