// LeetCode 724 - Find Pivot Index
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sumLeft[]=new int[n];
        int sumRight[]=new int[n];
        sumLeft[0]=0;
        sumRight[n-1]=0;
        for(int i=1;i<nums.length;i++){
            sumLeft[i]=sumLeft[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            sumRight[i]=sumRight[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(sumLeft[i]==sumRight[i]){
                return i;
            }
        }
        return -1;
    }
}