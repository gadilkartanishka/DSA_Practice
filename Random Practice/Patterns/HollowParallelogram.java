/*
     *****
    *   *
   *   *
  *   *
 *****
*/
import java.util.Scanner;
public class HollowParallelogram {
    public static void print_hollow_parallelogram(int rows){
        for(int i=0;i<rows;i++){

            for(int j=1;j<=(rows-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=rows;j++){
                if(i==0 || i==rows-1 || j==1 || j==rows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();
        print_hollow_parallelogram(rows);
        sc.close();
    }
}