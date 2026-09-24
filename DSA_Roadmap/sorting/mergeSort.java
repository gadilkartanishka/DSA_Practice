//Time Complexity : O(NlogN)
//Space Complexity : O(N)
class Solution {
    public int[] mergeSort(int[] nums) {
        mergeSortHelper(nums,0,nums.length-1);
        return nums;
    }
    private void mergeSortHelper(int[] arr,int low,int high){
        if (low >= high) {
            return;
        }
        int mid=low+(high-low)/2;
        mergeSortHelper(arr,low,mid);
        mergeSortHelper(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    private void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
            }
            else{
                temp[k]=arr[right];
                right++;
            }
            k++;
        }
        while(left<=mid){
                temp[k]=arr[left];
                left++;
                k++;
            }
            while(right<=high){
                temp[k]=arr[right];
                right++;
                k++;
            }
        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }

    }
}