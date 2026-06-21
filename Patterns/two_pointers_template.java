// Two Pointers -- generic skeleton for opposite-end convergence problems
public class TwoPointersTemplate {
    public static int solve(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // process arr[left], arr[right]
            if (/* move left? */ true) {
                left++;
            } else {
                right--;
            }
        }
        return -1; // placeholder
    }
}
