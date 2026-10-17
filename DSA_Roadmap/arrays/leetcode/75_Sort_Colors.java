//Leetcode 75 : Sort Colors
//Dutch National Flag Algorithm
//Brute Force Approach
//Time Complexity : O(N)
//Space Complexity: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int countW=0;
        int countR=0;
        int countB=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countR++;
            }else if(nums[i]==1){
                countW++;
            }else{
                countB++;
            }
        }
        int idx=0;
        while(countR>0){
            nums[idx]=0;
            idx++;
            countR--;
        }
        while(countW>0){
            nums[idx]=1;
            idx++;
            countW--;
        }
        while(countB>0){
            nums[idx]=2;
            idx++;
            countB--;
        }

    }
}