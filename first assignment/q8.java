//8.convert a binary number to an octal number
//take binary input numbers from user
 

import java.util.*;
 
public class q8
{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter first binary a = ");
        Integer a=sc.nextInt(2);  
        
        String b=new String();
        b=Integer.toOctalString(a);

        String c=new String();
        c=Integer.toBinaryString(a);

        System.out.println(c+" binary to octal "+b);


        //like in c programming
        
        System.out.printf("%s bin converted to octal %o",c,a);
        
	}
} 
    
