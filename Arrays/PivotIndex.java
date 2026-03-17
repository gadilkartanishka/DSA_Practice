public class PivotIndex {
    public static int pivotIndex(int[] nums){
        int n=nums.length;
        int sumLeft[]=new int[n];
        int sumRight[]=new int[n];
        sumLeft[0]=0;
        sumRight[n-1]=0;
        for(int i=1;i<nums.length;i++){
            sumLeft[i]=sumLeft[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            sumRight[i]=sumRight[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(sumLeft[i]==sumRight[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[]={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
