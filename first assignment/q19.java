//19.Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.

import java.util.Scanner;

public class q19{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number a = ");
        int a=sc.nextInt();
    if (a%2==0){
        System.out.println("even 1");
    }else{
        System.out.println("odd 0");
    }
}}