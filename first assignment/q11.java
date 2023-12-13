//11.Java program to count letters, spaces, numbers and other characters in an input string
//take input string from user
 

import java.util.Scanner;
 
public class q11
{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter string = ");
        String a=sc.nextLine();  
        int letters=0;
        int spaces=0;
        int numbers=0;
        int others=0;
        //using for loop for traversal
        //checking wheiter letter digit or space in if else loop[]
        System.out.println(a);
        char[] ch =a.toCharArray();
        for (int i=0;i<a.length();i++){
            if (Character.isLetter(ch[i])){
                letters++;
            }else if (Character.isDigit(ch[i])){
                numbers++;
            }else if(Character.isSpaceChar(ch[i])){
                spaces++;
            }else {
                others++;
            }
        }
            //diplay 
            System.out. println("letters = "+letters);
            System.out. println("spaces = "+spaces);
            System.out. println("numbers = "+numbers);
            System.out. println("others = "+others);
	}}