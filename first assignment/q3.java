//3.Java program to print multiplication of given integer from 1 to 10
//take integer from user
 

import java.util.*;
 
public class q3
{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter number =");
        int a=sc.nextInt();  
        System.out.println("the table of "+a+" is \n");
        // using for loop we are going to increase i from 1 to 10
        //printing multiplication table in for loop 
        for (int i=1;i<=10;i++){
            System.out.println(a+ "*"+i+"="+(a*i));
        }
	}}