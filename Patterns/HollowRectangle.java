import java.util.*;
public class HollowRectangle{
    public static void print_hollow_rectangle(int rows,int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0||i==rows-1||j==0||j==cols-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter number of cols:");
        int cols=sc.nextInt();
        print_hollow_rectangle(rows, cols);
    }
}
