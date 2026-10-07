//Leetcode 73: Set Matrix Zeroes
//Brute force
//Time Complexity: O(M*N)
//Space Complexity: O(M+N)
// class Solution {
//     public int[][] setZeroes(int[][] matrix) {
//         int n=matrix.length;
//         int m=matrix[0].length;
//         int[] row=new int[n];
//         int[] col=new int[m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==0){
//                     row[i]=1;
//                     col[j]=1;
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(row[i]==1||col[j]==1){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//         return matrix;
//     }
// }
//Optimal Approach
//Time Complexity : O(M*N)
//Space Complexity: O(1)
//row matrix[..][0]
//col matrix[0][..]
class Solution {
    public int[][] setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                        col0=0;
                    }    
                }
            }
        }
        //row and column excluding markers
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0||matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        //col
        if(matrix[0][0]==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        //row
        if(col0==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
    return matrix;
}
}