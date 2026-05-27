// LeetCode 11 - Container with most water
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0;
        int end=n-1;
        int maxArea=0;
        while(end>start){
            int area=Math.min(height[start],height[end])*(end-start);
            maxArea=Math.max(area,maxArea);
            if(height[start]>height[end]){
                end--;
            }else{
                start++;
            }
            
        }
        return maxArea;
    }
}