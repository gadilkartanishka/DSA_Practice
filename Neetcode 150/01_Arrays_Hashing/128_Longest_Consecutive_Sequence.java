//Leetcode 128. Longest Consecutive Sequence
//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        int maxLength=0;
        for(int num:seen){
            if(!seen.contains(num-1)){
                int current=num;
                int length=1;
                while(seen.contains(current+1)){
                    current++;
                    length++;
                }
                maxLength=Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}
