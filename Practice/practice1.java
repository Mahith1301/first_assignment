package Practice;

public class practice1 {
    public static void main(String args[]){
        String str1=new String("Java");

        int length =str1.length();
        System.out.println(length);

        String str2=str1.toLowerCase();
        System.out.println(str2);

        String str3=str1.toUpperCase();
        System.out.println(str3);

        String str4="   welcome   ";
        str4=str4.trim();
        System.out.println(str4);
    }
    
}
