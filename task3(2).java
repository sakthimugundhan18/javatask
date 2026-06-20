import java.io.*;
import java.util.*;

class task3(2)

{
 public static void main (String[]args)

 { 
   System.out.println("welcome! enter your ticket number");
   Scanner s=new Scanner(System.in);

   System.out.println("enter movie name:");
   String movie=s.next();
 
   System.out.println("enter your ticket no:");
   String ticket=s.next();

   if(movie.equals("leo") && ticket.equals("18") || (movie.equals("master") && ticket.equals("17")))
    { 
     System.out.println("valid!,allowed");
     }
   else
       {
        System.out.println("oops sorry your ticket is invalid");
       }
  }
}
