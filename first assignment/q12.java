//12.Java program to print the ASCII value of a given character
//take input char from user
 

import java.util.Scanner;
 
public class q12
{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter character = ");
        char a=sc.next().charAt(0);  
        int ascii=(int)a;   //using type casting to convert into int
        System.out.println("ascii value of "+a+" is "+ascii);

	}}