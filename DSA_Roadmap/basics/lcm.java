//brute force approach
class Solution {
    public int LCM(int n1, int n2) {
        int num = Math.max(n1, n2);
        while (num % n1 != 0 || num % n2 != 0) {
            num++;
        }
        return num;
    }
}