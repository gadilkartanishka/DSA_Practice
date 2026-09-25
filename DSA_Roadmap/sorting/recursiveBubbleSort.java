class Solution {
    public int[] bubbleSort(int[] nums) {
        bubbleSortHelper(nums, nums.length);
        return nums;
    }

    private void bubbleSortHelper(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        bubblePass(arr, 0, n);
        bubbleSortHelper(arr, n - 1);
    }

    private void bubblePass(int[] arr, int i, int n) {
        if (i == n - 1) {
            return;
        }

        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        bubblePass(arr, i + 1, n);
    }
}