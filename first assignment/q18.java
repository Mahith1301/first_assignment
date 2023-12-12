//18.	Write a Java program that accepts two integer values from the user and returns the largest value. However, if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.
//taking ages from user
import java.util.Scanner;

public class q18{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number a = ");
        int a=sc.nextInt();
        System.out.println("enter second number b = ");
        int b=sc.nextInt();

        if(a>b){
            System.out.println(a+" is the largest")  ;
        }else if(a<b){
            System.out.println(b+" is the largest")  ;
        }else if (a==b){
            System.out.println("zero")  ;
        }

        if (a%6==b%6){
            if (a>b){
                System.out.println(b+" is the smallest")  ;
            }else{
                System.out.println(a+" is the smallest")  ;
            }
        }


}}