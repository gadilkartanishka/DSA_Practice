//Leetcode 119 : Pascal's Triangle II
//Time Complexity : O(n)
//Space Complexity: O(1)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> row = new ArrayList<>();
        long result = 1;
        row.add(1);
        for (int i = 0; i < rowIndex; i++) {
            result = result * (rowIndex - i) / (i + 1);
            row.add((int) result);
        }
        return row;
    }
}