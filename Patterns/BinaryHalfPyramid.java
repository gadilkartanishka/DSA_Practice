/*
1
01
101
01010
101010
*/
import java.util.Scanner;
public class BinaryHalfPyramid {
    public static void print_binary_half_pyramid(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<i+1;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();
        print_binary_half_pyramid(rows);
        sc.close();
    }
}
