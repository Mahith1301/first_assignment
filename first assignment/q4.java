//4.Java program to print the area and perimeter of a rectangle
//take length and breadth from user
 

import java.util.Scanner;
 
public class q4
{
    public static void main(String args[]){  
        //
        Scanner sc = new Scanner(System.in); 

        System.out.println("enter length = ");

        float l=sc.nextFloat();  
        System.out.println("enter breadth =" );

        float b=sc.nextFloat();
        //area of rectangle is l*b
        System.out.println("area of given rectangle is "+(l*b));
        //perimenter of rectangle is 2*(l+b)
        System.out.println("perimeter of given rectangle is "+(2*(l+b)));

	}}