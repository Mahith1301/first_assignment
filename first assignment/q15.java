//15.	Take input of age of 3 people by user and determine oldest and youngest among them.
//taking ages from user
import java.util.Scanner;

public class q15{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first person age");
        int a=sc.nextInt();
        System.out.println("enter first person age");
        int b=sc.nextInt();
        System.out.println("enter first person age");
        int c=sc.nextInt();

        //these nested if else is to find oldest amoung three members
        if (a>b &&a>c){
            System.out.println("first is oldest");
        }else if(b>c){
            System.out.println("second is oldest");
        }else{
            System.out.println("third is oldest");
        }

        //these nested if else is to find youngest
        if (a<b &&a<c){
            System.out.println("first is youngest");
        }else if(b<c){
            System.out.println("second is youngest");
        }else{
            System.out.println("third is youngest");

    }
}}