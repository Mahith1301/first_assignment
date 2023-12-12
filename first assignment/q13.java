//13.Java program to display system time
//from library date we can display time

//from time library

import java.time.LocalDateTime;
import java.util.*;
 
public class q13
{
    public static void main(String args[]){
    Date curr_date=new Date();

    System.out.println(curr_date);

    System.out.println(LocalDateTime.now());

    }

}