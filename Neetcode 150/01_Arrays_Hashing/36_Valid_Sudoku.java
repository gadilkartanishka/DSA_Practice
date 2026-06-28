//Leetcode 36 - Valid Sudoku
//Time Complexity: O(1) since the input size is fixed (9x9)
//Space Complexity: O(1) since the input size is fixed (9x9)
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rowSet=new HashSet[9];
        HashSet<Character>[] colSet=new HashSet[9];
        HashSet<Character>[] boxSet=new HashSet[9];

        for(int i=0;i<9;i++){
            rowSet[i]=new HashSet<>();
            colSet[i]=new HashSet<>();
            boxSet[i]=new HashSet<>();
        }

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char num=board[r][c];
                if(num=='.'){
                    continue;
                }
                int box=(r/3)*3+(c/3);
                if(rowSet[r].contains(num)||colSet[c].contains(num)||boxSet[box].contains(num)){
                    return false;
                }
                rowSet[r].add(num);
                colSet[c].add(num);
                boxSet[box].add(num);
            }
        }
        return true;
    }
}

