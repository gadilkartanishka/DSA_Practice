//Leetcode 15 3Sum
//Brute Force Approach
//Time Complexity: O(N^3);
//Space Complexity : O(N)
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result=new ArrayList<>();
//         for(int i=0;i<nums.length-2;i++){
//             for(int j=i+1;j<nums.length-1;j++){
//                 for(int k=j+1;k<nums.length;k++){
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         List<Integer> triplet=Arrays.asList(
//                             nums[i], nums[j], nums[k]
//                         );
//                         Collections.sort(triplet);
//                         if(!result.contains(triplet)){
//                         result.add(triplet);
//                     }
//                     } 
//                 }
//             }
//         }
//         return result;
//     }
// }
//Better Approach
//Time Complexity : O(N^2)
//Space Complexity : O(N*u) where u is number of unique triplets
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result=new ArrayList<>();
//         for(int i=0;i<nums.length-2;i++){
//             HashSet<Integer> set=new HashSet<>();
//             for(int j=i+1;j<nums.length;j++){
//                 int key=-(nums[i]+nums[j]);
//                 if(set.contains(key)){
//                     List<Integer> triplet=Arrays.asList(
//                             nums[i], nums[j], key
//                         );
//                         Collections.sort(triplet);
//                         if(!result.contains(triplet)){
//                         result.add(triplet);
//                 }
//                 }
//                 set.add(nums[j]);
//             }
//         }
//         return result;
//     }
// }
//Optimal Approach
//Time Complexity: O(N log N) + O(N^2) = O(N^2)
//Space Complexity : O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                List<Integer> triplet=Arrays.asList(nums[i], nums[j],nums[k]);
        
                    result.add(triplet);
                
                j++;
                k--;
                while(j<k && nums[j] == nums[j - 1]){
                    j++;
                }
                while(j<k && nums[k] == nums[k + 1]){
                    k--;
                }
            }else if(nums[i]+nums[j]+nums[k]<0){
                j++;
            }else{
                k--;
            }
            }
            
        }
        return result;
    }
}