//Time Complexity : O(NlogN)
//Space Complexity : O(N)
class Solution {
    public int[] sortQuick(int[] nums){
        quickSort(0, nums.length-1, nums);
        return nums;
    }
    public void quickSort(int low,int high,int[] arr){
        if(low>=high){
            return;
        }
        int pivotIdx=quickSortHelper(low, high, arr);
        quickSort(low, pivotIdx-1, arr);
        quickSort(pivotIdx+1, high, arr);
    }
    public int quickSortHelper(int low,int high,int[] arr){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<pivot && i<=high){
                i++;
            }
            while(arr[j]>pivot && j>=low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
}