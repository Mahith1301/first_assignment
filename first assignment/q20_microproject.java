//20.Java program to accept a order from menu
import java.util.Scanner;

public class q20_microproject{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        for(;;){
        System.out.println(" ENTER 1 FOR VEG   ENTER 2 FOR NON-VEG   ENTER 3 FOR BEVERAGES   ENTER 0 FOR THATS IT");
        int a=sc.nextInt();
        if(a==0){
            System.out.println("THANK YOU FOR CHOSING THIS RESTAURANT");
        }
        if(a==1){
            System.out.println("VEG OPTIONS");
            System.out.print(" ENTER 1 FOR ROTI ENTER 2 FOR PANEER ENTER 3 FOR FRIED RICE");
            int b=sc.nextInt();
            if(b==1){
                System.out.println("ROTI PREPARED AND SERVED");
            }else if(b==2){
                System.out.println("PANEER PREPARED AND SERVED");
            }else if(b==3){
                System.out.println("FRIED PREPARED AND SERVED");
            }else{
                System.out.println("INVALID OPTION TRY AGAIN");
            }
            

        }else if(a==2){
            System.out.println("NON VEG VEG OPTIONS");
            System.out.print(" ENTER 1 FOR BIRYANI ENTER 2 FOR EGG CURRY ENTER 3 FOR CHICKEN FRY"); 
            int b=sc.nextInt();
            if(b==1){
                System.out.println("BIRYANI PREPARED AND SERVED");
            }else if(b==2){
                System.out.println("EGG CURRY PREPARED AND SERVED");
            }else if(b==3){
                System.out.println("CHICKEN FRY PREPARED AND SERVED");
            }else{
                System.out.println("INVALID OPTION TRY AGAIN");
            }
        }else if(a==3){
            System.out.println("BEVERAGES OPTIONS");
            System.out.print(" ENTER 1 FOR PEPSI  ENTER 2 FOR COKE   ENTER 3 FOR SPRITE"); 
             int b=sc.nextInt();
            if(b==1){
                System.out.println("PEPSI SERVED");
            }else if(b==2){
                System.out.println("COKE SERVED");
            }else if(b==3){
                System.out.println("SPRITE SERVED");
            }else{
                System.out.println("INVALID OPTION TRY AGAIN");
            }
        
        }else{
            System.out.println("INVALID OPTION");
            break;
        }

        }

}}