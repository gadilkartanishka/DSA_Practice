//Time Complexity: O(n^2)
//Space Complexity: O(1)
class Solution {
    public int[] insertionSort(int[] nums) {
        insertionSortHelper(nums, 1);
        return nums;
    }
    public void insertionSortHelper(int[] arr, int low){
        if(low>=arr.length){
            return;
        }
            int key = arr[low];
            int j = low - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            insertionSortHelper(arr, low+1);
        }
    }
