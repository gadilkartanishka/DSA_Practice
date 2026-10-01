//Time Complexity:O(n)
//Space Complexity:O(n)
class Solution {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> leaders=new ArrayList<>();
        int maxRight=nums[nums.length-1];
        leaders.add(maxRight);
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>maxRight){
                leaders.add(nums[i]);
                maxRight=nums[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}