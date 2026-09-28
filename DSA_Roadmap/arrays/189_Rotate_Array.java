//Time Complexity : O(N)
//Space Complexity : O(1)
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length;
        reverseArray(nums,0,n-k-1);
        reverseArray(nums,n-k,n-1);
        reverseArray(nums,0,n-1);
    }
    public void reverseArray(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}