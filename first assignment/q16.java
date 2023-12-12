//16.Write a program triangle star Pattern.
//take no of rows we need
import java.util.Scanner;

public class q16{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of row we need ");
        int row=sc.nextInt();
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}}