//Brute force
// class Solution {
//     public int LCM(int n1, int n2) {
//         int num = Math.max(n1, n2);
//         while (num % n1 != 0 || num % n2 != 0) {
//             num++;
//         }
//         return num;
//     }
// }
//OPTIMUM APPROACH
class Solution {
    public int GCD(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }

        return n1;
    }
}