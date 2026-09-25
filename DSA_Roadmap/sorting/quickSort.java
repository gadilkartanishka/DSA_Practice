//Time Complexity : O(NlogN)
//Space Complexity : O(N)
class Solution {
    public int[] quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSortHelper(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);

        quickSortHelper(arr, low, pivotIndex - 1);
        quickSortHelper(arr, pivotIndex + 1, high);
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }
}