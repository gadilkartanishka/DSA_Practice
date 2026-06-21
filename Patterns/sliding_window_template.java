// Sliding Window -- generic skeleton for variable-size window problems
public class SlidingWindowTemplate {
    public static int solve(String s) {
        int left = 0, best = 0;
        // window state goes here, e.g. int[] count = new int[256];

        for (int right = 0; right < s.length(); right++) {
            // expand: add s.charAt(right) to window state

            while (/* window invalid, shrink it */ false) {
                // remove s.charAt(left) from window state
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
