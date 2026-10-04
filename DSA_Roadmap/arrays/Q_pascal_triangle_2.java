//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public int[] pascalTriangleII(int r) {

        int[] elements = new int[r];
        int n = r - 1;
        long result = 1;
        elements[0] = 1;

        for (int i = 0; i < n; i++) {
            result = result * (n - i) / (i + 1);
            elements[i + 1] = (int) result;
        }

        return elements;
    }
}