//Leetcode 190- Reverse Bits
//Time Complexity: O(1)
//Space Complexity: O(1)
class Solution {
    public int reverseBits(int n) {
        for(int i=0;i<16;i++){
            int bit1= (n>>i)&1;
            int bit2=(n>>(31-i))&1;

            if(bit1!=bit2){
                n=n^(1<<i);
                n=n^(1<<(31-i));
            }
        }
        return n;
    }
}
