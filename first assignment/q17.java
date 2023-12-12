//16.Write a program triangle star Pattern.
//take no of rows we need
import java.util.Scanner;

public class q17{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of row we need ");
        int a=sc.nextInt();
        for (int i=a-1;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}}