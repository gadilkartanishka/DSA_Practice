import java.util.*;

/*
Problem: Contains Duplicate
Platform: LeetCode
Difficulty: Easy
Topic: Arrays, Sorting

Approach:
1. Sort the array.
2. After sorting,check adjacent elements for duplicacy.

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
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
        if(containsDuplicate(nums)){
            System.out.println("Array contains duplicate elements");
        }else{
            System.out.println("Array does not contain duplicate elements");
        }
        sc.close();
    }
}
}
