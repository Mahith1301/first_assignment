//14.	Write a Java program to print numbers between 1 and 100 divisible by 3, 5



public class q14 {
    public static void main(String args[]){
        //loop for 1 to 100
        System.out.println("for 3 and 5 combined");
        for (int i=1;i<=100;i++){
            //checking divisibility for both 3 and 5 combined 
            if (i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
        System.out.println("for 3");
        for (int i=1;i<=100;i++){
            //checking divisibility for 3  
            if (i%3==0){
                System.out.println(i);
            }
        }
        System.out.println("for 5");
        for (int i=1;i<=100;i++){
            //checking divisibility for 3  
            if (i%5==0){
                System.out.println(i);
            }
        }
    }
}
