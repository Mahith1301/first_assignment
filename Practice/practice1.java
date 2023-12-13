package Practice;
import java.util.*;
import java.math.*;


class practice1 {
            Scanner sc=new Scanner(System.in);
    public static void main(String args[]){

        student s1=new student();


        s1.setdetails();
        s1.getdetails();

        
}
}
class student{
    private int rollnum;
    private String name;
    
    public int m1,m2,m3;

    Scanner sc=new Scanner(System.in);


    student(){
        System.out.println("object created");
         System.out.println("constructor called");       
        

    }
    public void setdetails(){

        System.out.println("student name");
        name=sc.nextLine();

        System.out.println("roll number");
        rollnum=sc.nextInt();

    }


    public void getdetails(){
        System.out.println("roll number is "+rollnum+" name is  "+name);

    }


    
}







