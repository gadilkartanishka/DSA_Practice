/*
    *
   **
  ***
 ****
*****
*/
import java.util.*;
public class RightHalfPyramid {
    public static void print_half_pyramid(int rows){
        for(int i = 1; i <= rows; i++){
            // print spaces
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            // print stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        print_half_pyramid(rows);
    }
}