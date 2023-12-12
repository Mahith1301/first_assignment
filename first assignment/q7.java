//7.Write a Java program to add two binary numbers and divide them.
//take binary input numbers from user
 

import java.util.*;
 
public class q7
{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        //integer to binary conversion directly
        System.out.println("enter first binary a = ");
        Integer a=sc.nextInt(2);  
        System.out.println("enter second binary b = " );
        Integer b=sc.nextInt(2);

        int sum=a+b;
        int division=a/b;

        //sum and division
        String y=new String();
        y=Integer.toBinaryString(sum);
        System.out.println("bin sum = "+y);
        System.out.println("sum = "+sum);
    


        //integer to string and we are storing binary in string
        String x=new String();
        x=Integer.toBinaryString(division);
        System.out.println("division = "+division);
        System.out.println("binary division = "+x);
        
	}
}