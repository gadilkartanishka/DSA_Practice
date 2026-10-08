//Leetcode 169 : Majority Element
//Hashmap approach
//Time Complexity : O(N)
//Space Complexity: O(N)
// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int num:nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//         }
//         for(int num:nums){
//             if(map.get(num)>nums.length/2){
//                 return num;
//             }
//         }
//         return -1;
//     }
// }
//Boyer-Moore Voting Algorithm
//Time Complexity : O(N)
//Space Complexity: O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int result=0;
        for(int num:nums){
            if(count==0){
                result=num;
            }
            if(num==result){
                count++;
            }else{
                count--;
            }
        }
        return result;
    }
}