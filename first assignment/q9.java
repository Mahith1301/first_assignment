//8.convert a binary number to an octal number
//take binary input numbers from user
 

import java.util.Scanner;
 
public class q9
{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter first binary a = ");
        Integer a=sc.nextInt(2);  
        
        String b=new String();
        b=Integer.toHexString(a);

        String c=new String();
        c=Integer.toBinaryString(a);

        System.out.println(c+" binary to hexadecimal "+b);
        
        
        //like in c programming
        
        System.out.printf("%s bin converted to octal %h",c,a);
	}
}