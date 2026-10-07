//Leetcode 73: Set Matrix Zeroes
//Time Complexity : O(M*N)
//Space Complexity: O(1)
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         boolean firstRowZero = false;
//         boolean firstColZero = false;
//         for (int j = 0; j < cols; j++) {
//             if (matrix[0][j] == 0) {
//                 firstRowZero = true;
//                 break;
//             }
//         }
//         for (int i = 0; i < rows; i++) {
//             if (matrix[i][0] == 0) {
//                 firstColZero = true;
//                 break;
//             }
//         }
//         for (int i = 1; i < rows; i++) {
//             for (int j = 1; j < cols; j++) {
//                 if (matrix[i][j] == 0) {
//                     matrix[i][0] = 0;
//                     matrix[0][j] = 0;
//                 }
//             }
//         }
//         for (int i = 1; i < rows; i++) {
//             for (int j = 1; j < cols; j++) {
//                 if (matrix[i][0] == 0 || matrix[0][j] == 0) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//         if (firstRowZero) {
//             for (int j = 0; j < cols; j++) {
//                 matrix[0][j] = 0;
//             }
//         }

//         if (firstColZero) {
//             for (int i = 0; i < rows; i++) {
//                 matrix[i][0] = 0;
//             }
//         }
//     }
// }
//Brute force
class Solution {
    public int[][] setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] row=new int[n];
        int[] col=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1||col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
        return matrix;
    }
}