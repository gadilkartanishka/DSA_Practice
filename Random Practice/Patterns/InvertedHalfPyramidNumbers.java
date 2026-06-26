/*
12345
1234
123
12
1
 */
import java.util.*;
public class InvertedHalfPyramidNumbers {
    public static void print_inverted_pyramid_numbers(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter max number:");
        int rows=sc.nextInt();
        print_inverted_pyramid_numbers(rows);
        sc.close();
    }
}
