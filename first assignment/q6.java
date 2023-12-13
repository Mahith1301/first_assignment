//6.Java program to swap two variables without using third variable
//take input numbers from user
 

import java.util.Scanner;
 
public class q6
{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter first integer a = ");
        Integer a=sc.nextInt();  
        System.out.println("enter second integer b = " );
        Integer b=sc.nextInt();
        System.out.println("before swap ");
        System.out.println("first number a is "+a+"   second number b is "+b);
        a=a+b;//using aaddition and subtraction we can do swap
        b=a-b;
        a=a-b;

        System.out.println("after swap ");
        System.out.println("first number a is "+a+"   second number b is "+b);
	}
}