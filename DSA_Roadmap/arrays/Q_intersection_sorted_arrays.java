//Time Complexity : O(m+n)
//Space Complexity : O(min(m,n))
class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersection=new ArrayList<>();
        int i=0;
        int j=0;
       while(i < nums1.length && j < nums2.length){
            if(nums1[i]==nums2[j]){
                intersection.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] result=new int[intersection.size()];
        for(int k=0;k<intersection.size();k++){
            result[k]=intersection.get(k);
        }
       return result;
    }
     
}