import java.util.*;
/*
Problem: Two Sum
Platform: LeetCode
Difficulty: Easy
Topic: Arrays

Approach:
Brute Force - Check every pair.
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        int res[] = twoSum(nums,target);

        if(res.length == 2){
            System.out.println("Indices: [" + res[0] + ", " + res[1] + "]");
        } else {
            System.out.println("No solution found");
        }

        sc.close();
    }
}