//5.Java program to swap two variables using third variable
//take input numbers from user
 

import java.util.Scanner;
 
public class q5
{
	
    public static void main(String args[]){  
         
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter first integer a = ");
        Integer a=sc.nextInt();  
        System.out.println("enter second integer b = " );
        Integer b=sc.nextInt();
        // Third variable
        int c;
        c=a;            //we are storing first number in temp
        a=b;            //we are assigning second number to firt number
        b=c;            //we are assigning temparary variable to second variable
        System.out.println("after swap ");
        System.out.println("first number a is "+a+"   second number b is "+b);
        
	}}