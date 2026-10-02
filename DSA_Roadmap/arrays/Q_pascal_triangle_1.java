//Time Complexity: O(c)
//Space Complexity: O(1)
class Solution {
    public int pascalTriangleI(int r, int c) {
        int n = r - 1;
        int k = c - 1;

        long result = 1;

        for (int i = 0; i < k; i++) {
            result = result * (n - i) / (i + 1);
        }

        return (int) result;
    }
}