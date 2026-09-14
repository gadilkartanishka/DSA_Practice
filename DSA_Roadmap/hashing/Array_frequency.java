//Time complexity: O(n)
//Space complexity: O(n)
class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int key:hm.keySet()){
            int freq=hm.get(key);
            List<Integer> pair= new ArrayList<>();
            pair.add(key);
            pair.add(freq);
            ans.add(pair);
        }
        return ans;
    }
}