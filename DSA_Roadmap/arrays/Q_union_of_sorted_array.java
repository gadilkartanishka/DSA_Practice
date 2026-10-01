//Time Complexity: O(m+n)
//Space Complexity: O(m+n)
class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> result=new ArrayList<>();
        int i=0;
        int j=0;
        int n=nums1.length;
        int m=nums2.length;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                if(result.size()==0 || result.get(result.size()-1)!=nums1[i]){
                    result.add(nums1[i]);
                }
                i++;
            }
            else if(nums1[i]>nums2[j]){
                if(result.size()==0 || result.get(result.size()-1)!=nums2[j]){
                    result.add(nums2[j]);
                }
                j++;
            }
            else{
                if(result.size()==0 || result.get(result.size()-1)!=nums1[i]){
                    result.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(result.size()==0 || result.get(result.size()-1)!=nums1[i]){
                    result.add(nums1[i]);
                }
            i++;
        }
        while(j<m){
            if(result.size()==0 || result.get(result.size()-1)!=nums2[j]){
                    result.add(nums2[j]);
                }
                j++;
        }
        int[] union = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            union[k] = result.get(k);
        }
        return union;
    }
}