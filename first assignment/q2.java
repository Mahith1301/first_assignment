//2.Java program to print the sum of two numbers, subtraction, multiplication, division
//take interger from user
 

import java.util.Scanner;
 
public class q2
{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter first number =");
        int a=sc.nextInt();  
        System.out.println("enter second number =");
        int b=sc.nextInt();
        System.out.println("result of addition is "+(a+b));
	    System.out.println("result of subtraction is "+(a-b));
	    System.out.println("result of multiplication is "+(a*b));
	    System.out.println("result of division is "+(a/b));
 
    }  
	}