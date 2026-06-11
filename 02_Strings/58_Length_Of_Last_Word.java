// LeetCode 58 - Length of Last Word
// Time Complexity: O(n) 
// Space Complexity: O(1)
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i-=1;
        }
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i-=1;
        }
        return count;
    }
}