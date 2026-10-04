//Leetcode 118 : Pascal's Triangle
//Time Complexity : O(N^2)
//Space Complexity: O(N^2)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if (i > 1) {
                List<Integer> previous = triangle.get(i - 1);

                for (int j = 0; j < i - 1; j++) {

                    int left = previous.get(j);
                    int right = previous.get(j + 1);

                    int sum = left + right;

                    row.add(sum);
                }
            }
            if (i > 0) {
                row.add(1);
            }
            triangle.add(row);
        }
        return triangle;
    }
}