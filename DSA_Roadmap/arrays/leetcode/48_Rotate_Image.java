//Leetcode 48 : Rotate Image
//Time Complexity : O(N^2)
//Space Complexity : O(1)
class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        //reverse
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix[i].length-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
    }
}