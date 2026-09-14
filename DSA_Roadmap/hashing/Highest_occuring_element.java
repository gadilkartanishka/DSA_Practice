//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);      
        }
        int max=Collections.max(map.values());
        int ans=Integer.MAX_VALUE;
        for(int key:map.keySet()){
            if(map.get(key)==max){
                ans=Math.min(ans,key);
            }
        }
        return ans;
    }
}


