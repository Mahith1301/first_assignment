//10.Java program to compare two numbers.
//take input numbers from user
 

import java.util.*;
 
public class q10
{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter first integer a = ");
        Integer a=sc.nextInt();  
        System.out.println("enter second integer b = " );
        Integer b=sc.nextInt();
        //using if else to find greatest
        if (a>b){
        System.out.println("first number is greater than second number");  
        }else{
        System.out.println("second number is greater than first number");
        }
	}
}